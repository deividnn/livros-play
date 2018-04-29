
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

object cadastrar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.3*/layout("Cadastrar Livro")/*1.28*/{_display_(Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<html>
<head>
<title>Cadastrar Livro</title>
</head>
<body>
	<h1>Cadastrar Livro</h1>
	
	<form method="POST" action=""""),_display_(/*9.31*/routes/*9.37*/.LivroController.adicionarLivro()),format.raw/*9.70*/("""">

		<div class="form-group">
			<label for="titulo">Titulo:</label> """),_display_(/*12.41*/helper/*12.47*/.CSRF.formField),format.raw/*12.62*/(""" """),format.raw/*12.63*/("""<input
				type="text" name="titulo" required="required" placeholder="Titutlo"
				autofocus="true" class="form-control" size="30" maxlength="50" />
		</div>
		<div class="form-group">
			<label for="autor">Autor:</label> """),_display_(/*17.39*/helper/*17.45*/.CSRF.formField),format.raw/*17.60*/(""" """),format.raw/*17.61*/("""<input
				type="text" name="autor" required="required" placeholder="Autor"
				class="form-control" size="30" maxlength="50" />
		</div>
		<button class="btn btn-primary" >Adicionar Livro</button>
	</form>
	<br />
	<p>
		<a href="/" class="btn btn-danger">Voltar</a>
	</p>
</body>
</html>
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 29 13:45:40 BRT 2018
                  SOURCE: C:/livros/app/views/cadastrar.scala.html
                  HASH: 5439212b3fcfc96650bb9141456bc54d3dd84118
                  MATRIX: 1034->2|1067->27|1105->28|1133->30|1284->155|1298->161|1351->194|1452->268|1467->274|1503->289|1532->290|1787->518|1802->524|1838->539|1867->540|2200->843
                  LINES: 33->1|33->1|33->1|34->2|41->9|41->9|41->9|44->12|44->12|44->12|44->12|49->17|49->17|49->17|49->17|61->29
                  -- GENERATED --
              */
          