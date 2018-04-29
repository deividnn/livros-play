
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<html>

<head>
<title>"""),_display_(/*5.9*/title),format.raw/*5.14*/("""</title>

<link rel="stylesheet" media="screen"
	href='"""),_display_(/*8.9*/routes/*8.15*/.Assets.at("css/bootstrap.min.css")),format.raw/*8.50*/("""'>
	
</head>

<body>
	<div class="container">"""),_display_(/*13.26*/content),format.raw/*13.33*/("""</div>


	<script src='"""),_display_(/*16.16*/routes/*16.22*/.Assets.at("js/jquery-3.3.1.min.js")),format.raw/*16.58*/("""'
		type="text/javascript"></script>
	<script src='"""),_display_(/*18.16*/routes/*18.22*/.Assets.at("js/bootstrap.min.js")),format.raw/*18.55*/("""'
		type="text/javascript"></script>
	<script type="text/javascript">
		
	</script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 29 13:41:29 BRT 2018
                  SOURCE: C:/livros/app/views/layout.scala.html
                  HASH: 4a421dbe12fafeb0bf5f8e492d63029b6ffb6672
                  MATRIX: 954->1|1079->31|1107->33|1158->59|1183->64|1267->123|1281->129|1336->164|1414->215|1442->222|1496->249|1511->255|1568->291|1649->345|1664->351|1718->384
                  LINES: 28->1|33->1|34->2|37->5|37->5|40->8|40->8|40->8|45->13|45->13|48->16|48->16|48->16|50->18|50->18|50->18
                  -- GENERATED --
              */
          