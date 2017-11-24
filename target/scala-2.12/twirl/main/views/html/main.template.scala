
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

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
        
                <li class="nav-item">
                    <a class="nav-link active" href="#"><span class="fa fa-desktop" aria-hidden="true">About
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

              </ul>
                      
          </nav>

<container>

<row>

<div class="col-md-12">

<p class="lead">Product Catalogue</p>

"""),_display_(/*72.2*/content),format.raw/*72.9*/("""

"""),format.raw/*74.1*/("""</div>

</row>

</container>

<container>

<row>

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</row>

</container>
<script src=""""),_display_(/*93.15*/routes/*93.21*/.Assets.versioned("javascripts/main.js")),format.raw/*93.61*/(""""></script>"
</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 23:37:28 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab9CRUD/app/views/main.scala.html
                  HASH: a475d0322658a1493f78dc2d8510853005fc8d6a
                  MATRIX: 952->1|1077->31|1105->33|1298->199|1324->204|1952->805|1967->811|2029->852|3038->1835|3065->1842|3094->1844|3279->2002|3294->2008|3355->2048
                  LINES: 28->1|33->1|35->3|44->12|44->12|62->30|62->30|62->30|104->72|104->72|106->74|125->93|125->93|125->93
                  -- GENERATED --
              */
          