// @GENERATOR:play-routes-compiler
// @SOURCE:C:/livros/conf/routes
// @DATE:Sun Apr 29 15:03:05 BRT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
