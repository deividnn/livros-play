// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/deivid/Documents/GitHub/livros-play/conf/routes
// @DATE:Sun Apr 29 14:52:50 BRT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  LivroController_1: controllers.LivroController,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    LivroController_1: controllers.LivroController,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, LivroController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LivroController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LivroController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """excluir/""" + "$" + """id<[^/]+>""", """controllers.LivroController.excluir(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editar/""" + "$" + """id<[^/]+>""", """controllers.LivroController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar""", """controllers.LivroController.cadastrar()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar""", """controllers.LivroController.adicionarLivro()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editar""", """controllers.LivroController.atualizarLivro()"""),
    ("""POST""", this.prefix, """controllers.LivroController.pesquisarLivro()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_LivroController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LivroController_index0_invoker = createInvoker(
    LivroController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~
 Home page""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_LivroController_excluir1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("excluir/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LivroController_excluir1_invoker = createInvoker(
    LivroController_1.excluir(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "excluir",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """excluir/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LivroController_editar2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LivroController_editar2_invoker = createInvoker(
    LivroController_1.editar(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "editar",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """editar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LivroController_cadastrar3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar")))
  )
  private[this] lazy val controllers_LivroController_cadastrar3_invoker = createInvoker(
    LivroController_1.cadastrar(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "cadastrar",
      Nil,
      "GET",
      this.prefix + """cadastrar""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LivroController_adicionarLivro4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar")))
  )
  private[this] lazy val controllers_LivroController_adicionarLivro4_invoker = createInvoker(
    LivroController_1.adicionarLivro(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "adicionarLivro",
      Nil,
      "POST",
      this.prefix + """cadastrar""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LivroController_atualizarLivro5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editar")))
  )
  private[this] lazy val controllers_LivroController_atualizarLivro5_invoker = createInvoker(
    LivroController_1.atualizarLivro(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "atualizarLivro",
      Nil,
      "POST",
      this.prefix + """editar""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LivroController_pesquisarLivro6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LivroController_pesquisarLivro6_invoker = createInvoker(
    LivroController_1.pesquisarLivro(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "pesquisarLivro",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_LivroController_index0_route(params@_) =>
      call { 
        controllers_LivroController_index0_invoker.call(LivroController_1.index())
      }
  
    // @LINE:6
    case controllers_LivroController_excluir1_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroController_excluir1_invoker.call(LivroController_1.excluir(id))
      }
  
    // @LINE:7
    case controllers_LivroController_editar2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroController_editar2_invoker.call(LivroController_1.editar(id))
      }
  
    // @LINE:8
    case controllers_LivroController_cadastrar3_route(params@_) =>
      call { 
        controllers_LivroController_cadastrar3_invoker.call(LivroController_1.cadastrar())
      }
  
    // @LINE:9
    case controllers_LivroController_adicionarLivro4_route(params@_) =>
      call { 
        controllers_LivroController_adicionarLivro4_invoker.call(LivroController_1.adicionarLivro())
      }
  
    // @LINE:10
    case controllers_LivroController_atualizarLivro5_route(params@_) =>
      call { 
        controllers_LivroController_atualizarLivro5_invoker.call(LivroController_1.atualizarLivro())
      }
  
    // @LINE:11
    case controllers_LivroController_pesquisarLivro6_route(params@_) =>
      call { 
        controllers_LivroController_pesquisarLivro6_invoker.call(LivroController_1.pesquisarLivro())
      }
  
    // @LINE:14
    case controllers_Assets_at7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_0.at(path, file))
      }
  }
}
