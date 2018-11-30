
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

object apply extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Job,Form[ApplyForm],Form[SearchForm],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(job: Job, applyForm: Form[ApplyForm], searchForm: Form[SearchForm], index: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.82*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<style>
* """),format.raw/*6.3*/("""{"""),format.raw/*6.4*/("""box-sizing: border-box;"""),format.raw/*6.27*/("""}"""),format.raw/*6.28*/("""

"""),format.raw/*8.1*/("""body """),format.raw/*8.6*/("""{"""),format.raw/*8.7*/("""
  """),format.raw/*9.3*/("""margin: 0;
  font-family: Arial, Helvetica, sans-serif;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""

"""),format.raw/*13.1*/(""".topnav """),format.raw/*13.9*/("""{"""),format.raw/*13.10*/("""
  """),format.raw/*14.3*/("""overflow: hidden;
  background-color: #e9e9e9;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

"""),format.raw/*18.1*/(""".topnav a """),format.raw/*18.11*/("""{"""),format.raw/*18.12*/("""
  """),format.raw/*19.3*/("""float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""

"""),format.raw/*28.1*/(""".topnav a:hover """),format.raw/*28.17*/("""{"""),format.raw/*28.18*/("""
  """),format.raw/*29.3*/("""background-color: #ddd;
  color: black;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""

"""),format.raw/*33.1*/(""".topnav a.active """),format.raw/*33.18*/("""{"""),format.raw/*33.19*/("""
  """),format.raw/*34.3*/("""background-color: #2196F3;
  color: white;
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""

"""),format.raw/*38.1*/(""".topnav input[type=text] """),format.raw/*38.26*/("""{"""),format.raw/*38.27*/("""
  """),format.raw/*39.3*/("""float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  border: none;
  font-size: 17px;
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""

"""),format.raw/*47.1*/("""screen and (max-width: 1920px) """),format.raw/*47.32*/("""{"""),format.raw/*47.33*/("""
  """),format.raw/*48.3*/(""".topnav a, .topnav input[type=text] """),format.raw/*48.39*/("""{"""),format.raw/*48.40*/("""
    """),format.raw/*49.5*/("""float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  """),format.raw/*55.3*/("""}"""),format.raw/*55.4*/("""
  """),format.raw/*56.3*/(""".topnav input[type=text] """),format.raw/*56.28*/("""{"""),format.raw/*56.29*/("""
    """),format.raw/*57.5*/("""border: 1px solid #ccc;
  """),format.raw/*58.3*/("""}"""),format.raw/*58.4*/("""
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""
"""),format.raw/*60.1*/("""</style>

<body>

<div class="topnav">
  <a class="active" href=""""),_display_(/*65.28*/routes/*65.34*/.MainController.main()),format.raw/*65.56*/("""">Home</a>
  <a href=""""),_display_(/*66.13*/routes/*66.19*/.JobController.listJobs()),format.raw/*66.44*/("""">Jobs</a>
  <a href=""""),_display_(/*67.13*/routes/*67.19*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*67.97*/("""">Profile</a>
  """),_display_(/*68.4*/helper/*68.10*/.form(routes.JobController.search())/*68.46*/ {_display_(Seq[Any](format.raw/*68.48*/("""
    """),_display_(/*69.6*/helper/*69.12*/.CSRF.formField),format.raw/*69.27*/("""
    """),_display_(/*70.6*/helper/*70.12*/.inputText(searchForm("searchTerms"))),format.raw/*70.49*/("""

    """),format.raw/*72.5*/("""<button type="submit">Search</button>
  """)))}),format.raw/*73.4*/("""
  """),format.raw/*74.3*/("""<a href=""""),_display_(/*74.13*/routes/*74.19*/.ProfileController.logOut()),format.raw/*74.46*/("""">Log Out</a>
</div>
<body>
  <h3>Apply to """),_display_(/*77.17*/job/*77.20*/.getTitle()),format.raw/*77.31*/("""</h3>
  """),_display_(/*78.4*/helper/*78.10*/.form(routes.JobController.applyToJob(index))/*78.55*/{_display_(Seq[Any](format.raw/*78.56*/("""
    """),_display_(/*79.6*/helper/*79.12*/.CSRF.formField),format.raw/*79.27*/("""
    """),format.raw/*80.5*/("""<p>Please upload your file and any additional comments you would like to make</p>
    """),_display_(/*81.6*/helper/*81.12*/.inputFile(field=applyForm("resume"))),format.raw/*81.49*/("""
    """),_display_(/*82.6*/helper/*82.12*/.textarea(field=applyForm("comments"))),format.raw/*82.50*/("""
    """),format.raw/*83.5*/("""<button type="submit">Apply</button>
  """)))}),format.raw/*84.4*/("""
  """),format.raw/*85.3*/("""</body>
  </html>
"""))
      }
    }
  }

  def render(job:Job,applyForm:Form[ApplyForm],searchForm:Form[SearchForm],index:Int): play.twirl.api.HtmlFormat.Appendable = apply(job,applyForm,searchForm,index)

  def f:((Job,Form[ApplyForm],Form[SearchForm],Int) => play.twirl.api.HtmlFormat.Appendable) = (job,applyForm,searchForm,index) => apply(job,applyForm,searchForm,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 17:54:49 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/apply.scala.html
                  HASH: c7e530f8fd63cd76daa3046aee4f6e911b9f36c7
                  MATRIX: 982->1|1157->81|1187->85|1259->131|1286->132|1336->155|1364->156|1394->160|1425->165|1452->166|1482->170|1567->228|1595->229|1626->233|1661->241|1690->242|1721->246|1797->295|1825->296|1856->300|1894->310|1923->311|1954->315|2123->457|2151->458|2182->462|2226->478|2255->479|2286->483|2355->525|2383->526|2414->530|2459->547|2488->548|2519->552|2591->597|2619->598|2650->602|2703->627|2732->628|2763->632|2902->744|2930->745|2961->749|3020->780|3049->781|3080->785|3144->821|3173->822|3206->828|3347->942|3375->943|3406->947|3459->972|3488->973|3521->979|3575->1006|3603->1007|3632->1009|3660->1010|3689->1012|3787->1083|3802->1089|3845->1111|3896->1135|3911->1141|3957->1166|4008->1190|4023->1196|4122->1274|4166->1292|4181->1298|4226->1334|4266->1336|4299->1343|4314->1349|4350->1364|4383->1371|4398->1377|4456->1414|4491->1422|4563->1464|4594->1468|4631->1478|4646->1484|4694->1511|4768->1558|4780->1561|4812->1572|4848->1582|4863->1588|4917->1633|4956->1634|4989->1641|5004->1647|5040->1662|5073->1668|5187->1756|5202->1762|5260->1799|5293->1806|5308->1812|5367->1850|5400->1856|5471->1897|5502->1901
                  LINES: 28->1|33->1|35->3|38->6|38->6|38->6|38->6|40->8|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|48->16|48->16|50->18|50->18|50->18|51->19|58->26|58->26|60->28|60->28|60->28|61->29|63->31|63->31|65->33|65->33|65->33|66->34|68->36|68->36|70->38|70->38|70->38|71->39|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|81->49|87->55|87->55|88->56|88->56|88->56|89->57|90->58|90->58|91->59|91->59|92->60|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|104->72|105->73|106->74|106->74|106->74|106->74|109->77|109->77|109->77|110->78|110->78|110->78|110->78|111->79|111->79|111->79|112->80|113->81|113->81|113->81|114->82|114->82|114->82|115->83|116->84|117->85
                  -- GENERATED --
              */
          