
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

object apply extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Job,Form[ApplyForm],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(job: Job, applyForm: Form[ApplyForm], index: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""
"""))
      }
    }
  }

  def render(job:Job,applyForm:Form[ApplyForm],index:Int): play.twirl.api.HtmlFormat.Appendable = apply(job,applyForm,index)

  def f:((Job,Form[ApplyForm],Int) => play.twirl.api.HtmlFormat.Appendable) = (job,applyForm,index) => apply(job,applyForm,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 17:30:20 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/apply.scala.html
                  HASH: 7ecea532175bd5db1cd6eb393ff3ae5ac4fb8456
                  MATRIX: 965->1|1110->51
                  LINES: 28->1|33->1
                  -- GENERATED --
              */
          