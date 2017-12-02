
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add product")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new product</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.105*/ {_display_(Seq[Any](format.raw/*8.107*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""

    """),_display_(/*11.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*11.81*/("""
    """),_display_(/*12.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*12.95*/("""
    """),_display_(/*13.6*/select(
        productForm("category.id"),
        options(Category.options),
        '_label -> "Category", '_default -> "-- Choose a category --",
        '_showConstraints -> false, 'class -> "form-control"
    )),format.raw/*18.6*/("""
    """),_display_(/*19.6*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*19.83*/("""
    """),_display_(/*20.6*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*20.83*/("""

    """),_display_(/*22.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.70*/("""

    """),format.raw/*24.5*/("""<div class="actions">
        <input type="submit" value="Add/Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*26.19*/routes/*26.25*/.HomeController.index("0")),format.raw/*26.51*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
    """)))}),format.raw/*30.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 20:47:54 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab10CRUD/app/views/addProduct.scala.html
                  HASH: b5089380f545da03ab96a80d0dc682158e25dd03
                  MATRIX: 967->1|1075->41|1120->36|1150->58|1178->61|1205->80|1244->82|1276->88|1347->134|1455->233|1495->235|1527->242|1539->246|1569->256|1604->265|1700->340|1733->347|1843->436|1876->443|2117->664|2150->671|2248->748|2281->755|2379->832|2414->841|2499->905|2534->913|2684->1036|2699->1042|2746->1068|2886->1178
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|41->9|41->9|43->11|43->11|44->12|44->12|45->13|50->18|51->19|51->19|52->20|52->20|54->22|54->22|56->24|58->26|58->26|58->26|62->30
                  -- GENERATED --
              */
          