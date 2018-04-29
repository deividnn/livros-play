
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
"""),format.raw/*2.1*/("""<h1>Cadastrar Livro</h1>

<form method="POST" action=""""),_display_(/*4.30*/routes/*4.36*/.LivroController.adicionarLivro()),format.raw/*4.69*/("""">

	<div class="form-group">
		<label for="titulo">Titulo:</label> """),_display_(/*7.40*/helper/*7.46*/.CSRF.formField),format.raw/*7.61*/(""" """),format.raw/*7.62*/("""<input
			type="text" name="titulo" required="required" placeholder="Titutlo"
			autofocus="true" class="form-control" size="30" maxlength="50" />
	</div>
	<div class="form-group">
		<label for="autor">Autor:</label> """),_display_(/*12.38*/helper/*12.44*/.CSRF.formField),format.raw/*12.59*/(""" """),format.raw/*12.60*/("""<input
			type="text" name="autor" required="required" placeholder="Autor"
			class="form-control" size="30" maxlength="50" />
	</div>
	<button class="btn btn-primary">Adicionar Livro</button>
</form>
<br />
<p>
	<a href="/" class="btn btn-danger">Voltar</a>
</p>
""")))}),format.raw/*22.2*/("""
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
                  DATE: Sun Apr 29 15:03:06 BRT 2018
                  SOURCE: C:/livros/app/views/cadastrar.scala.html
                  HASH: 7b9eae5d7cb14bb767cc482f61cb30556a621d4e
                  MATRIX: 1034->2|1067->27|1105->28|1133->30|1216->87|1230->93|1283->126|1381->198|1395->204|1430->219|1458->220|1708->443|1723->449|1759->464|1788->465|2093->740
                  LINES: 33->1|33->1|33->1|34->2|36->4|36->4|36->4|39->7|39->7|39->7|39->7|44->12|44->12|44->12|44->12|54->22
                  -- GENERATED --
              */
          