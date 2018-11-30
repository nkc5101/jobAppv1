
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[ProfileData],Form[SearchForm],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[ProfileData], searchForm: Form[SearchForm], index: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""


"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
<style>
* """),format.raw/*8.3*/("""{"""),format.raw/*8.4*/("""box-sizing: border-box;"""),format.raw/*8.27*/("""}"""),format.raw/*8.28*/("""

"""),format.raw/*10.1*/("""body """),format.raw/*10.6*/("""{"""),format.raw/*10.7*/("""
  """),format.raw/*11.3*/("""margin: 0;
  font-family: Arial, Helvetica, sans-serif;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/(""".topnav """),format.raw/*15.9*/("""{"""),format.raw/*15.10*/("""
  """),format.raw/*16.3*/("""overflow: hidden;
  background-color: #e9e9e9;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/(""".topnav a """),format.raw/*20.11*/("""{"""),format.raw/*20.12*/("""
  """),format.raw/*21.3*/("""float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""

"""),format.raw/*30.1*/(""".topnav a:hover """),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
  """),format.raw/*31.3*/("""background-color: #ddd;
  color: black;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""

"""),format.raw/*35.1*/(""".topnav a.active """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
  """),format.raw/*36.3*/("""background-color: #2196F3;
  color: white;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

"""),format.raw/*40.1*/(""".topnav input[type=text] """),format.raw/*40.26*/("""{"""),format.raw/*40.27*/("""
  """),format.raw/*41.3*/("""float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  border: none;
  font-size: 17px;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""

"""),format.raw/*49.1*/("""screen and (max-width: 1920px) """),format.raw/*49.32*/("""{"""),format.raw/*49.33*/("""
  """),format.raw/*50.3*/(""".topnav a, .topnav input[type=text] """),format.raw/*50.39*/("""{"""),format.raw/*50.40*/("""
    """),format.raw/*51.5*/("""float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  """),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""
  """),format.raw/*58.3*/(""".topnav input[type=text] """),format.raw/*58.28*/("""{"""),format.raw/*58.29*/("""
    """),format.raw/*59.5*/("""border: 1px solid #ccc;
  """),format.raw/*60.3*/("""}"""),format.raw/*60.4*/("""
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
"""),format.raw/*62.1*/("""</style>

<body>

<div class="topnav">
  <a class="active" href=""""),_display_(/*67.28*/routes/*67.34*/.MainController.main()),format.raw/*67.56*/("""">Home</a>
  <a href=""""),_display_(/*68.13*/routes/*68.19*/.JobController.listJobs()),format.raw/*68.44*/("""">Jobs</a>
  <a href=""""),_display_(/*69.13*/routes/*69.19*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*69.97*/("""">Profile</a>
  """),_display_(/*70.4*/helper/*70.10*/.form(routes.JobController.search())/*70.46*/ {_display_(Seq[Any](format.raw/*70.48*/("""
    """),_display_(/*71.6*/helper/*71.12*/.CSRF.formField),format.raw/*71.27*/("""
    """),_display_(/*72.6*/helper/*72.12*/.inputText(form("searchTerms"))),format.raw/*72.43*/("""

    """),format.raw/*74.5*/("""<button type="submit">Search</button>
  """)))}),format.raw/*75.4*/("""
  """),format.raw/*76.3*/("""<a href=""""),_display_(/*76.13*/routes/*76.19*/.ProfileController.logOut()),format.raw/*76.46*/("""">Log Out</a>
</div>
  <body>
    <div id="person-stats">
      """),_display_(/*80.8*/helper/*80.14*/.form(routes.ProfileController.updateProfile(index))/*80.66*/ {_display_(Seq[Any](format.raw/*80.68*/("""
          """),_display_(/*81.12*/helper/*81.18*/.CSRF.formField),format.raw/*81.33*/("""
          """),_display_(/*82.12*/helper/*82.18*/.inputText(form("firstName"))),format.raw/*82.47*/("""
          """),_display_(/*83.12*/helper/*83.18*/.inputText(form("lastName"))),format.raw/*83.46*/("""
          """),_display_(/*84.12*/helper/*84.18*/.inputText(form("username"))),format.raw/*84.46*/("""
          """),_display_(/*85.12*/helper/*85.18*/.inputPassword(form("password"))),format.raw/*85.50*/("""
          """),_display_(/*86.12*/helper/*86.18*/.inputText(form("age"))),format.raw/*86.41*/("""
          """),_display_(/*87.12*/helper/*87.18*/.textarea(form("biography"))),format.raw/*87.46*/("""
          """),format.raw/*88.11*/("""<button type="submit">Update Profile</button>
      """)))}),format.raw/*89.8*/("""
    """),format.raw/*90.5*/("""</div>
  </body>
<html>
"""))
      }
    }
  }

  def render(form:Form[ProfileData],searchForm:Form[SearchForm],index:Int): play.twirl.api.HtmlFormat.Appendable = apply(form,searchForm,index)

  def f:((Form[ProfileData],Form[SearchForm],Int) => play.twirl.api.HtmlFormat.Appendable) = (form,searchForm,index) => apply(form,searchForm,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 18:02:09 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/profile.scala.html
                  HASH: 6183ddaef8be9d43c09242d127bd67bdd651050b
                  MATRIX: 982->1|1143->69|1172->72|1241->115|1268->116|1318->139|1346->140|1375->142|1407->147|1435->148|1465->151|1548->207|1576->208|1605->210|1640->218|1669->219|1699->222|1773->269|1801->270|1830->272|1868->282|1897->283|1927->286|2089->421|2117->422|2146->424|2190->440|2219->441|2249->444|2316->484|2344->485|2373->487|2418->504|2447->505|2477->508|2547->551|2575->552|2604->554|2657->579|2686->580|2716->583|2849->689|2877->690|2906->692|2965->723|2994->724|3024->727|3088->763|3117->764|3149->769|3284->877|3312->878|3342->881|3395->906|3424->907|3456->912|3509->938|3537->939|3565->940|3593->941|3621->942|3714->1008|3729->1014|3772->1036|3822->1059|3837->1065|3883->1090|3933->1113|3948->1119|4047->1197|4090->1214|4105->1220|4150->1256|4190->1258|4222->1264|4237->1270|4273->1285|4305->1291|4320->1297|4372->1328|4405->1334|4476->1375|4506->1378|4543->1388|4558->1394|4606->1421|4697->1486|4712->1492|4773->1544|4813->1546|4852->1558|4867->1564|4903->1579|4942->1591|4957->1597|5007->1626|5046->1638|5061->1644|5110->1672|5149->1684|5164->1690|5213->1718|5252->1730|5267->1736|5320->1768|5359->1780|5374->1786|5418->1809|5457->1821|5472->1827|5521->1855|5560->1866|5643->1919|5675->1924
                  LINES: 28->1|33->2|36->5|39->8|39->8|39->8|39->8|41->10|41->10|41->10|42->11|44->13|44->13|46->15|46->15|46->15|47->16|49->18|49->18|51->20|51->20|51->20|52->21|59->28|59->28|61->30|61->30|61->30|62->31|64->33|64->33|66->35|66->35|66->35|67->36|69->38|69->38|71->40|71->40|71->40|72->41|78->47|78->47|80->49|80->49|80->49|81->50|81->50|81->50|82->51|88->57|88->57|89->58|89->58|89->58|90->59|91->60|91->60|92->61|92->61|93->62|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|105->74|106->75|107->76|107->76|107->76|107->76|111->80|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|120->89|121->90
                  -- GENERATED --
              */
          