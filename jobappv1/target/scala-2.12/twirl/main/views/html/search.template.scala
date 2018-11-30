
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Job],Form[SearchForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobs: Seq[Job], form: Form[SearchForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""
  """),format.raw/*2.3*/("""<style>
  * """),format.raw/*3.5*/("""{"""),format.raw/*3.6*/("""box-sizing: border-box;"""),format.raw/*3.29*/("""}"""),format.raw/*3.30*/("""

  """),format.raw/*5.3*/("""body """),format.raw/*5.8*/("""{"""),format.raw/*5.9*/("""
    """),format.raw/*6.5*/("""margin: 0;
    font-family: Arial, Helvetica, sans-serif;
  """),format.raw/*8.3*/("""}"""),format.raw/*8.4*/("""

  """),format.raw/*10.3*/(""".topnav """),format.raw/*10.11*/("""{"""),format.raw/*10.12*/("""
    """),format.raw/*11.5*/("""overflow: hidden;
    background-color: #e9e9e9;
  """),format.raw/*13.3*/("""}"""),format.raw/*13.4*/("""

  """),format.raw/*15.3*/(""".topnav a """),format.raw/*15.13*/("""{"""),format.raw/*15.14*/("""
    """),format.raw/*16.5*/("""float: left;
    display: block;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
  """),format.raw/*23.3*/("""}"""),format.raw/*23.4*/("""

  """),format.raw/*25.3*/(""".topnav a:hover """),format.raw/*25.19*/("""{"""),format.raw/*25.20*/("""
    """),format.raw/*26.5*/("""background-color: #ddd;
    color: black;
  """),format.raw/*28.3*/("""}"""),format.raw/*28.4*/("""

  """),format.raw/*30.3*/(""".topnav a.active """),format.raw/*30.20*/("""{"""),format.raw/*30.21*/("""
    """),format.raw/*31.5*/("""background-color: #2196F3;
    color: white;
  """),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""

  """),format.raw/*35.3*/(""".topnav input[type=text] """),format.raw/*35.28*/("""{"""),format.raw/*35.29*/("""
    """),format.raw/*36.5*/("""float: right;
    padding: 6px;
    margin-top: 8px;
    margin-right: 16px;
    border: none;
    font-size: 17px;
  """),format.raw/*42.3*/("""}"""),format.raw/*42.4*/("""
  
  """),format.raw/*44.3*/("""screen and (max-width: 1920px) """),format.raw/*44.34*/("""{"""),format.raw/*44.35*/("""
    """),format.raw/*45.5*/(""".topnav a, .topnav input[type=text] """),format.raw/*45.41*/("""{"""),format.raw/*45.42*/("""
      """),format.raw/*46.7*/("""float: none;
      display: block;
      text-align: left;
      width: 100%;
      margin: 0;
      padding: 14px;
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""
    """),format.raw/*53.5*/(""".topnav input[type=text] """),format.raw/*53.30*/("""{"""),format.raw/*53.31*/("""
      """),format.raw/*54.7*/("""border: 1px solid #ccc;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""
  """),format.raw/*56.3*/("""}"""),format.raw/*56.4*/("""
  
  """),format.raw/*58.3*/("""#search-form """),format.raw/*58.16*/("""{"""),format.raw/*58.17*/("""
      """),format.raw/*59.7*/("""text-align: center;
      height: 48px;
      width: 70%;
      background-color: black;
      display: inline;
  """),format.raw/*64.3*/("""}"""),format.raw/*64.4*/("""
  
  """),format.raw/*66.3*/("""#search-bar """),format.raw/*66.15*/("""{"""),format.raw/*66.16*/("""
      """),format.raw/*67.7*/("""margin-left: auto;
      margin-right: auto;
      width: 30%;
      height: 35px;
      border: 2px solid black;
      border-radius: 0px;
      text-decoration-color: black;
      font-size: 18px;
      font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
  """),format.raw/*76.3*/("""}"""),format.raw/*76.4*/("""
  
  """),format.raw/*78.3*/("""#search-button """),format.raw/*78.18*/("""{"""),format.raw/*78.19*/("""
      """),format.raw/*79.7*/(""";
  """),format.raw/*80.3*/("""}"""),format.raw/*80.4*/("""
  
  """),format.raw/*82.3*/("""</style>
  </head>
  <body>

  <div class="topnav">
    <a class="active" href=""""),_display_(/*87.30*/routes/*87.36*/.MainController.main()),format.raw/*87.58*/("""">Home</a>
    <a href=""""),_display_(/*88.15*/routes/*88.21*/.JobController.listJobs()),format.raw/*88.46*/("""">Jobs</a>
    <a href=""""),_display_(/*89.15*/routes/*89.21*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*89.99*/("""">Profile</a>
    """),_display_(/*90.6*/helper/*90.12*/.form(routes.JobController.search(), 'id -> "search-form")/*90.70*/ {_display_(Seq[Any](format.raw/*90.72*/("""
      """),_display_(/*91.8*/helper/*91.14*/.CSRF.formField),format.raw/*91.29*/("""
      """),_display_(/*92.8*/helper/*92.14*/.inputText(form("searchTerms"), 'id -> "search-bar")),format.raw/*92.66*/("""

      """),format.raw/*94.7*/("""<button type="submit" id="search-button">Search</button>
    """)))}),format.raw/*95.6*/("""
    """),format.raw/*96.5*/("""<a href=""""),_display_(/*96.15*/routes/*96.21*/.ProfileController.logOut()),format.raw/*96.48*/("""">Log Out</a>
  </div>
    <h1>Search Results</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th>
        </thead>
        <tbody>
        """),_display_(/*109.10*/for((j, i) <- jobs.zipWithIndex) yield /*109.42*/ {_display_(Seq[Any](format.raw/*109.44*/("""
          """),format.raw/*110.11*/("""<tr><td><a href=""""),_display_(/*110.29*/routes/*110.35*/.JobController.getJob(i)),format.raw/*110.59*/("""">"""),_display_(/*110.62*/j/*110.63*/.getTitle()),format.raw/*110.74*/("""</a></td><td>"""),_display_(/*110.88*/j/*110.89*/.getDescription),format.raw/*110.104*/("""</td><td>"""),_display_(/*110.114*/j/*110.115*/.getSalary()),format.raw/*110.127*/("""</td><td>"""),_display_(/*110.137*/j/*110.138*/.getCompany()),format.raw/*110.151*/("""</td>
          </tr>

        """)))}),format.raw/*113.10*/("""

        """),format.raw/*115.9*/("""</tbody>
    </table>

    <hr/>
"""))
      }
    }
  }

  def render(jobs:Seq[Job],form:Form[SearchForm]): play.twirl.api.HtmlFormat.Appendable = apply(jobs,form)

  def f:((Seq[Job],Form[SearchForm]) => play.twirl.api.HtmlFormat.Appendable) = (jobs,form) => apply(jobs,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 16:28:13 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/search.scala.html
                  HASH: 1b92fa994922cfacd5aeb143bed62ac3ef78a98e
                  MATRIX: 968->1|1103->41|1133->45|1172->58|1199->59|1249->82|1277->83|1309->89|1340->94|1367->95|1399->101|1487->163|1514->164|1547->170|1583->178|1612->179|1645->185|1725->238|1753->239|1786->245|1824->255|1853->256|1886->262|2069->418|2097->419|2130->425|2174->441|2203->442|2236->448|2309->494|2337->495|2370->501|2415->518|2444->519|2477->525|2553->574|2581->575|2614->581|2667->606|2696->607|2729->613|2880->737|2908->738|2943->746|3002->777|3031->778|3064->784|3128->820|3157->821|3192->829|3345->955|3373->956|3406->962|3459->987|3488->988|3523->996|3579->1025|3607->1026|3638->1030|3666->1031|3701->1039|3742->1052|3771->1053|3806->1061|3952->1180|3980->1181|4015->1189|4055->1201|4084->1202|4119->1210|4487->1551|4515->1552|4550->1560|4593->1575|4622->1576|4657->1584|4689->1589|4717->1590|4752->1598|4865->1684|4880->1690|4923->1712|4976->1738|4991->1744|5037->1769|5090->1795|5105->1801|5204->1879|5250->1899|5265->1905|5332->1963|5372->1965|5407->1974|5422->1980|5458->1995|5493->2004|5508->2010|5581->2062|5618->2072|5711->2135|5744->2141|5781->2151|5796->2157|5844->2184|6093->2405|6142->2437|6183->2439|6224->2451|6270->2469|6286->2475|6332->2499|6363->2502|6374->2503|6407->2514|6449->2528|6460->2529|6498->2544|6537->2554|6549->2555|6584->2567|6623->2577|6635->2578|6671->2591|6738->2626|6778->2638
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|90->58|90->58|90->58|91->59|96->64|96->64|98->66|98->66|98->66|99->67|108->76|108->76|110->78|110->78|110->78|111->79|112->80|112->80|114->82|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|122->90|122->90|122->90|122->90|123->91|123->91|123->91|124->92|124->92|124->92|126->94|127->95|128->96|128->96|128->96|128->96|141->109|141->109|141->109|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|142->110|145->113|147->115
                  -- GENERATED --
              */
          