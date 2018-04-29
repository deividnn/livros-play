// @GENERATOR:play-routes-compiler
// @SOURCE:C:/livros/conf/routes
// @DATE:Sun Apr 29 11:52:42 BRT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseLivroController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def cadastrar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cadastrar")
    }
  
    // @LINE:10
    def atualizarLivro(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "editar")
    }
  
    // @LINE:6
    def excluir(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "excluir/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def editar(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:11
    def pesquisarLivro(): Call = {
      
      Call("POST", _prefix)
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def adicionarLivro(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cadastrar")
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
