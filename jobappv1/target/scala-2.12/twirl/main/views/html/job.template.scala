
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

object job extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[JobData],Form[SearchForm],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[JobData], searchForm: Form[SearchForm], index: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""

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
</head>
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
    """),_display_(/*77.6*/helper/*77.12*/.form(routes.JobController.updateJob(index))/*77.56*/ {_display_(Seq[Any](format.raw/*77.58*/("""
        """),_display_(/*78.10*/helper/*78.16*/.CSRF.formField),format.raw/*78.31*/("""
        """),_display_(/*79.10*/helper/*79.16*/.inputText(form("title"))),format.raw/*79.41*/("""
        """),_display_(/*80.10*/helper/*80.16*/.inputText(form("description"))),format.raw/*80.47*/("""
        """),_display_(/*81.10*/helper/*81.16*/.inputText(form("salary"))),format.raw/*81.42*/("""
        """),_display_(/*82.10*/helper/*82.16*/.inputText(form("company"))),format.raw/*82.43*/("""
        """),format.raw/*83.9*/("""<button type="submit">Update Job</button>
    """)))}),format.raw/*84.6*/("""

  """),format.raw/*86.3*/("""</body>
<html>
"""))
      }
    }
  }

  def render(form:Form[JobData],searchForm:Form[SearchForm],index:Int): play.twirl.api.HtmlFormat.Appendable = apply(form,searchForm,index)

  def f:((Form[JobData],Form[SearchForm],Int) => play.twirl.api.HtmlFormat.Appendable) = (form,searchForm,index) => apply(form,searchForm,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 25 19:52:07 EST 2018
                  SOURCE: C:/sbt/jobappv1/app/views/job.scala.html
                  HASH: f05c6cfd2d251a8df2c79feffed2653bbc38f913
                  MATRIX: 974->1|1132->64|1162->68|1234->114|1261->115|1311->138|1339->139|1369->143|1400->148|1427->149|1457->153|1542->211|1570->212|1601->216|1636->224|1665->225|1696->229|1772->278|1800->279|1831->283|1869->293|1898->294|1929->298|2098->440|2126->441|2157->445|2201->461|2230->462|2261->466|2330->508|2358->509|2389->513|2434->530|2463->531|2494->535|2566->580|2594->581|2625->585|2678->610|2707->611|2738->615|2877->727|2905->728|2936->732|2995->763|3024->764|3055->768|3119->804|3148->805|3181->811|3322->925|3350->926|3381->930|3434->955|3463->956|3496->962|3550->989|3578->990|3607->992|3635->993|3664->995|3769->1073|3784->1079|3827->1101|3878->1125|3893->1131|3939->1156|3990->1180|4005->1186|4104->1264|4148->1282|4163->1288|4208->1324|4248->1326|4281->1333|4296->1339|4332->1354|4365->1361|4380->1367|4438->1404|4473->1412|4545->1454|4576->1458|4613->1468|4628->1474|4676->1501|4740->1539|4755->1545|4808->1589|4848->1591|4886->1602|4901->1608|4937->1623|4975->1634|4990->1640|5036->1665|5074->1676|5089->1682|5141->1713|5179->1724|5194->1730|5241->1756|5279->1767|5294->1773|5342->1800|5379->1810|5457->1858|5490->1864
                  LINES: 28->1|33->1|35->3|38->6|38->6|38->6|38->6|40->8|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|48->16|48->16|50->18|50->18|50->18|51->19|58->26|58->26|60->28|60->28|60->28|61->29|63->31|63->31|65->33|65->33|65->33|66->34|68->36|68->36|70->38|70->38|70->38|71->39|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|81->49|87->55|87->55|88->56|88->56|88->56|89->57|90->58|90->58|91->59|91->59|92->60|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|104->72|105->73|106->74|106->74|106->74|106->74|109->77|109->77|109->77|109->77|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|114->82|115->83|116->84|118->86
                  -- GENERATED --
              */
          