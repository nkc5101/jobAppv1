
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
     """),format.raw/*59.6*/("""width: 80%;
     border: 4px solid black;
  """),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""
  
  
  """),format.raw/*64.3*/("""</style>
  </head>
  <body>

  <div class="topnav">
    <a class="active" href=""""),_display_(/*69.30*/routes/*69.36*/.MainController.main()),format.raw/*69.58*/("""">Home</a>
    <a href=""""),_display_(/*70.15*/routes/*70.21*/.JobController.listJobs()),format.raw/*70.46*/("""">Jobs</a>
    <a href=""""),_display_(/*71.15*/routes/*71.21*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*71.99*/("""">Profile</a>
    """),_display_(/*72.6*/helper/*72.12*/.form(routes.JobController.search(), 'id -> "search-form")/*72.70*/ {_display_(Seq[Any](format.raw/*72.72*/("""
      """),_display_(/*73.8*/helper/*73.14*/.CSRF.formField),format.raw/*73.29*/("""
      """),_display_(/*74.8*/helper/*74.14*/.inputText(form("searchTerms"))),format.raw/*74.45*/("""

      """),format.raw/*76.7*/("""<button type="submit">Search</button>
    """)))}),format.raw/*77.6*/("""
    """),format.raw/*78.5*/("""<a href=""""),_display_(/*78.15*/routes/*78.21*/.ProfileController.logOut()),format.raw/*78.48*/("""">Log Out</a>
  </div>
    <h1>Search Results</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th>
        </thead>
        <tbody>
        """),_display_(/*91.10*/for((j, i) <- jobs.zipWithIndex) yield /*91.42*/ {_display_(Seq[Any](format.raw/*91.44*/("""
          """),format.raw/*92.11*/("""<tr><td><a href=""""),_display_(/*92.29*/routes/*92.35*/.JobController.getJob(i)),format.raw/*92.59*/("""">"""),_display_(/*92.62*/j/*92.63*/.getTitle()),format.raw/*92.74*/("""</a></td><td>"""),_display_(/*92.88*/j/*92.89*/.getDescription),format.raw/*92.104*/("""</td><td>"""),_display_(/*92.114*/j/*92.115*/.getSalary()),format.raw/*92.127*/("""</td><td>"""),_display_(/*92.137*/j/*92.138*/.getCompany()),format.raw/*92.151*/("""</td>
          </tr>

        """)))}),format.raw/*95.10*/("""

        """),format.raw/*97.9*/("""</tbody>
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
                  DATE: Fri Nov 30 12:55:01 EST 2018
                  SOURCE: C:/sbt/jobappv1/app/views/search.scala.html
                  HASH: ac6ba9ecf45dc0baa9913c90d4110154658872aa
                  MATRIX: 968->1|1103->41|1133->45|1172->58|1199->59|1249->82|1277->83|1309->89|1340->94|1367->95|1399->101|1487->163|1514->164|1547->170|1583->178|1612->179|1645->185|1725->238|1753->239|1786->245|1824->255|1853->256|1886->262|2069->418|2097->419|2130->425|2174->441|2203->442|2236->448|2309->494|2337->495|2370->501|2415->518|2444->519|2477->525|2553->574|2581->575|2614->581|2667->606|2696->607|2729->613|2880->737|2908->738|2943->746|3002->777|3031->778|3064->784|3128->820|3157->821|3192->829|3345->955|3373->956|3406->962|3459->987|3488->988|3523->996|3579->1025|3607->1026|3638->1030|3666->1031|3701->1039|3742->1052|3771->1053|3805->1060|3878->1106|3906->1107|3945->1119|4058->1205|4073->1211|4116->1233|4169->1259|4184->1265|4230->1290|4283->1316|4298->1322|4397->1400|4443->1420|4458->1426|4525->1484|4565->1486|4600->1495|4615->1501|4651->1516|4686->1525|4701->1531|4753->1562|4790->1572|4864->1616|4897->1622|4934->1632|4949->1638|4997->1665|5245->1886|5293->1918|5333->1920|5373->1932|5418->1950|5433->1956|5478->1980|5508->1983|5518->1984|5550->1995|5591->2009|5601->2010|5638->2025|5676->2035|5687->2036|5721->2048|5759->2058|5770->2059|5805->2072|5871->2107|5910->2119
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|90->58|90->58|90->58|91->59|93->61|93->61|96->64|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|108->76|109->77|110->78|110->78|110->78|110->78|123->91|123->91|123->91|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|127->95|129->97
                  -- GENERATED --
              */
          