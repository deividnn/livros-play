// @GENERATOR:play-routes-compiler
// @SOURCE:C:/livros/conf/routes
// @DATE:Sun Apr 29 11:52:42 BRT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:5
  class ReverseLivroController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def cadastrar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.cadastrar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar"})
        }
      """
    )
  
    // @LINE:10
    def atualizarLivro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.atualizarLivro",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editar"})
        }
      """
    )
  
    // @LINE:6
    def excluir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.excluir",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "excluir/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:7
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.editar",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editar/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:11
    def pesquisarLivro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.pesquisarLivro",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def adicionarLivro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.adicionarLivro",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
