package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// Product entity managed bt the ORM
@Entity
public class Category extends Model {

    // Properties
    // Annotate id as the Primary Key
    @Id
    private String id;

    @Constraints.Required
    private String name;

    @OneToMany
    private List<Product> products;

    // Default Constructor
    public Category(){
    }

    public Category(String id, String name, List<Product> products){
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Product> getProduct(){
        return products;
    }

    public void setProduct(List<Product> products){
        this.products = products;
    }


    public static Finder<String, Category> find = new Finder<String, Category>(Category.class);


    public static List<Category> findAll(){
        return Category.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        for(Category c: Category.findAll()) {
            options.put(c.getId().toString(), c.getName());
        }
        return options;
    }
}