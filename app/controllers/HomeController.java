package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;

    // Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {

        // Get the list of products
        List<Product> productsList = Product.findAll();

        // Render the list products view, passing parameters
        return ok(index.render(productsList));
    }

    public Result addProduct() {
        // Create a form by wrapping the Product class in a FormFactory form instance
        Form<Product> productForm = formFactory.form(Product.class);

        return ok(addProduct.render(productForm));
    }

    public Result addProductSubmit() {

        // Retrieve the submitted form object (bind from the HTTP request)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for errors (based on constraints set in the Product class)
        if(newProductForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(addProduct.render(newProductForm));
        } else {
            // No errors found - extract the Product details from the form
            Product newProduct = newProductForm.get();

        // A new, unsaved product will not have an id    
        if (newProduct.getId() == null) {
            // Save the object to the Products table
            newProduct.save();
        }
        else if (newProduct.getId() != null) {
            // Product exists
            newProduct.update();
        }    
            // Set a success message in flash
            flash("success", "Product "+ newProduct.getName() + " was added");

            return redirect(controllers.routes.HomeController.index());
        }
    }

    public Result deleteProduct(String id){

        // find product by id and call delete method
        Product.find.ref(id).delete();

        // Add message to flash session
        flash("success", "Product has been deleted");

        // Redirect to index page
        return redirect(routes.HomeController.index());
    }

    @Transactional
    public Result updateProduct(String id) {

        Product p;
        Form<Product> productForm;

        try {
            // Find the product by id
            p = Product.find.byId(id);

            //Create a form based on the Product class and fill using p
            productForm = formFactory.form(Product.class).fill(p);

        } catch (Exception ex) {
            // Display an error message or page
            return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(addProduct.render(productForm));
    }

}
