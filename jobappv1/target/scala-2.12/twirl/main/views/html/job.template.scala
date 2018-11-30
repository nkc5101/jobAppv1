
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: Fri Nov 30 16:47:45 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/job.scala.html
                  HASH: 8085535fd197ae094259a5e8153bfa008ac35e76
                  MATRIX: 974->1|1131->65|1158->66|1227->109|1254->110|1304->133|1332->134|1360->136|1391->141|1418->142|1447->145|1530->201|1558->202|1587->204|1622->212|1651->213|1681->216|1755->263|1783->264|1812->266|1850->276|1879->277|1909->280|2071->415|2099->416|2128->418|2172->434|2201->435|2231->438|2298->478|2326->479|2355->481|2400->498|2429->499|2459->502|2529->545|2557->546|2586->548|2639->573|2668->574|2698->577|2831->683|2859->684|2888->686|2947->717|2976->718|3006->721|3070->757|3099->758|3131->763|3266->871|3294->872|3324->875|3377->900|3406->901|3438->906|3491->932|3519->933|3547->934|3575->935|3603->936|3703->1009|3718->1015|3761->1037|3811->1060|3826->1066|3872->1091|3922->1114|3937->1120|4036->1198|4079->1215|4094->1221|4139->1257|4179->1259|4211->1265|4226->1271|4262->1286|4294->1292|4309->1298|4367->1335|4400->1341|4471->1382|4501->1385|4538->1395|4553->1401|4601->1428|4662->1463|4677->1469|4730->1513|4770->1515|4807->1525|4822->1531|4858->1546|4895->1556|4910->1562|4956->1587|4993->1597|5008->1603|5060->1634|5097->1644|5112->1650|5159->1676|5196->1686|5211->1692|5259->1719|5295->1728|5372->1775|5403->1779
                  LINES: 28->1|33->2|34->3|37->6|37->6|37->6|37->6|39->8|39->8|39->8|40->9|42->11|42->11|44->13|44->13|44->13|45->14|47->16|47->16|49->18|49->18|49->18|50->19|57->26|57->26|59->28|59->28|59->28|60->29|62->31|62->31|64->33|64->33|64->33|65->34|67->36|67->36|69->38|69->38|69->38|70->39|76->45|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|86->55|86->55|87->56|87->56|87->56|88->57|89->58|89->58|90->59|90->59|91->60|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|103->72|104->73|105->74|105->74|105->74|105->74|108->77|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|115->84|117->86
                  -- GENERATED --
              */
          