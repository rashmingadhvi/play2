// @SOURCE:C:/RashMin/work/Test1/conf/routes
// @HASH:d7e6da77351ce379b0515e59682d01197598ca70
// @DATE:Tue May 31 17:05:58 EDT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:5
package controllers {

// @LINE:5
class ReverseTestController {


// @LINE:5
def test(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                        

}
                          
}
                  


// @LINE:5
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:5
class ReverseTestController {


// @LINE:5
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TestController.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

}
              
}
        


// @LINE:5
package controllers.ref {


// @LINE:5
class ReverseTestController {


// @LINE:5
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TestController]).test(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TestController", "test", Seq(), "GET", """""", _prefix + """test""")
)
                      

}
                          
}
        
    