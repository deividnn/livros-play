
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
"""),format.raw/*2.1*/("""<h1>Atualizar Livro</h1>
<form method="POST" action=""""),_display_(/*3.30*/routes/*3.36*/.LivroController.atualizarLivro()),format.raw/*3.69*/("""">
	<div class="form-group">
		<label for="idc">Codigo:</label> """),_display_(/*5.37*/helper/*5.43*/.CSRF.formField),format.raw/*5.58*/(""" """),format.raw/*5.59*/("""<input
			type="text" name="idc" placeholder="Codigo" disabled="disabled"
			class="form-control" value='"""),_display_(/*7.33*/livro/*7.38*/.id),format.raw/*7.41*/("""' size="10" /> <input
			type="hidden" name="id" value='"""),_display_(/*8.36*/livro/*8.41*/.id),format.raw/*8.44*/("""' />
	</div>
	<div class="form-group">
		<label for="titulo">Titulo:</label> """),_display_(/*11.40*/helper/*11.46*/.CSRF.formField),format.raw/*11.61*/(""" """),format.raw/*11.62*/("""<input
			type="text" name="titulo" required="required" placeholder="Titutlo"
			autofocus="true" value='"""),_display_(/*13.29*/livro/*13.34*/.titulo),format.raw/*13.41*/("""' class="form-control" size="30"
			maxlength="50" />
	</div>
	<div class="form-group">
		<label for="autor">Autor:</label> """),_display_(/*17.38*/helper/*17.44*/.CSRF.formField),format.raw/*17.59*/(""" """),format.raw/*17.60*/("""<input
			type="text" name="autor" required="required" placeholder="Autor"
			value='"""),_display_(/*19.12*/livro/*19.17*/.autor),format.raw/*19.23*/("""' class="form-control" size="30" maxlength="50" />
	</div>
	<button class="btn btn-primary">Atualizar Livro</button>
</form>
<br />
<p>
	<a href="/" class="btn btn-danger">Voltar</a>
</p>
""")))}),format.raw/*27.2*/("""
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
                  DATE: Sun Apr 29 14:52:50 BRT 2018
                  SOURCE: C:/Users/deivid/Documents/GitHub/livros-play/app/views/editar.scala.html
                  HASH: 1bb46a6d9bea5cb4d864bbc4f2519138456a4cdd
                  MATRIX: 948->1|1056->14|1084->16|1117->41|1155->42|1183->44|1264->99|1278->105|1331->138|1424->205|1438->211|1473->226|1501->227|1635->335|1648->340|1671->343|1755->401|1768->406|1791->409|1899->490|1914->496|1950->511|1979->512|2114->620|2128->625|2156->632|2312->761|2327->767|2363->782|2392->783|2507->871|2521->876|2548->882|2775->1079
                  LINES: 28->1|33->1|33->1|33->1|33->1|34->2|35->3|35->3|35->3|37->5|37->5|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8|43->11|43->11|43->11|43->11|45->13|45->13|45->13|49->17|49->17|49->17|49->17|51->19|51->19|51->19|59->27
                  -- GENERATED --
              */
          