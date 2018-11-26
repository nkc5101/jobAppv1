
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
  """),format.raw/*57.3*/("""</style>
  </head>
  <body>

  <div class="topnav">
    <a class="active" href=""""),_display_(/*62.30*/routes/*62.36*/.MainController.main()),format.raw/*62.58*/("""">Home</a>
    <a href=""""),_display_(/*63.15*/routes/*63.21*/.JobController.listJobs()),format.raw/*63.46*/("""">Jobs</a>
    <a href=""""),_display_(/*64.15*/routes/*64.21*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*64.99*/("""">Profile</a>
    """),_display_(/*65.6*/helper/*65.12*/.form(routes.JobController.search())/*65.48*/ {_display_(Seq[Any](format.raw/*65.50*/("""
      """),_display_(/*66.8*/helper/*66.14*/.CSRF.formField),format.raw/*66.29*/("""
      """),_display_(/*67.8*/helper/*67.14*/.inputText(form("searchTerms"))),format.raw/*67.45*/("""

      """),format.raw/*69.7*/("""<button type="submit">Search</button>
    """)))}),format.raw/*70.6*/("""
    """),format.raw/*71.5*/("""<a href=""""),_display_(/*71.15*/routes/*71.21*/.ProfileController.logOut()),format.raw/*71.48*/("""">Log Out</a>
  </div>
    <h1>Search Results</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th>
        </thead>
        <tbody>
        """),_display_(/*84.10*/for((j, i) <- jobs.zipWithIndex) yield /*84.42*/ {_display_(Seq[Any](format.raw/*84.44*/("""
          """),format.raw/*85.11*/("""<tr><td><a href=""""),_display_(/*85.29*/routes/*85.35*/.JobController.getJob(i)),format.raw/*85.59*/("""">"""),_display_(/*85.62*/j/*85.63*/.getTitle()),format.raw/*85.74*/("""</a></td><td>"""),_display_(/*85.88*/j/*85.89*/.getDescription),format.raw/*85.104*/("""</td><td>"""),_display_(/*85.114*/j/*85.115*/.getSalary()),format.raw/*85.127*/("""</td><td>"""),_display_(/*85.137*/j/*85.138*/.getCompany()),format.raw/*85.151*/("""</td>
          </tr>

        """)))}),format.raw/*88.10*/("""

        """),format.raw/*90.9*/("""</tbody>
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
                  DATE: Sun Nov 25 19:51:00 EST 2018
                  SOURCE: C:/sbt/jobappv1/app/views/search.scala.html
                  HASH: 4b4f08b1e990b4b5268c4e320995854c42861c0d
                  MATRIX: 968->1|1103->41|1133->45|1172->58|1199->59|1249->82|1277->83|1309->89|1340->94|1367->95|1399->101|1487->163|1514->164|1547->170|1583->178|1612->179|1645->185|1725->238|1753->239|1786->245|1824->255|1853->256|1886->262|2069->418|2097->419|2130->425|2174->441|2203->442|2236->448|2309->494|2337->495|2370->501|2415->518|2444->519|2477->525|2553->574|2581->575|2614->581|2667->606|2696->607|2729->613|2880->737|2908->738|2941->744|3000->775|3029->776|3062->782|3126->818|3155->819|3190->827|3343->953|3371->954|3404->960|3457->985|3486->986|3521->994|3577->1023|3605->1024|3636->1028|3664->1029|3695->1033|3808->1119|3823->1125|3866->1147|3919->1173|3934->1179|3980->1204|4033->1230|4048->1236|4147->1314|4193->1334|4208->1340|4253->1376|4293->1378|4328->1387|4343->1393|4379->1408|4414->1417|4429->1423|4481->1454|4518->1464|4592->1508|4625->1514|4662->1524|4677->1530|4725->1557|4973->1778|5021->1810|5061->1812|5101->1824|5146->1842|5161->1848|5206->1872|5236->1875|5246->1876|5278->1887|5319->1901|5329->1902|5366->1917|5404->1927|5415->1928|5449->1940|5487->1950|5498->1951|5533->1964|5599->1999|5638->2011
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|89->57|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|101->69|102->70|103->71|103->71|103->71|103->71|116->84|116->84|116->84|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|120->88|122->90
                  -- GENERATED --
              */
          