
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
      height: 90px;
      width: 100%;
      background-color: darkgray;
      display: inline-block;
  """),format.raw/*64.3*/("""}"""),format.raw/*64.4*/("""
  
  """),format.raw/*66.3*/("""#search-bar """),format.raw/*66.15*/("""{"""),format.raw/*66.16*/("""
      """),format.raw/*67.7*/("""width: 600px;
      height: 35px;
      border: 2px solid black;
      border-radius: 16px;
      text-decoration-color: black;
      font-size: 18px;
      font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
  """),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""
  
  """),format.raw/*76.3*/("""#search-button """),format.raw/*76.18*/("""{"""),format.raw/*76.19*/("""
      """),format.raw/*77.7*/("""width: 90px;
      height: 41px;
      text-decoration-color: black;
      font-size: 18px;
      font-family: "HelveticaNeue-Bold", "Helvetica Neue Bold", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
      background-color: white;
      border: 3px solid black;
      border-radius: 20px;
  """),format.raw/*85.3*/("""}"""),format.raw/*85.4*/("""
  
  """),format.raw/*87.3*/("""</style>
  </head>
  <body>

  <div class="topnav">
    <a class="active" href=""""),_display_(/*92.30*/routes/*92.36*/.MainController.main()),format.raw/*92.58*/("""">Home</a>
    <a href=""""),_display_(/*93.15*/routes/*93.21*/.JobController.listJobs()),format.raw/*93.46*/("""">Jobs</a>
    <a href=""""),_display_(/*94.15*/routes/*94.21*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*94.99*/("""">Profile</a>
    """),_display_(/*95.6*/helper/*95.12*/.form(routes.JobController.search(), 'id -> "search-form")/*95.70*/ {_display_(Seq[Any](format.raw/*95.72*/("""
      """),_display_(/*96.8*/helper/*96.14*/.CSRF.formField),format.raw/*96.29*/("""
      
      """),format.raw/*98.7*/("""<table>
          <tr>
              <td>"""),_display_(/*100.20*/helper/*100.26*/.inputText(form("searchTerms"), 'id -> "search-bar")),format.raw/*100.78*/("""</td>
              <td><button type="submit" id="search-button">Search</button></td>
          </tr>
      </table>
      
    """)))}),format.raw/*105.6*/("""
    """),format.raw/*106.5*/("""<a href=""""),_display_(/*106.15*/routes/*106.21*/.ProfileController.logOut()),format.raw/*106.48*/("""">Log Out</a>
  </div>
    <h1>Search Results</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th>
        </thead>
        <tbody>
        """),_display_(/*119.10*/for((j, i) <- jobs.zipWithIndex) yield /*119.42*/ {_display_(Seq[Any](format.raw/*119.44*/("""
          """),format.raw/*120.11*/("""<tr><td><a href=""""),_display_(/*120.29*/routes/*120.35*/.JobController.getJob(i)),format.raw/*120.59*/("""">"""),_display_(/*120.62*/j/*120.63*/.getTitle()),format.raw/*120.74*/("""</a></td><td>"""),_display_(/*120.88*/j/*120.89*/.getDescription),format.raw/*120.104*/("""</td><td>"""),_display_(/*120.114*/j/*120.115*/.getSalary()),format.raw/*120.127*/("""</td><td>"""),_display_(/*120.137*/j/*120.138*/.getCompany()),format.raw/*120.151*/("""</td>
          </tr>

        """)))}),format.raw/*123.10*/("""

        """),format.raw/*125.9*/("""</tbody>
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
                  DATE: Fri Nov 30 17:30:21 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/search.scala.html
                  HASH: d0e0afdc76d11654fc276ec8e0031fb248737457
                  MATRIX: 968->1|1103->41|1133->45|1172->58|1199->59|1249->82|1277->83|1309->89|1340->94|1367->95|1399->101|1487->163|1514->164|1547->170|1583->178|1612->179|1645->185|1725->238|1753->239|1786->245|1824->255|1853->256|1886->262|2069->418|2097->419|2130->425|2174->441|2203->442|2236->448|2309->494|2337->495|2370->501|2415->518|2444->519|2477->525|2553->574|2581->575|2614->581|2667->606|2696->607|2729->613|2880->737|2908->738|2943->746|3002->777|3031->778|3064->784|3128->820|3157->821|3192->829|3345->955|3373->956|3406->962|3459->987|3488->988|3523->996|3579->1025|3607->1026|3638->1030|3666->1031|3701->1039|3742->1052|3771->1053|3806->1061|3962->1190|3990->1191|4025->1199|4065->1211|4094->1212|4129->1220|4447->1511|4475->1512|4510->1520|4553->1535|4582->1536|4617->1544|4964->1864|4992->1865|5027->1873|5140->1959|5155->1965|5198->1987|5251->2013|5266->2019|5312->2044|5365->2070|5380->2076|5479->2154|5525->2174|5540->2180|5607->2238|5647->2240|5682->2249|5697->2255|5733->2270|5776->2286|5848->2330|5864->2336|5938->2388|6103->2522|6137->2528|6175->2538|6191->2544|6240->2571|6489->2792|6538->2824|6579->2826|6620->2838|6666->2856|6682->2862|6728->2886|6759->2889|6770->2890|6803->2901|6845->2915|6856->2916|6894->2931|6933->2941|6945->2942|6980->2954|7019->2964|7031->2965|7067->2978|7134->3013|7174->3025
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|90->58|90->58|90->58|91->59|96->64|96->64|98->66|98->66|98->66|99->67|106->74|106->74|108->76|108->76|108->76|109->77|117->85|117->85|119->87|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|127->95|128->96|128->96|128->96|130->98|132->100|132->100|132->100|137->105|138->106|138->106|138->106|138->106|151->119|151->119|151->119|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|155->123|157->125
                  -- GENERATED --
              */
          