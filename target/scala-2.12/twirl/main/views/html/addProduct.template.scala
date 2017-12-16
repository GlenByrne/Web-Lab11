
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add product", user)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
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

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 17:14:02 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab11CRUD/app/views/addProduct.scala.html
                  HASH: 7b4aa2c5d525721a78ce31d9eccc1008077fb81a
                  MATRIX: 985->1|1118->66|1163->61|1193->83|1221->86|1254->111|1293->113|1325->119|1396->165|1504->264|1544->266|1576->273|1588->277|1618->287|1653->296|1749->371|1782->378|1892->467|1925->474|2166->695|2199->702|2297->779|2330->786|2428->863|2463->872|2548->936|2583->944|2733->1067|2748->1073|2795->1099|2935->1209
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|41->9|41->9|43->11|43->11|44->12|44->12|45->13|50->18|51->19|51->19|52->20|52->20|54->22|54->22|56->24|58->26|58->26|58->26|62->30
                  -- GENERATED --
              */
          