
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


Seq[Any](format.raw/*1.69*/("""



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
                  DATE: Sun Dec 02 15:32:38 EST 2018
                  SOURCE: C:/sbt/jobappv1/app/views/profile.scala.html
                  HASH: 87db772e10cf3577f6e2c5591074a9f0b3a08db3
                  MATRIX: 982->1|1144->68|1178->76|1250->122|1277->123|1327->146|1355->147|1386->151|1418->156|1446->157|1477->161|1562->219|1590->220|1621->224|1656->232|1685->233|1716->237|1792->286|1820->287|1851->291|1889->301|1918->302|1949->306|2118->448|2146->449|2177->453|2221->469|2250->470|2281->474|2350->516|2378->517|2409->521|2454->538|2483->539|2514->543|2586->588|2614->589|2645->593|2698->618|2727->619|2758->623|2897->735|2925->736|2956->740|3015->771|3044->772|3075->776|3139->812|3168->813|3201->819|3342->933|3370->934|3401->938|3454->963|3483->964|3516->970|3570->997|3598->998|3627->1000|3655->1001|3684->1003|3782->1074|3797->1080|3840->1102|3891->1126|3906->1132|3952->1157|4003->1181|4018->1187|4117->1265|4161->1283|4176->1289|4221->1325|4261->1327|4294->1334|4309->1340|4345->1355|4378->1362|4393->1368|4445->1399|4480->1407|4552->1449|4583->1453|4620->1463|4635->1469|4683->1496|4778->1565|4793->1571|4854->1623|4894->1625|4934->1638|4949->1644|4985->1659|5025->1672|5040->1678|5090->1707|5130->1720|5145->1726|5194->1754|5234->1767|5249->1773|5298->1801|5338->1814|5353->1820|5406->1852|5446->1865|5461->1871|5505->1894|5545->1907|5560->1913|5609->1941|5649->1953|5733->2007|5766->2013
                  LINES: 28->1|33->1|37->5|40->8|40->8|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|50->18|50->18|52->20|52->20|52->20|53->21|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|70->38|70->38|72->40|72->40|72->40|73->41|79->47|79->47|81->49|81->49|81->49|82->50|82->50|82->50|83->51|89->57|89->57|90->58|90->58|90->58|91->59|92->60|92->60|93->61|93->61|94->62|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72|106->74|107->75|108->76|108->76|108->76|108->76|112->80|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|121->89|122->90
                  -- GENERATED --
              */
          