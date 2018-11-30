
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

"""),format.raw/*61.1*/("""#search-form """),format.raw/*61.14*/("""{"""),format.raw/*61.15*/("""
    """),format.raw/*62.5*/("""text-align: center;
    height: 90px;
    width: 100%;
    background-color: darkgray;
    display: inline-block;
"""),format.raw/*67.1*/("""}"""),format.raw/*67.2*/("""

"""),format.raw/*69.1*/("""#search-bar """),format.raw/*69.13*/("""{"""),format.raw/*69.14*/("""
    """),format.raw/*70.5*/("""width: 600px;
    height: 35px;
    border: 2px solid black;
    border-radius: 16px;
    text-decoration-color: black;
    font-size: 18px;
    font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
"""),format.raw/*77.1*/("""}"""),format.raw/*77.2*/("""

"""),format.raw/*79.1*/("""#search-button """),format.raw/*79.16*/("""{"""),format.raw/*79.17*/("""
    """),format.raw/*80.5*/("""width: 90px;
    height: 41px;
    text-decoration-color: black;
    font-size: 18px;
    font-family: "HelveticaNeue-Bold", "Helvetica Neue Bold", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
    background-color: white;
    border: 3px solid black;
    border-radius: 20px;
"""),format.raw/*88.1*/("""}"""),format.raw/*88.2*/("""
"""),format.raw/*89.1*/("""</style>

<body>

<div class="topnav">
  <a class="active" href=""""),_display_(/*94.28*/routes/*94.34*/.MainController.main()),format.raw/*94.56*/("""">Home</a>
  <a href=""""),_display_(/*95.13*/routes/*95.19*/.JobController.listJobs()),format.raw/*95.44*/("""">Jobs</a>
  <a href=""""),_display_(/*96.13*/routes/*96.19*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*96.97*/("""">Profile</a>
  """),_display_(/*97.4*/helper/*97.10*/.form(routes.JobController.search(), 'id -> "search-form")/*97.68*/ {_display_(Seq[Any](format.raw/*97.70*/("""
  """),_display_(/*98.4*/helper/*98.10*/.CSRF.formField),format.raw/*98.25*/("""
  
  """),format.raw/*100.3*/("""<table>
      <tr>
          <td>"""),_display_(/*102.16*/helper/*102.22*/.inputText(form("searchTerms"), 'id -> "search-bar")),format.raw/*102.74*/("""</td>
          <td><button type="submit" id="search-button">Search</button></td>
      </tr>
  </table>
  
  """)))}),format.raw/*107.4*/("""
  """),format.raw/*108.3*/("""<a href=""""),_display_(/*108.13*/routes/*108.19*/.ProfileController.logOut()),format.raw/*108.46*/("""">Log Out</a>
</div>
  <body>
    """),_display_(/*111.6*/helper/*111.12*/.form(routes.JobController.updateJob(index))/*111.56*/ {_display_(Seq[Any](format.raw/*111.58*/("""
        """),_display_(/*112.10*/helper/*112.16*/.CSRF.formField),format.raw/*112.31*/("""
        """),_display_(/*113.10*/helper/*113.16*/.inputText(form("title"))),format.raw/*113.41*/("""
        """),_display_(/*114.10*/helper/*114.16*/.inputText(form("description"))),format.raw/*114.47*/("""
        """),_display_(/*115.10*/helper/*115.16*/.inputText(form("salary"))),format.raw/*115.42*/("""
        """),_display_(/*116.10*/helper/*116.16*/.inputText(form("company"))),format.raw/*116.43*/("""
        """),format.raw/*117.9*/("""<button type="submit">Update Job</button>
    """)))}),format.raw/*118.6*/("""

  """),format.raw/*120.3*/("""</body>
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
                  DATE: Fri Nov 30 18:02:09 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/job.scala.html
                  HASH: ccea2f1b5b2ff74a67eb31462af1a2d9cbc5ef08
                  MATRIX: 974->1|1131->65|1158->66|1227->109|1254->110|1304->133|1332->134|1360->136|1391->141|1418->142|1447->145|1530->201|1558->202|1587->204|1622->212|1651->213|1681->216|1755->263|1783->264|1812->266|1850->276|1879->277|1909->280|2071->415|2099->416|2128->418|2172->434|2201->435|2231->438|2298->478|2326->479|2355->481|2400->498|2429->499|2459->502|2529->545|2557->546|2586->548|2639->573|2668->574|2698->577|2831->683|2859->684|2888->686|2947->717|2976->718|3006->721|3070->757|3099->758|3131->763|3266->871|3294->872|3324->875|3377->900|3406->901|3438->906|3491->932|3519->933|3547->934|3575->935|3604->937|3645->950|3674->951|3706->956|3847->1070|3875->1071|3904->1073|3944->1085|3973->1086|4005->1091|4302->1361|4330->1362|4359->1364|4402->1379|4431->1380|4463->1385|4786->1681|4814->1682|4842->1683|4935->1749|4950->1755|4993->1777|5043->1800|5058->1806|5104->1831|5154->1854|5169->1860|5268->1938|5311->1955|5326->1961|5393->2019|5433->2021|5463->2025|5478->2031|5514->2046|5548->2052|5610->2086|5626->2092|5700->2144|5842->2255|5873->2258|5911->2268|5927->2274|5976->2301|6038->2336|6054->2342|6108->2386|6149->2388|6187->2398|6203->2404|6240->2419|6278->2429|6294->2435|6341->2460|6379->2470|6395->2476|6448->2507|6486->2517|6502->2523|6550->2549|6588->2559|6604->2565|6653->2592|6690->2601|6768->2648|6800->2652
                  LINES: 28->1|33->2|34->3|37->6|37->6|37->6|37->6|39->8|39->8|39->8|40->9|42->11|42->11|44->13|44->13|44->13|45->14|47->16|47->16|49->18|49->18|49->18|50->19|57->26|57->26|59->28|59->28|59->28|60->29|62->31|62->31|64->33|64->33|64->33|65->34|67->36|67->36|69->38|69->38|69->38|70->39|76->45|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|86->55|86->55|87->56|87->56|87->56|88->57|89->58|89->58|90->59|90->59|92->61|92->61|92->61|93->62|98->67|98->67|100->69|100->69|100->69|101->70|108->77|108->77|110->79|110->79|110->79|111->80|119->88|119->88|120->89|125->94|125->94|125->94|126->95|126->95|126->95|127->96|127->96|127->96|128->97|128->97|128->97|128->97|129->98|129->98|129->98|131->100|133->102|133->102|133->102|138->107|139->108|139->108|139->108|139->108|142->111|142->111|142->111|142->111|143->112|143->112|143->112|144->113|144->113|144->113|145->114|145->114|145->114|146->115|146->115|146->115|147->116|147->116|147->116|148->117|149->118|151->120
                  -- GENERATED --
              */
          