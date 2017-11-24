
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /* Parameters */
  def apply/*2.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.34*/("""

"""),format.raw/*4.1*/("""<!-- Pass page title and content """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""html between braces"""),format.raw/*4.54*/("""}"""),format.raw/*4.55*/(""" """),format.raw/*4.56*/("""to the main view -->
"""),_display_(/*5.2*/main("Products Page")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
  
  """),format.raw/*7.67*/("""
  """),_display_(/*8.4*/if(flash.containsKey("success"))/*8.36*/ {_display_(Seq[Any](format.raw/*8.38*/("""
    """),format.raw/*9.5*/("""<div class="alert alert-success">
      """),_display_(/*10.8*/flash/*10.13*/.get("success")),format.raw/*10.28*/("""
    """),format.raw/*11.5*/("""</div>
  """)))}),format.raw/*12.4*/("""

  """),format.raw/*14.3*/("""<!-- HTML content for the index view -->
  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),format.raw/*40.26*/("""
  """),format.raw/*41.66*/("""

  """),_display_(/*43.4*/for(p <- products) yield /*43.22*/ {_display_(Seq[Any](format.raw/*43.24*/("""
    """),format.raw/*44.5*/("""<tr>
      <td>"""),_display_(/*45.12*/p/*45.13*/.getId),format.raw/*45.19*/("""</td>
      <td>"""),_display_(/*46.12*/p/*46.13*/.getName),format.raw/*46.21*/("""</td>
      <td>"""),_display_(/*47.12*/p/*47.13*/.getDescription),format.raw/*47.28*/("""</td>
      <td>"""),_display_(/*48.12*/p/*48.13*/.getStock),format.raw/*48.22*/("""</td>
      <td class="numeric">&euro; """),_display_(/*49.35*/("%.2f".format(p.getPrice))),format.raw/*49.62*/("""</td>

      <!-- Edit product button -->
      <td>
        <a href=""""),_display_(/*53.19*/routes/*53.25*/.HomeController.updateProduct(p.getId)),format.raw/*53.63*/("""" class="button-xs btn-danger">
          <span class="fa fa-pencil"></span>
        </a>
      </td>
      <!-- Delete product button -->
      <td>
        <a href=""""),_display_(/*59.19*/routes/*59.25*/.HomeController.deleteProduct(p.getId)),format.raw/*59.63*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
          <span class="fa fa-trash"></span>
        </a>
      </td>
    </tr>
  """)))}),format.raw/*64.4*/(""" """),format.raw/*64.22*/("""
  """),format.raw/*65.3*/("""</tbody>
  
  </table>
  
  <p>
    <a href=""""),_display_(/*70.15*/routes/*70.21*/.HomeController.addProduct()),format.raw/*70.49*/("""">
      <button type="button" class="btn btn-primary">Add a product</button>
    </a>
  </p>
  """)))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 23:37:28 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab9CRUD/app/views/index.scala.html
                  HASH: 048d0b472092a429453d1eb56cc3484d0e1d3262
                  MATRIX: 974->18|1101->50|1129->52|1189->85|1217->86|1263->105|1291->106|1319->107|1366->129|1395->150|1434->152|1467->222|1496->226|1536->258|1575->260|1606->265|1673->306|1687->311|1723->326|1755->331|1795->341|1826->345|2184->698|2215->764|2246->769|2280->787|2320->789|2352->794|2395->810|2405->811|2432->817|2476->834|2486->835|2515->843|2559->860|2569->861|2605->876|2649->893|2659->894|2689->903|2756->943|2804->970|2902->1041|2917->1047|2976->1085|3171->1253|3186->1259|3245->1297|3420->1442|3449->1460|3479->1463|3552->1509|3567->1515|3616->1543
                  LINES: 28->2|33->2|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|45->14|71->40|72->41|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|84->53|84->53|84->53|90->59|90->59|90->59|95->64|95->64|96->65|101->70|101->70|101->70
                  -- GENERATED --
              */
          