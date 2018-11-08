
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


Seq[Any](format.raw/*1.39*/("""{"""),format.raw/*1.40*/("""
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
          """),format.raw/*79.11*/("""<tr><td><a href=""""),_display_(/*79.29*/routes/*79.35*/.JobController.getJob(i)),format.raw/*79.59*/("""">"""),_display_(/*79.62*/j/*79.63*/.getTitle()),format.raw/*79.74*/("""</a></td><td>"""),_display_(/*79.88*/j/*79.89*/.getDescription),format.raw/*79.104*/("""</td><td>"""),_display_(/*79.114*/j/*79.115*/.getSalary()),format.raw/*79.127*/("""</td><td><button type="submit" onclick="sendPostRequest('"""),_display_(/*79.185*/routes/*79.191*/.JobController.deleteJob(i)),format.raw/*79.218*/("""')">Remove</button></td></tr>
        """)))}),format.raw/*80.10*/("""


        """),format.raw/*83.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*88.66*/("""
    """),_display_(/*89.6*/if(form.hasGlobalErrors)/*89.30*/ {_display_(Seq[Any](format.raw/*89.32*/("""
        """),_display_(/*90.10*/form/*90.14*/.globalErrors.asScala.map/*90.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*90.88*/("""
            """),format.raw/*91.13*/("""<div>
                """),_display_(/*92.18*/error/*92.23*/.key),format.raw/*92.27*/(""": """),_display_(/*92.30*/error/*92.35*/.message),format.raw/*92.43*/("""
            """),format.raw/*93.13*/("""</div>
        """)))}),format.raw/*94.10*/("""
    """)))}),format.raw/*95.6*/("""

    """),_display_(/*97.6*/helper/*97.12*/.form(routes.JobController.createJob())/*97.51*/ {_display_(Seq[Any](format.raw/*97.53*/("""
        """),_display_(/*98.10*/helper/*98.16*/.CSRF.formField),format.raw/*98.31*/("""

        """),_display_(/*100.10*/helper/*100.16*/.inputText(form("title"))),format.raw/*100.41*/("""

        """),_display_(/*102.10*/helper/*102.16*/.textarea(form("description"))),format.raw/*102.46*/("""

        """),_display_(/*104.10*/helper/*104.16*/.inputText(form("salary"))),format.raw/*104.42*/("""

        """),format.raw/*106.9*/("""<button type="submit">Create Job</button>
    """)))}),format.raw/*107.6*/("""

"""),format.raw/*109.1*/("""}"""),format.raw/*109.2*/("""
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
                  DATE: Thu Nov 08 14:21:53 EST 2018
                  SOURCE: C:/Users/KEN/Desktop/Penn State/Fall 18/IST 411/Project/jobAppv1/jobappv1/app/views/jobList.scala.html
                  HASH: a2b38f3f4010d2df1a70ba88b0baa0cf7715a842
                  MATRIX: 966->1|1098->38|1126->39|1156->43|1195->56|1222->57|1272->80|1300->81|1332->87|1363->92|1390->93|1422->99|1510->161|1537->162|1570->168|1606->176|1635->177|1668->183|1748->236|1776->237|1809->243|1847->253|1876->254|1909->260|2092->416|2120->417|2153->423|2197->439|2226->440|2259->446|2332->492|2360->493|2393->499|2438->516|2467->517|2500->523|2576->572|2604->573|2637->579|2690->604|2719->605|2752->611|2903->735|2931->736|2964->742|3023->773|3052->774|3085->780|3149->816|3178->817|3213->825|3366->951|3394->952|3427->958|3480->983|3509->984|3544->992|3600->1021|3628->1022|3659->1026|3687->1027|3718->1031|3831->1117|3846->1123|3889->1145|3942->1171|3957->1177|4003->1202|4056->1228|4071->1234|4170->1312|4459->1574|4507->1606|4547->1608|4587->1620|4632->1638|4647->1644|4692->1668|4722->1671|4732->1672|4764->1683|4805->1697|4815->1698|4852->1713|4890->1723|4901->1724|4935->1736|5021->1794|5037->1800|5086->1827|5157->1867|5198->1881|5269->1985|5302->1992|5335->2016|5375->2018|5413->2029|5426->2033|5460->2058|5547->2107|5589->2121|5640->2145|5654->2150|5679->2154|5709->2157|5723->2162|5752->2170|5794->2184|5842->2201|5879->2208|5914->2217|5929->2223|5977->2262|6017->2264|6055->2275|6070->2281|6106->2296|6147->2309|6163->2315|6210->2340|6251->2353|6267->2359|6319->2389|6360->2402|6376->2408|6424->2434|6464->2446|6543->2494|6575->2498|6604->2499
                  LINES: 28->1|33->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|89->57|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|110->78|110->78|110->78|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|111->79|112->80|115->83|120->88|121->89|121->89|121->89|122->90|122->90|122->90|122->90|123->91|124->92|124->92|124->92|124->92|124->92|124->92|125->93|126->94|127->95|129->97|129->97|129->97|129->97|130->98|130->98|130->98|132->100|132->100|132->100|134->102|134->102|134->102|136->104|136->104|136->104|138->106|139->107|141->109|141->109
                  -- GENERATED --
              */
          