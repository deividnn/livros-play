
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Livro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(livros:List[Livro]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/(""" """),_display_(/*1.24*/layout("Lista de Livros")/*1.49*/{_display_(Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*2.1*/("""<html>
<head>
<title>Lista de Livros</title>
</head>
<body>
	<h1>Lista de Livros</h1>
	<p>
		<a href="cadastrar" class="btn btn-primary">Cadastrar Livro</a>
	</p>

	<form method="POST" action=""""),_display_(/*12.31*/routes/*12.37*/.LivroController.pesquisarLivro()),format.raw/*12.70*/(""""
		class="form-inline">

		<div class="form-group">

			"""),_display_(/*17.5*/helper/*17.11*/.CSRF.formField),format.raw/*17.26*/(""" """),format.raw/*17.27*/("""<input type="text" name="valor"
				placeholder="Pesquisar titulo e autor" autofocus="true"
				class="form-control" size="50" />

		</div>

		<button class="btn btn-primary">Pesquisar Livro</button>
	</form>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Codigo</th>
				<th scope="col">Titulo</th>
				<th scope="col">Autor</th>
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		"""),_display_(/*36.4*/for(livro<-livros) yield /*36.22*/{_display_(Seq[Any](format.raw/*36.23*/("""
		"""),format.raw/*37.3*/("""<tr>
			<td>"""),_display_(/*38.9*/livro/*38.14*/.id),format.raw/*38.17*/("""</td>
			<td>"""),_display_(/*39.9*/livro/*39.14*/.titulo),format.raw/*39.21*/("""</td>
			<td>"""),_display_(/*40.9*/livro/*40.14*/.autor),format.raw/*40.20*/("""</td>
			<td><a href="excluir/"""),_display_(/*41.26*/livro/*41.31*/.id),format.raw/*41.34*/("""" class="btn btn-danger btn-sm"
				class="confirmation">excluir</a></td>
			<td><a href="editar/"""),_display_(/*43.25*/livro/*43.30*/.id),format.raw/*43.33*/("""" class="btn btn-warning btn-sm">editar</a></td>
		</tr>
		""")))}),format.raw/*45.4*/("""
	"""),format.raw/*46.2*/("""</table>
</body>
</html>
""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(livros:List[Livro]): play.twirl.api.HtmlFormat.Appendable = apply(livros)

  def f:((List[Livro]) => play.twirl.api.HtmlFormat.Appendable) = (livros) => apply(livros)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 29 13:45:40 BRT 2018
                  SOURCE: C:/livros/app/views/index.scala.html
                  HASH: b0254bcef9e0dbf7fb8f815cbb9f21f077e2600f
                  MATRIX: 953->1|1068->21|1096->23|1129->48|1167->49|1195->51|1426->255|1441->261|1495->294|1584->357|1599->363|1635->378|1664->379|2130->819|2164->837|2203->838|2234->842|2274->856|2288->861|2312->864|2353->879|2367->884|2395->891|2436->906|2450->911|2477->917|2536->949|2550->954|2574->957|2701->1057|2715->1062|2739->1065|2831->1127|2861->1130|2920->1159
                  LINES: 28->1|33->1|33->1|33->1|33->1|34->2|44->12|44->12|44->12|49->17|49->17|49->17|49->17|68->36|68->36|68->36|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|75->43|75->43|75->43|77->45|78->46|81->49
                  -- GENERATED --
              */
          