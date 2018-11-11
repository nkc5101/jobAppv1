
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

object jobList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Job],Form[JobData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobs: Seq[Job], form: Form[JobData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""
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
    <input type="text" placeholder="Search..">
  </div>
    <h1>Jobs</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Delete Job</th>
        </thead>
        <tbody>
        """),_display_(/*78.10*/for((j, i) <- jobs.zipWithIndex) yield /*78.42*/ {_display_(Seq[Any](format.raw/*78.44*/("""
          """),format.raw/*79.11*/("""<tr><td><a href=""""),_display_(/*79.29*/routes/*79.35*/.JobController.getJob(i)),format.raw/*79.59*/("""">"""),_display_(/*79.62*/j/*79.63*/.getTitle()),format.raw/*79.74*/("""</a></td><td>"""),_display_(/*79.88*/j/*79.89*/.getDescription),format.raw/*79.104*/("""</td><td>"""),_display_(/*79.114*/j/*79.115*/.getSalary()),format.raw/*79.127*/("""</td>
            <td>"""),_display_(/*80.18*/helper/*80.24*/.form(routes.JobController.deleteJob(i))/*80.64*/ {_display_(Seq[Any](format.raw/*80.66*/("""

              """),format.raw/*82.15*/("""<button class="delete" href=""""),_display_(/*82.45*/routes/*82.51*/.JobController.deleteJob(i)),format.raw/*82.78*/("""">Delete</button>
              

            """)))}),format.raw/*85.14*/("""

            """),format.raw/*87.13*/("""</td></tr>
        
        """)))}),format.raw/*89.10*/("""

        """),format.raw/*91.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*96.66*/("""
    """),_display_(/*97.6*/if(form.hasGlobalErrors)/*97.30*/ {_display_(Seq[Any](format.raw/*97.32*/("""
        """),_display_(/*98.10*/form/*98.14*/.globalErrors.asScala.map/*98.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*98.88*/("""
            """),format.raw/*99.13*/("""<div>
                """),_display_(/*100.18*/error/*100.23*/.key),format.raw/*100.27*/(""": """),_display_(/*100.30*/error/*100.35*/.message),format.raw/*100.43*/("""
            """),format.raw/*101.13*/("""</div>
        """)))}),format.raw/*102.10*/("""
    """)))}),format.raw/*103.6*/("""

    """),_display_(/*105.6*/helper/*105.12*/.form(routes.JobController.createJob())/*105.51*/ {_display_(Seq[Any](format.raw/*105.53*/("""
        """),_display_(/*106.10*/helper/*106.16*/.CSRF.formField),format.raw/*106.31*/("""

        """),_display_(/*108.10*/helper/*108.16*/.inputText(form("title"))),format.raw/*108.41*/("""

        """),_display_(/*110.10*/helper/*110.16*/.textarea(form("description"))),format.raw/*110.46*/("""

        """),_display_(/*112.10*/helper/*112.16*/.inputText(form("salary"))),format.raw/*112.42*/("""

        """),format.raw/*114.9*/("""<button type="submit">Create Job</button>
    """)))}),format.raw/*115.6*/("""


"""))
      }
    }
  }

  def render(jobs:Seq[Job],form:Form[JobData]): play.twirl.api.HtmlFormat.Appendable = apply(jobs,form)

  def f:((Seq[Job],Form[JobData]) => play.twirl.api.HtmlFormat.Appendable) = (jobs,form) => apply(jobs,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 09 00:57:36 EST 2018
                  SOURCE: C:/Users/KEN/Desktop/Penn State/Fall 18/IST 411/Project/jobAppv1/jobappv1/app/views/jobList.scala.html
                  HASH: 2d2689eafc2afe33166357c7e5d03a12957548e0
                  MATRIX: 966->1|1098->38|1128->42|1167->55|1194->56|1244->79|1272->80|1304->86|1335->91|1362->92|1394->98|1482->160|1509->161|1542->167|1578->175|1607->176|1640->182|1720->235|1748->236|1781->242|1819->252|1848->253|1881->259|2064->415|2092->416|2125->422|2169->438|2198->439|2231->445|2304->491|2332->492|2365->498|2410->515|2439->516|2472->522|2548->571|2576->572|2609->578|2662->603|2691->604|2724->610|2875->734|2903->735|2936->741|2995->772|3024->773|3057->779|3121->815|3150->816|3185->824|3338->950|3366->951|3399->957|3452->982|3481->983|3516->991|3572->1020|3600->1021|3631->1025|3659->1026|3690->1030|3803->1116|3818->1122|3861->1144|3914->1170|3929->1176|3975->1201|4028->1227|4043->1233|4142->1311|4431->1573|4479->1605|4519->1607|4559->1619|4604->1637|4619->1643|4664->1667|4694->1670|4704->1671|4736->1682|4777->1696|4787->1697|4824->1712|4862->1722|4873->1723|4907->1735|4958->1759|4973->1765|5022->1805|5062->1807|5108->1825|5165->1855|5180->1861|5228->1888|5309->1938|5353->1954|5415->1985|5454->1997|5525->2101|5558->2108|5591->2132|5631->2134|5669->2145|5682->2149|5716->2174|5803->2223|5845->2237|5897->2261|5912->2266|5938->2270|5969->2273|5984->2278|6014->2286|6057->2300|6106->2317|6144->2324|6180->2333|6196->2339|6245->2378|6286->2380|6325->2391|6341->2397|6378->2412|6419->2425|6435->2431|6482->2456|6523->2469|6539->2475|6591->2505|6632->2518|6648->2524|6696->2550|6736->2562|6815->2610
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|89->57|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|110->78|110->78|110->78|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|112->80|112->80|112->80|112->80|114->82|114->82|114->82|114->82|117->85|119->87|121->89|123->91|128->96|129->97|129->97|129->97|130->98|130->98|130->98|130->98|131->99|132->100|132->100|132->100|132->100|132->100|132->100|133->101|134->102|135->103|137->105|137->105|137->105|137->105|138->106|138->106|138->106|140->108|140->108|140->108|142->110|142->110|142->110|144->112|144->112|144->112|146->114|147->115
                  -- GENERATED --
              */
          