
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


Seq[Any](format.raw/*1.65*/("""

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
                  DATE: Sun Dec 02 13:49:17 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/job.scala.html
                  HASH: 41417b58b9c5c945a54be68ea2db53ffd90b0136
                  MATRIX: 974->1|1132->64|1162->68|1234->114|1261->115|1311->138|1339->139|1369->143|1400->148|1427->149|1457->153|1542->211|1570->212|1601->216|1636->224|1665->225|1696->229|1772->278|1800->279|1831->283|1869->293|1898->294|1929->298|2098->440|2126->441|2157->445|2201->461|2230->462|2261->466|2330->508|2358->509|2389->513|2434->530|2463->531|2494->535|2566->580|2594->581|2625->585|2678->610|2707->611|2738->615|2877->727|2905->728|2936->732|2995->763|3024->764|3055->768|3119->804|3148->805|3181->811|3322->925|3350->926|3381->930|3434->955|3463->956|3496->962|3550->989|3578->990|3607->992|3635->993|3666->997|3707->1010|3736->1011|3769->1017|3915->1136|3943->1137|3974->1141|4014->1153|4043->1154|4076->1160|4380->1437|4408->1438|4439->1442|4482->1457|4511->1458|4544->1464|4875->1768|4903->1769|4932->1771|5030->1842|5045->1848|5088->1870|5139->1894|5154->1900|5200->1925|5251->1949|5266->1955|5365->2033|5409->2051|5424->2057|5491->2115|5531->2117|5562->2122|5577->2128|5613->2143|5649->2151|5713->2187|5729->2193|5803->2245|5950->2361|5982->2365|6020->2375|6036->2381|6085->2408|6150->2446|6166->2452|6220->2496|6261->2498|6300->2509|6316->2515|6353->2530|6392->2541|6408->2547|6455->2572|6494->2583|6510->2589|6563->2620|6602->2631|6618->2637|6666->2663|6705->2674|6721->2680|6770->2707|6808->2717|6887->2765|6921->2771
                  LINES: 28->1|33->1|35->3|38->6|38->6|38->6|38->6|40->8|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|48->16|48->16|50->18|50->18|50->18|51->19|58->26|58->26|60->28|60->28|60->28|61->29|63->31|63->31|65->33|65->33|65->33|66->34|68->36|68->36|70->38|70->38|70->38|71->39|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|81->49|87->55|87->55|88->56|88->56|88->56|89->57|90->58|90->58|91->59|91->59|93->61|93->61|93->61|94->62|99->67|99->67|101->69|101->69|101->69|102->70|109->77|109->77|111->79|111->79|111->79|112->80|120->88|120->88|121->89|126->94|126->94|126->94|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|129->97|130->98|130->98|130->98|132->100|134->102|134->102|134->102|139->107|140->108|140->108|140->108|140->108|143->111|143->111|143->111|143->111|144->112|144->112|144->112|145->113|145->113|145->113|146->114|146->114|146->114|147->115|147->115|147->115|148->116|148->116|148->116|149->117|150->118|152->120
                  -- GENERATED --
              */
          