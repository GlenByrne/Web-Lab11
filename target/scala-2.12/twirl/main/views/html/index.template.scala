
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /* Parameters */
  def apply/*1.19*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products Page")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""

"""),format.raw/*6.1*/("""<p class="lead">Product Catalogue</p>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <!-- A link to display all the products -->
      <a href=""""),_display_(/*12.17*/routes/*12.23*/.HomeController.index("0")),format.raw/*12.49*/("""" class="list-group-item">All categories</a>
      <!-- Start of for loop - for each c in categories add a list item  -->
      <!-- Also show the number of products in each category -->
      """),_display_(/*15.8*/for(c
      <- categories) yield /*16.21*/{_display_(Seq[Any](format.raw/*16.22*/(""" 
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.HomeController.index(c.getId)),format.raw/*17.55*/("""" class="list-group-item">"""),_display_(/*17.82*/c/*17.83*/.getName),format.raw/*17.91*/("""
        """),format.raw/*18.9*/("""<span class="badge">"""),_display_(/*18.30*/c/*18.31*/.getProduct.size()),format.raw/*18.49*/("""</span>
      </a>
        """)))}),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""</ul>
  </div>
  <div class="col-sm-10">
    """),format.raw/*24.69*/(""" """),_display_(/*24.71*/if(flash.containsKey("success"))/*24.103*/ {_display_(Seq[Any](format.raw/*24.105*/("""
    """),format.raw/*25.5*/("""<div class="alert alert-success">
      """),_display_(/*26.8*/flash/*26.13*/.get("success")),format.raw/*26.28*/("""
    """),format.raw/*27.5*/("""</div>
    """)))}),format.raw/*28.6*/("""

    """),format.raw/*30.5*/("""<!-- HTML content for the index view -->
    <table class="table table-bordered table-hover table-condensed">

      <thead>

        <!-- The header row-->

        <tr>

          <th>ID</th>

          <th>Name</th>

          <th>Category</th>

          <th>Description</th>

          <th>Stock</th>

          <th>Price</th>

        </tr>

      </thead>

      <tbody>

        <!-- Product row(s) -->
        """),format.raw/*58.32*/(""" """),format.raw/*59.47*/(""" 
          """),_display_(/*60.12*/for(p <- products) yield /*60.30*/ {_display_(Seq[Any](format.raw/*60.32*/(""" """),format.raw/*60.33*/("""<tr>
            <td>"""),_display_(/*61.18*/p/*61.19*/.getId),format.raw/*61.25*/("""</td>
            <td>"""),_display_(/*62.18*/p/*62.19*/.getName),format.raw/*62.27*/("""</td>
            <td>"""),_display_(/*63.18*/p/*63.19*/.getCategory.getName),format.raw/*63.39*/("""</td>
            <td>"""),_display_(/*64.18*/p/*64.19*/.getDescription),format.raw/*64.34*/("""</td>
            <td>"""),_display_(/*65.18*/p/*65.19*/.getStock),format.raw/*65.28*/("""</td>
            <td class="numeric">&euro; """),_display_(/*66.41*/("%.2f".format(p.getPrice))),format.raw/*66.68*/("""</td>

            <!-- Edit product button -->
            <td>
              <a href=""""),_display_(/*70.25*/routes/*70.31*/.HomeController.updateProduct(p.getId)),format.raw/*70.69*/("""" class="button-xs btn-danger">
                <span class="fa fa-pencil"></span>
              </a>
            </td>
            <!-- Delete product button -->
            <td>
              <a href=""""),_display_(/*76.25*/routes/*76.31*/.HomeController.deleteProduct(p.getId)),format.raw/*76.69*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                <span class="fa fa-trash"></span>
              </a>
            </td>
        </tr>
        """)))}),format.raw/*81.10*/(""" """),format.raw/*81.28*/("""
      """),format.raw/*82.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*87.17*/routes/*87.23*/.HomeController.addProduct()),format.raw/*87.51*/("""">
        <button type="button" class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 20:35:40 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab10CRUD/app/views/index.scala.html
                  HASH: 88ad349d181a0283e3848f06fcf0ac27d34eb80d
                  MATRIX: 997->18|1159->85|1187->87|1247->120|1275->121|1321->140|1349->141|1377->142|1424->164|1453->185|1492->187|1520->189|1747->389|1762->395|1809->421|2029->615|2071->641|2110->642|2147->652|2184->662|2199->668|2250->698|2304->725|2314->726|2343->734|2379->743|2427->764|2437->765|2476->783|2535->811|2567->816|2640->925|2669->927|2711->959|2752->961|2784->966|2851->1007|2865->1012|2901->1027|2933->1032|2975->1044|3008->1050|3455->1492|3484->1564|3524->1577|3558->1595|3598->1597|3627->1598|3676->1620|3686->1621|3713->1627|3763->1650|3773->1651|3802->1659|3852->1682|3862->1683|3903->1703|3953->1726|3963->1727|3999->1742|4049->1765|4059->1766|4089->1775|4162->1821|4210->1848|4326->1937|4341->1943|4400->1981|4631->2185|4646->2191|4705->2229|4909->2402|4938->2420|4972->2427|5047->2475|5062->2481|5111->2509
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|38->6|44->12|44->12|44->12|47->15|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|90->58|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|101->70|101->70|101->70|107->76|107->76|107->76|112->81|112->81|113->82|118->87|118->87|118->87
                  -- GENERATED --
              */
          