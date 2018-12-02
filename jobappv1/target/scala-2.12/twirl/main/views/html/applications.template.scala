
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

object applications extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[Applicant],Form[SearchForm],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(applications: Seq[Applicant], searchForm: Form[SearchForm], index: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.74*/("""

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
<table>
  <thead>
    <tr><th>Profile</th><th>Resume</th><th>Additional Comments</th>
  </thead>
  <tbody>
    """),_display_(/*81.6*/for((j, i) <- applications.zipWithIndex) yield /*81.46*/ {_display_(Seq[Any](format.raw/*81.48*/("""
      """),format.raw/*82.7*/("""<tr><td>"""),_display_(/*82.16*/j/*82.17*/.getUser().getUsername()),format.raw/*82.41*/("""</td><td><a href=""""),_display_(/*82.60*/routes/*82.66*/.JobController.getApplicantsFiles(index, i)),format.raw/*82.109*/("""">Download</a></td><td>"""),_display_(/*82.133*/j/*82.134*/.getComments()),format.raw/*82.148*/("""</td>
      </tr>
  </tbody>
</table>
""")))}),format.raw/*86.2*/("""
"""))
      }
    }
  }

  def render(applications:Seq[Applicant],searchForm:Form[SearchForm],index:Int): play.twirl.api.HtmlFormat.Appendable = apply(applications,searchForm,index)

  def f:((Seq[Applicant],Form[SearchForm],Int) => play.twirl.api.HtmlFormat.Appendable) = (applications,searchForm,index) => apply(applications,searchForm,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 02 14:21:03 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/applications.scala.html
                  HASH: db95d7a5d7ee8264c9c9e441676e417c39b3904f
                  MATRIX: 984->1|1151->73|1181->77|1253->123|1280->124|1330->147|1358->148|1388->152|1419->157|1446->158|1476->162|1561->220|1589->221|1620->225|1655->233|1684->234|1715->238|1791->287|1819->288|1850->292|1888->302|1917->303|1948->307|2117->449|2145->450|2176->454|2220->470|2249->471|2280->475|2349->517|2377->518|2408->522|2453->539|2482->540|2513->544|2585->589|2613->590|2644->594|2697->619|2726->620|2757->624|2896->736|2924->737|2955->741|3014->772|3043->773|3074->777|3138->813|3167->814|3200->820|3341->934|3369->935|3400->939|3453->964|3482->965|3515->971|3569->998|3597->999|3626->1001|3654->1002|3683->1004|3781->1075|3796->1081|3839->1103|3890->1127|3905->1133|3951->1158|4002->1182|4017->1188|4116->1266|4160->1284|4175->1290|4220->1326|4260->1328|4293->1335|4308->1341|4344->1356|4377->1363|4392->1369|4450->1406|4485->1414|4557->1456|4588->1460|4625->1470|4640->1476|4688->1503|4854->1643|4910->1683|4950->1685|4985->1693|5021->1702|5031->1703|5076->1727|5122->1746|5137->1752|5202->1795|5254->1819|5265->1820|5301->1834|5374->1877
                  LINES: 28->1|33->1|35->3|38->6|38->6|38->6|38->6|40->8|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|48->16|48->16|50->18|50->18|50->18|51->19|58->26|58->26|60->28|60->28|60->28|61->29|63->31|63->31|65->33|65->33|65->33|66->34|68->36|68->36|70->38|70->38|70->38|71->39|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|81->49|87->55|87->55|88->56|88->56|88->56|89->57|90->58|90->58|91->59|91->59|92->60|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|104->72|105->73|106->74|106->74|106->74|106->74|113->81|113->81|113->81|114->82|114->82|114->82|114->82|114->82|114->82|114->82|114->82|114->82|114->82|118->86
                  -- GENERATED --
              */
          