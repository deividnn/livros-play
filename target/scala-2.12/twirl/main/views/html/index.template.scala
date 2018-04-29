
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
<p>
	<a href="cadastrar" class="btn btn-primary">Cadastrar Livro</a>
</p>
<form method="POST" action=""""),_display_(/*6.30*/routes/*6.36*/.LivroController.pesquisarLivro()),format.raw/*6.69*/(""""
	class="form-inline">
	<div class="form-group">
		"""),_display_(/*9.4*/helper/*9.10*/.CSRF.formField),format.raw/*9.25*/(""" """),format.raw/*9.26*/("""<input type="text" name="valor"
			placeholder="Pesquisar titulo e autor" autofocus="true"
			class="form-control" size="50" />
	</div>
	<button class="btn btn-primary">Pesquisar Livro</button>
</form>
<div class="table-responsive-md">
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
		"""),_display_(/*26.4*/for(livro<-livros) yield /*26.22*/{_display_(Seq[Any](format.raw/*26.23*/("""
		"""),format.raw/*27.3*/("""<tr>
			<td>"""),_display_(/*28.9*/livro/*28.14*/.id),format.raw/*28.17*/("""</td>
			<td>"""),_display_(/*29.9*/livro/*29.14*/.titulo),format.raw/*29.21*/("""</td>
			<td>"""),_display_(/*30.9*/livro/*30.14*/.autor),format.raw/*30.20*/("""</td>
			<td><a href="excluir/"""),_display_(/*31.26*/livro/*31.31*/.id),format.raw/*31.34*/("""" class="btn btn-danger btn-sm">excluir</a></td>
			<td><a href="editar/"""),_display_(/*32.25*/livro/*32.30*/.id),format.raw/*32.33*/("""" class="btn btn-warning btn-sm">editar</a></td>
		</tr>
		""")))}),format.raw/*34.4*/("""
	"""),format.raw/*35.2*/("""</table>
</div>
""")))}),format.raw/*37.2*/("""
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
                  DATE: Sun Apr 29 16:32:03 BRT 2018
                  SOURCE: C:/livros/app/views/index.scala.html
                  HASH: a2d4e8c26fc2e8003142e343c05af6343b2a0f92
                  MATRIX: 953->1|1068->21|1096->23|1129->48|1167->49|1195->51|1353->183|1367->189|1420->222|1501->278|1515->284|1550->299|1578->300|2068->764|2102->782|2141->783|2172->787|2212->801|2226->806|2250->809|2291->824|2305->829|2333->836|2374->851|2388->856|2415->862|2474->894|2488->899|2512->902|2613->976|2627->981|2651->984|2743->1046|2773->1049|2822->1068
                  LINES: 28->1|33->1|33->1|33->1|33->1|34->2|38->6|38->6|38->6|41->9|41->9|41->9|41->9|58->26|58->26|58->26|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|66->34|67->35|69->37
                  -- GENERATED --
              */
          