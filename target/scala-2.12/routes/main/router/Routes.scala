
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab11CRUD/conf/routes
// @DATE:Sat Dec 16 17:14:01 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:18
  LoginController_2: controllers.LoginController,
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:18
    LoginController_2: controllers.LoginController,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(cat:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProduct""", """controllers.HomeController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProductSubmit""", """controllers.HomeController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProduct(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProduct(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_addProduct1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct1_invoker = createInvoker(
    HomeController_0.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_addProductSubmit2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProductSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProductSubmit2_invoker = createInvoker(
    HomeController_0.addProductSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """addProductSubmit""",
      """ Data submitted b the form""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_updateProduct3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProduct3_invoker = createInvoker(
    HomeController_0.updateProduct(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProduct",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateProduct/""" + "$" + """id<[^/]+>""",
      """ Update a product by id""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_deleteProduct4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProduct4_invoker = createInvoker(
    HomeController_0.deleteProduct(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProduct",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteProduct/""" + "$" + """id<[^/]+>""",
      """Delete a product by an id passed as a parameter""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_login5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login5_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_loginSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit6_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_logout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout7_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[String]("cat", Some("0"))) { (cat) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(cat))
      }
  
    // @LINE:7
    case controllers_HomeController_addProduct1_route(params@_) =>
      call { 
        controllers_HomeController_addProduct1_invoker.call(HomeController_0.addProduct)
      }
  
    // @LINE:10
    case controllers_HomeController_addProductSubmit2_route(params@_) =>
      call { 
        controllers_HomeController_addProductSubmit2_invoker.call(HomeController_0.addProductSubmit)
      }
  
    // @LINE:13
    case controllers_HomeController_updateProduct3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateProduct3_invoker.call(HomeController_0.updateProduct(id))
      }
  
    // @LINE:16
    case controllers_HomeController_deleteProduct4_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteProduct4_invoker.call(HomeController_0.deleteProduct(id))
      }
  
    // @LINE:18
    case controllers_LoginController_login5_route(params@_) =>
      call { 
        controllers_LoginController_login5_invoker.call(LoginController_2.login)
      }
  
    // @LINE:19
    case controllers_LoginController_loginSubmit6_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit6_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:20
    case controllers_LoginController_logout7_route(params@_) =>
      call { 
        controllers_LoginController_logout7_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:23
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
