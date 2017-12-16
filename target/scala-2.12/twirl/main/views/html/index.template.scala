
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /* Parameters */
  def apply/*1.19*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.111*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products Page", user)/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""

"""),format.raw/*6.1*/("""<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <!-- A link to display all the products -->
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index("0")),format.raw/*11.49*/("""" class="list-group-item">All categories</a>
      <!-- Start of for loop - for each c in categories add a list item  -->
      <!-- Also show the number of products in each category -->
      """),_display_(/*14.8*/for(c <- categories) yield /*14.28*/{_display_(Seq[Any](format.raw/*14.29*/(""" 
        """),format.raw/*15.9*/("""<a href=""""),_display_(/*15.19*/routes/*15.25*/.HomeController.index(c.getId)),format.raw/*15.55*/("""" class="list-group-item">"""),_display_(/*15.82*/c/*15.83*/.getName),format.raw/*15.91*/("""
        """),format.raw/*16.9*/("""<span class="badge">"""),_display_(/*16.30*/c/*16.31*/.getProduct.size()),format.raw/*16.49*/("""</span>
      </a>
        """)))}),format.raw/*18.10*/("""
    """),format.raw/*19.5*/("""</ul>
  </div>
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
            """),_display_(/*69.14*/if(user != null)/*69.30*/{_display_(Seq[Any](format.raw/*69.31*/("""
            """),format.raw/*70.13*/("""<td>
              <a href=""""),_display_(/*71.25*/routes/*71.31*/.HomeController.updateProduct(p.getId)),format.raw/*71.69*/("""" class="button-xs btn-danger">
                <span class="fa fa-pencil"></span>
              </a>
            </td>
            <!-- Delete product button -->
            <td>
              <a href=""""),_display_(/*77.25*/routes/*77.31*/.HomeController.deleteProduct(p.getId)),format.raw/*77.69*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                <span class="fa fa-trash"></span>
              </a>
            </td>
          """)))}),format.raw/*81.12*/("""
        """),format.raw/*82.9*/("""</tr>
        """)))}),format.raw/*83.10*/(""" """),format.raw/*83.28*/("""
      """),format.raw/*84.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*89.17*/routes/*89.23*/.HomeController.addProduct()),format.raw/*89.51*/("""">
        <button type="button" class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 20:34:49 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab11CRUD/app/views/index.scala.html
                  HASH: 46ab17845c636a13a5c0f065cb65eaebffad2b46
                  MATRIX: 1015->18|1203->110|1231->112|1291->145|1319->146|1365->165|1393->166|1421->167|1468->189|1503->216|1542->218|1570->220|1759->382|1774->388|1821->414|2041->608|2077->628|2116->629|2153->639|2190->649|2205->655|2256->685|2310->712|2320->713|2349->721|2385->730|2433->751|2443->752|2482->770|2541->798|2573->803|2660->926|2689->928|2731->960|2772->962|2804->967|2871->1008|2885->1013|2921->1028|2953->1033|2995->1045|3028->1051|3475->1493|3504->1565|3544->1578|3578->1596|3618->1598|3647->1599|3696->1621|3706->1622|3733->1628|3783->1651|3793->1652|3822->1660|3872->1683|3882->1684|3923->1704|3973->1727|3983->1728|4019->1743|4069->1766|4079->1767|4109->1776|4182->1822|4230->1849|4318->1910|4343->1926|4382->1927|4423->1940|4479->1969|4494->1975|4553->2013|4784->2217|4799->2223|4858->2261|5050->2422|5086->2431|5132->2446|5161->2464|5195->2471|5270->2519|5285->2525|5334->2553
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|38->6|43->11|43->11|43->11|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|47->15|48->16|48->16|48->16|48->16|50->18|51->19|56->24|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|90->58|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|100->69|100->69|100->69|101->70|102->71|102->71|102->71|108->77|108->77|108->77|112->81|113->82|114->83|114->83|115->84|120->89|120->89|120->89
                  -- GENERATED --
              */
          