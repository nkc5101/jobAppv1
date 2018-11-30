
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
                  DATE: Fri Nov 30 18:02:09 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/apply.scala.html
                  HASH: bd5fc0c6de51e9fe128b2f07f9f5d4a25dde1c8a
                  MATRIX: 982->1|1156->82|1183->83|1252->126|1279->127|1329->150|1357->151|1385->153|1416->158|1443->159|1472->162|1555->218|1583->219|1612->221|1647->229|1676->230|1706->233|1780->280|1808->281|1837->283|1875->293|1904->294|1934->297|2096->432|2124->433|2153->435|2197->451|2226->452|2256->455|2323->495|2351->496|2380->498|2425->515|2454->516|2484->519|2554->562|2582->563|2611->565|2664->590|2693->591|2723->594|2856->700|2884->701|2913->703|2972->734|3001->735|3031->738|3095->774|3124->775|3156->780|3291->888|3319->889|3349->892|3402->917|3431->918|3463->923|3516->949|3544->950|3572->951|3600->952|3628->953|3721->1019|3736->1025|3779->1047|3829->1070|3844->1076|3890->1101|3940->1124|3955->1130|4054->1208|4097->1225|4112->1231|4157->1267|4197->1269|4229->1275|4244->1281|4280->1296|4312->1302|4327->1308|4385->1345|4418->1351|4489->1392|4519->1395|4556->1405|4571->1411|4619->1438|4690->1482|4702->1485|4734->1496|4769->1505|4784->1511|4838->1556|4877->1557|4909->1563|4924->1569|4960->1584|4992->1589|5105->1676|5120->1682|5178->1719|5210->1725|5225->1731|5284->1769|5316->1774|5386->1814|5416->1817
                  LINES: 28->1|33->2|34->3|37->6|37->6|37->6|37->6|39->8|39->8|39->8|40->9|42->11|42->11|44->13|44->13|44->13|45->14|47->16|47->16|49->18|49->18|49->18|50->19|57->26|57->26|59->28|59->28|59->28|60->29|62->31|62->31|64->33|64->33|64->33|65->34|67->36|67->36|69->38|69->38|69->38|70->39|76->45|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|86->55|86->55|87->56|87->56|87->56|88->57|89->58|89->58|90->59|90->59|91->60|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|103->72|104->73|105->74|105->74|105->74|105->74|108->77|108->77|108->77|109->78|109->78|109->78|109->78|110->79|110->79|110->79|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|115->84|116->85
                  -- GENERATED --
              */
          