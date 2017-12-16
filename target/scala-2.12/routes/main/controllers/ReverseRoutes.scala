
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/WMDD1Lab11CRUD/conf/routes
// @DATE:Sat Dec 16 17:14:01 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(cat:String = "0"): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("cat", cat)))))
    }
  
    // @LINE:10
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProductSubmit")
    }
  
    // @LINE:13
    def updateProduct(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:7
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProduct")
    }
  
    // @LINE:16
    def deleteProduct(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:18
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:18
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
