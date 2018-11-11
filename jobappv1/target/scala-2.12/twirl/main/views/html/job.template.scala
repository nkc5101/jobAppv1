
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

object job extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Job,Form[JobData],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(job: Job, form: Form[JobData], index: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""

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
"""),format.raw/*60.1*/("""</style>
</head>
<body>

<div class="topnav">
  <a class="active" href=""""),_display_(/*65.28*/routes/*65.34*/.MainController.main()),format.raw/*65.56*/("""">Home</a>
  <a href=""""),_display_(/*66.13*/routes/*66.19*/.JobController.listJobs()),format.raw/*66.44*/("""">Jobs</a>
  <a href=""""),_display_(/*67.13*/routes/*67.19*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*67.97*/("""">Profile</a>
  <input type="text" placeholder="Search..">
</div>
  <body>
    """),_display_(/*71.6*/helper/*71.12*/.form(routes.JobController.updateJob(index))/*71.56*/ {_display_(Seq[Any](format.raw/*71.58*/("""
        """),_display_(/*72.10*/helper/*72.16*/.CSRF.formField),format.raw/*72.31*/("""
        """),_display_(/*73.10*/helper/*73.16*/.inputText(form("title"))),format.raw/*73.41*/("""
        """),_display_(/*74.10*/helper/*74.16*/.inputText(form("description"))),format.raw/*74.47*/("""
        """),_display_(/*75.10*/helper/*75.16*/.inputText(form("salary"))),format.raw/*75.42*/("""
        """),format.raw/*76.9*/("""<button type="submit">Update Job</button>
    """)))}),format.raw/*77.6*/("""

  """),format.raw/*79.3*/("""</body>
<html>
"""))
      }
    }
  }

  def render(job:Job,form:Form[JobData],index:Int): play.twirl.api.HtmlFormat.Appendable = apply(job,form,index)

  def f:((Job,Form[JobData],Int) => play.twirl.api.HtmlFormat.Appendable) = (job,form,index) => apply(job,form,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 08 15:14:48 EST 2018
                  SOURCE: C:/Users/KEN/Desktop/Penn State/Fall 18/IST 411/Project/jobAppv1/jobappv1/app/views/job.scala.html
                  HASH: ba2434d9eaa7c831ef2b4b1adb547cbe993ded9d
                  MATRIX: 961->1|1099->44|1129->48|1201->94|1228->95|1278->118|1306->119|1336->123|1367->128|1394->129|1424->133|1509->191|1537->192|1568->196|1603->204|1632->205|1663->209|1739->258|1767->259|1798->263|1836->273|1865->274|1896->278|2065->420|2093->421|2124->425|2168->441|2197->442|2228->446|2297->488|2325->489|2356->493|2401->510|2430->511|2461->515|2533->560|2561->561|2592->565|2645->590|2674->591|2705->595|2844->707|2872->708|2903->712|2962->743|2991->744|3022->748|3086->784|3115->785|3148->791|3289->905|3317->906|3348->910|3401->935|3430->936|3463->942|3517->969|3545->970|3574->972|3602->973|3631->975|3736->1053|3751->1059|3794->1081|3845->1105|3860->1111|3906->1136|3957->1160|3972->1166|4071->1244|4181->1328|4196->1334|4249->1378|4289->1380|4327->1391|4342->1397|4378->1412|4416->1423|4431->1429|4477->1454|4515->1465|4530->1471|4582->1502|4620->1513|4635->1519|4682->1545|4719->1555|4797->1603|4830->1609
                  LINES: 28->1|33->1|35->3|38->6|38->6|38->6|38->6|40->8|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|48->16|48->16|50->18|50->18|50->18|51->19|58->26|58->26|60->28|60->28|60->28|61->29|63->31|63->31|65->33|65->33|65->33|66->34|68->36|68->36|70->38|70->38|70->38|71->39|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|81->49|87->55|87->55|88->56|88->56|88->56|89->57|90->58|90->58|91->59|91->59|92->60|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|103->71|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|107->75|107->75|107->75|108->76|109->77|111->79
                  -- GENERATED --
              */
          