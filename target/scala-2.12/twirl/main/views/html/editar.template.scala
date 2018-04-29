
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

object editar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Livro,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(livro:Livro):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/(""" """),_display_(/*1.17*/layout("Atualizar Livro")/*1.42*/{_display_(Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*2.1*/("""<html>
<head>
<title>Atualizar Livro</title>
</head>
<body>
	<h1>Atualizar Livro</h1>
	<form method="POST" action=""""),_display_(/*8.31*/routes/*8.37*/.LivroController.atualizarLivro()),format.raw/*8.70*/("""">
		<div class="form-group">
			<label for="idc">Codigo:</label> """),_display_(/*10.38*/helper/*10.44*/.CSRF.formField),format.raw/*10.59*/(""" """),format.raw/*10.60*/("""<input
				type="text" name="idc" placeholder="Codigo" disabled="disabled"
				class="form-control" value='"""),_display_(/*12.34*/livro/*12.39*/.id),format.raw/*12.42*/("""' size="10" /> <input
				type="hidden" name="id" value='"""),_display_(/*13.37*/livro/*13.42*/.id),format.raw/*13.45*/("""' />
		</div>
		<div class="form-group">
			<label for="titulo">Titulo:</label> """),_display_(/*16.41*/helper/*16.47*/.CSRF.formField),format.raw/*16.62*/(""" """),format.raw/*16.63*/("""<input
				type="text" name="titulo" required="required" placeholder="Titutlo"
				autofocus="true" value='"""),_display_(/*18.30*/livro/*18.35*/.titulo),format.raw/*18.42*/("""' class="form-control"
				size="30" maxlength="50" />
		</div>
		<div class="form-group">
			<label for="autor">Autor:</label> """),_display_(/*22.39*/helper/*22.45*/.CSRF.formField),format.raw/*22.60*/(""" """),format.raw/*22.61*/("""<input
				type="text" name="autor" required="required" placeholder="Autor"
				value='"""),_display_(/*24.13*/livro/*24.18*/.autor),format.raw/*24.24*/("""' class="form-control" size="30" maxlength="50" />
		</div>
		<button class="btn btn-primary">Atualizar Livro</button>
	</form>
	<br />
	<p>
		<a href="/" class="btn btn-danger">Voltar</a>
	</p>
</body>
</html>
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(livro:Livro): play.twirl.api.HtmlFormat.Appendable = apply(livro)

  def f:((Livro) => play.twirl.api.HtmlFormat.Appendable) = (livro) => apply(livro)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 29 13:49:55 BRT 2018
                  SOURCE: C:/livros/app/views/editar.scala.html
                  HASH: d0eee7bba2afca7810261ed7e809025ad81ead8e
                  MATRIX: 948->1|1056->14|1084->16|1117->41|1155->42|1183->44|1331->166|1345->172|1398->205|1494->274|1509->280|1545->295|1574->296|1711->406|1725->411|1749->414|1835->473|1849->478|1873->481|1984->565|1999->571|2035->586|2064->587|2201->697|2215->702|2243->709|2403->842|2418->848|2454->863|2483->864|2600->954|2614->959|2641->965|2893->1187
                  LINES: 28->1|33->1|33->1|33->1|33->1|34->2|40->8|40->8|40->8|42->10|42->10|42->10|42->10|44->12|44->12|44->12|45->13|45->13|45->13|48->16|48->16|48->16|48->16|50->18|50->18|50->18|54->22|54->22|54->22|54->22|56->24|56->24|56->24|66->34
                  -- GENERATED --
              */
          