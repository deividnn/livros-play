
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
"""),format.raw/*2.1*/("""<h1>Lista de Livros</h1>
<p><a href="cadastrar" class="btn btn-primary">Cadastrar Livro</a></p>
<form method="POST" action=""""),_display_(/*4.30*/routes/*4.36*/.LivroController.pesquisarLivro()),format.raw/*4.69*/(""""
	class="form-inline">
	<div class="form-group">
		"""),_display_(/*7.4*/helper/*7.10*/.CSRF.formField),format.raw/*7.25*/(""" """),format.raw/*7.26*/("""<input type="text" name="valor"
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
	"""),_display_(/*23.3*/for(livro<-livros) yield /*23.21*/{_display_(Seq[Any](format.raw/*23.22*/("""
	"""),format.raw/*24.2*/("""<tr>
		<td>"""),_display_(/*25.8*/livro/*25.13*/.id),format.raw/*25.16*/("""</td>
		<td>"""),_display_(/*26.8*/livro/*26.13*/.titulo),format.raw/*26.20*/("""</td>
		<td>"""),_display_(/*27.8*/livro/*27.13*/.autor),format.raw/*27.19*/("""</td>
		<td><a href="excluir/"""),_display_(/*28.25*/livro/*28.30*/.id),format.raw/*28.33*/("""" class="btn btn-danger btn-sm"
			class="confirmation">excluir</a></td>
		<td><a href="editar/"""),_display_(/*30.24*/livro/*30.29*/.id),format.raw/*30.32*/("""" class="btn btn-warning btn-sm">editar</a></td>
	</tr>
	""")))}),format.raw/*32.3*/("""
"""),format.raw/*33.1*/("""</table>
""")))}),format.raw/*34.2*/("""
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
                  DATE: Sun Apr 29 14:52:51 BRT 2018
                  SOURCE: C:/Users/deivid/Documents/GitHub/livros-play/app/views/index.scala.html
                  HASH: 18293af51ee3a70369f7c60aec66f56bf74c9b56
                  MATRIX: 953->1|1068->21|1096->23|1129->48|1167->49|1195->51|1348->178|1362->184|1415->217|1496->273|1510->279|1545->294|1573->295|2017->713|2051->731|2090->732|2120->735|2159->748|2173->753|2197->756|2237->770|2251->775|2279->782|2319->796|2333->801|2360->807|2418->838|2432->843|2456->846|2581->944|2595->949|2619->952|2709->1012|2738->1014|2779->1025
                  LINES: 28->1|33->1|33->1|33->1|33->1|34->2|36->4|36->4|36->4|39->7|39->7|39->7|39->7|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|62->30|62->30|62->30|64->32|65->33|66->34
                  -- GENERATED --
              */
          