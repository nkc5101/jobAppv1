
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
      """),format.raw/*79.7*/("""display: inline;
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
<<<<<<< HEAD
                  DATE: Fri Nov 30 12:55:01 EST 2018
                  SOURCE: C:/sbt/jobappv1/app/views/search.scala.html
                  HASH: ac6ba9ecf45dc0baa9913c90d4110154658872aa
                  MATRIX: 968->1|1103->41|1133->45|1172->58|1199->59|1249->82|1277->83|1309->89|1340->94|1367->95|1399->101|1487->163|1514->164|1547->170|1583->178|1612->179|1645->185|1725->238|1753->239|1786->245|1824->255|1853->256|1886->262|2069->418|2097->419|2130->425|2174->441|2203->442|2236->448|2309->494|2337->495|2370->501|2415->518|2444->519|2477->525|2553->574|2581->575|2614->581|2667->606|2696->607|2729->613|2880->737|2908->738|2943->746|3002->777|3031->778|3064->784|3128->820|3157->821|3192->829|3345->955|3373->956|3406->962|3459->987|3488->988|3523->996|3579->1025|3607->1026|3638->1030|3666->1031|3701->1039|3742->1052|3771->1053|3805->1060|3878->1106|3906->1107|3945->1119|4058->1205|4073->1211|4116->1233|4169->1259|4184->1265|4230->1290|4283->1316|4298->1322|4397->1400|4443->1420|4458->1426|4525->1484|4565->1486|4600->1495|4615->1501|4651->1516|4686->1525|4701->1531|4753->1562|4790->1572|4864->1616|4897->1622|4934->1632|4949->1638|4997->1665|5245->1886|5293->1918|5333->1920|5373->1932|5418->1950|5433->1956|5478->1980|5508->1983|5518->1984|5550->1995|5591->2009|5601->2010|5638->2025|5676->2035|5687->2036|5721->2048|5759->2058|5770->2059|5805->2072|5871->2107|5910->2119
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|90->58|90->58|90->58|91->59|93->61|93->61|96->64|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|108->76|109->77|110->78|110->78|110->78|110->78|123->91|123->91|123->91|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|124->92|127->95|129->97
=======
                  DATE: Fri Nov 30 12:09:49 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/search.scala.html
                  HASH: d1b33d56c75ccb75f14317f3b23cd6728b48cda1
                  MATRIX: 968->1|1102->42|1130->44|1168->56|1195->57|1245->80|1273->81|1303->85|1334->90|1361->91|1392->96|1478->156|1505->157|1536->161|1572->169|1601->170|1633->175|1711->226|1739->227|1770->231|1808->241|1837->242|1869->247|2045->396|2073->397|2104->401|2148->417|2177->418|2209->423|2280->467|2308->468|2339->472|2384->489|2413->490|2445->495|2519->542|2547->543|2578->547|2631->572|2660->573|2692->578|2837->696|2865->697|2898->703|2957->734|2986->735|3018->740|3082->776|3111->777|3145->784|3292->904|3320->905|3352->910|3405->935|3434->936|3468->943|3523->971|3551->972|3581->975|3609->976|3642->982|3683->995|3712->996|3746->1003|3887->1117|3915->1118|3948->1124|3988->1136|4017->1137|4051->1144|4410->1476|4438->1477|4471->1483|4514->1498|4543->1499|4577->1506|4623->1525|4651->1526|4684->1532|4792->1613|4807->1619|4850->1641|4902->1666|4917->1672|4963->1697|5015->1722|5030->1728|5129->1806|5174->1825|5189->1831|5256->1889|5296->1891|5330->1899|5345->1905|5381->1920|5415->1928|5430->1934|5503->1986|5538->1994|5630->2056|5662->2061|5699->2071|5714->2077|5762->2104|5998->2312|6047->2344|6088->2346|6128->2357|6174->2375|6190->2381|6236->2405|6267->2408|6278->2409|6311->2420|6353->2434|6364->2435|6402->2450|6441->2460|6453->2461|6488->2473|6527->2483|6539->2484|6575->2497|6639->2529|6677->2539
                  LINES: 28->1|33->2|33->2|34->3|34->3|34->3|34->3|36->5|36->5|36->5|37->6|39->8|39->8|41->10|41->10|41->10|42->11|44->13|44->13|46->15|46->15|46->15|47->16|54->23|54->23|56->25|56->25|56->25|57->26|59->28|59->28|61->30|61->30|61->30|62->31|64->33|64->33|66->35|66->35|66->35|67->36|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|77->46|83->52|83->52|84->53|84->53|84->53|85->54|86->55|86->55|87->56|87->56|89->58|89->58|89->58|90->59|95->64|95->64|97->66|97->66|97->66|98->67|107->76|107->76|109->78|109->78|109->78|110->79|111->80|111->80|113->82|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|125->94|126->95|127->96|127->96|127->96|127->96|140->109|140->109|140->109|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|144->113|146->115
>>>>>>> e2f76cc25a1ce6838cf792a6fc258546983f1b6f
                  -- GENERATED --
              */
          