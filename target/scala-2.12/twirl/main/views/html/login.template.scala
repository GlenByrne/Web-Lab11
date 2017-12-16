
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <div class="col-xs-4">
        <h3>Sign in</h3>
        <!-- Display login errors if they exist -->
        """),_display_(/*10.10*/if(loginForm.hasGlobalErrors)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
                """),_display_(/*12.18*/loginForm/*12.27*/.globalError.message),format.raw/*12.47*/("""
            """),format.raw/*13.13*/("""</p>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""<p class="alert alert-warning">
                """),_display_(/*17.18*/flash/*17.23*/.get("loginRequired")),format.raw/*17.44*/("""
            """),format.raw/*18.13*/("""</p>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""<!-- the login form -->
    """),_display_(/*21.6*/helper/*21.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.76*/ {_display_(Seq[Any](format.raw/*21.78*/("""
        """),format.raw/*22.37*/("""
        """),format.raw/*23.94*/("""
        """),_display_(/*24.10*/CSRF/*24.14*/.formField),format.raw/*24.24*/("""

        """),format.raw/*26.9*/("""<div class="form-group">
            """),_display_(/*27.14*/inputText(loginForm("email"), 'label -> "", 'class -> "form-control col-sm-12", 'placeholder -> "Email")),format.raw/*27.118*/("""
        """),format.raw/*28.9*/("""</div>

        <div class="form-group">
            """),_display_(/*31.14*/inputPassword(loginForm("password"), 'label -> "", 'class -> "form-control col-sm-12", 'placeholder -> "Password")),format.raw/*31.128*/("""
        """),format.raw/*32.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*36.6*/(""" """),format.raw/*36.24*/("""
    """),format.raw/*37.5*/("""</div>
    <!-- End of content for login -->
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 20:29:43 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab11CRUD/app/views/login.scala.html
                  HASH: 60ebbf1e14c247f4b8d4c59e049879f44b0201e3
                  MATRIX: 984->1|1119->66|1164->63|1192->83|1221->157|1249->160|1276->179|1314->180|1346->186|1531->344|1569->373|1609->375|1651->389|1728->439|1746->448|1787->468|1829->482|1875->497|1913->508|1952->538|1992->540|2034->554|2111->604|2125->609|2167->630|2209->644|2255->659|2292->669|2348->699|2363->705|2436->769|2476->771|2514->809|2552->904|2590->915|2603->919|2634->929|2673->941|2739->980|2865->1084|2902->1094|2986->1151|3122->1265|3159->1275|3327->1413|3356->1431|3389->1437
                  LINES: 28->1|31->2|34->1|35->3|36->4|37->5|37->5|37->5|38->6|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|53->21|53->21|53->21|53->21|54->22|55->23|56->24|56->24|56->24|58->26|59->27|59->27|60->28|63->31|63->31|64->32|68->36|68->36|69->37
                  -- GENERATED --
              */
          