
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

<title>Online Shop - """),_display_(/*12.23*/title),format.raw/*12.28*/("""</title>

<!-- Boostrap CSS -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">


  <!-- jQuery library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


  <!-- Popper JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>


  <!-- Latest compiled JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

  <!-- Custom CSS --> <link href=""""),_display_(/*30.36*/routes/*30.42*/.Assets.versioned("stylesheets/main.css")),format.raw/*30.83*/("""" rel="stylesheet">

  <!-- Font Awesome Icons -->
  <script src="https://use.fontawesome.com/d1e651d256.js"></script>

</head>

<body>

    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
        
        <a class="navbar-brand" href="#">Online Shop</a>
        
              <ul class="navbar-nav mr-auto">
        
                <li """),_display_(/*45.22*/if(title=="Products")/*45.43*/{_display_(Seq[Any](format.raw/*45.44*/("""class="active"""")))}),format.raw/*45.59*/(""" """),format.raw/*45.60*/("""class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*46.48*/routes/*46.54*/.HomeController.index()),format.raw/*46.77*/("""">Products
                    </a>
                  </li>
        

                  <li class="nav-item">
                    <a class="nav-link" href="#">About
                    </a>
                  </li>

                  <li class="nav-item">
                    <a class="nav-link" href="#">Services
                    </a>
                  </li>
        
                  <li class="nav-item">
                    <a class="nav-link" href="#">Contact
                    </a>
                  </li>

                  <li """),_display_(/*66.24*/if(title=="Login")/*66.42*/{_display_(Seq[Any](format.raw/*66.43*/("""class="active"""")))}),format.raw/*66.58*/(""" """),format.raw/*66.59*/("""class="nav-item">
                    """),_display_(/*67.22*/if(user != null)/*67.38*/ {_display_(Seq[Any](format.raw/*67.40*/("""
                      """),format.raw/*68.23*/("""<a class="nav-link" href=""""),_display_(/*68.50*/routes/*68.56*/.LoginController.logout()),format.raw/*68.81*/("""">Logout """),_display_(/*68.91*/user/*68.95*/.getName()),format.raw/*68.105*/("""</a>
                    """)))}/*69.23*/else/*69.27*/{_display_(Seq[Any](format.raw/*69.28*/("""
                    """),format.raw/*70.21*/("""<a class="nav-link" href=""""),_display_(/*70.48*/routes/*70.54*/.LoginController.login()),format.raw/*70.78*/("""">Login
                    </a>
                  """)))}),format.raw/*72.20*/("""
                  """),format.raw/*73.19*/("""</li>

              </ul>
                      
          </nav>

<container>

<row>

<div class="col-md-12">

<p class="lead">Product Catalogue</p>

"""),_display_(/*87.2*/content),format.raw/*87.9*/("""

"""),format.raw/*89.1*/("""</div>

</row>

</container>

<container>

<row>

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</row>

</container>
<script src=""""),_display_(/*108.15*/routes/*108.21*/.Assets.versioned("javascripts/main.js")),format.raw/*108.61*/(""""></script>"
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 20:26:51 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab11CRUD/app/views/main.scala.html
                  HASH: 4d44035b105402e35c54cc00e0f99c3c1209655b
                  MATRIX: 970->1|1120->56|1148->58|1341->224|1367->229|1995->830|2010->836|2072->877|2449->1227|2479->1248|2518->1249|2564->1264|2593->1265|2685->1330|2700->1336|2744->1359|3312->1900|3339->1918|3378->1919|3424->1934|3453->1935|3519->1974|3544->1990|3584->1992|3635->2015|3689->2042|3704->2048|3750->2073|3787->2083|3800->2087|3832->2097|3877->2124|3890->2128|3929->2129|3978->2150|4032->2177|4047->2183|4092->2207|4175->2259|4222->2278|4401->2431|4428->2438|4457->2440|4643->2598|4659->2604|4721->2644
                  LINES: 28->1|33->1|35->3|44->12|44->12|62->30|62->30|62->30|77->45|77->45|77->45|77->45|77->45|78->46|78->46|78->46|98->66|98->66|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|100->68|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|102->70|104->72|105->73|119->87|119->87|121->89|140->108|140->108|140->108
                  -- GENERATED --
              */
          