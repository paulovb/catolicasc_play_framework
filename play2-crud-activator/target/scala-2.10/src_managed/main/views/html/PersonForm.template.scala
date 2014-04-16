
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object PersonForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Person],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(key: Long, personForm: Form[Person]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(if(key != null) "update simple" else "new simple")/*5.57*/ {_display_(Seq[Any](format.raw/*5.59*/("""
        
    <h3>"""),_display_(Seq[Any](/*7.10*/if(key != null)/*7.25*/ {_display_(Seq[Any](format.raw/*7.27*/(""" update simple """)))}/*7.44*/else/*7.49*/{_display_(Seq[Any](format.raw/*7.50*/(""" new simple """)))})),format.raw/*7.63*/(""" </h3>

    """),_display_(Seq[Any](/*9.6*/form(if(key != null) { play.utils.crud.routes.RouterCrudController.update("Person", personForm.get().getKey() + "") } 
          else            { play.utils.crud.routes.RouterCrudController.create("Person") })/*10.92*/ {_display_(Seq[Any](format.raw/*10.94*/(""" 
        
        """),_display_(Seq[Any](/*12.10*/inputText(personForm("name"), args = '_label -> "name"))),format.raw/*12.65*/("""
        <div>
           <input type="submit" class="btn btn-success" value=""""),_display_(Seq[Any](/*14.65*/if(key != null)/*14.80*/ {_display_(Seq[Any](format.raw/*14.82*/(""" Update """)))}/*14.92*/else/*14.97*/{_display_(Seq[Any](format.raw/*14.98*/(""" Create """)))})),format.raw/*14.107*/("""">
        </div>
    """)))})),format.raw/*16.6*/("""
""")))})))}
    }
    
    def render(key:Long,personForm:Form[Person]): play.api.templates.HtmlFormat.Appendable = apply(key,personForm)
    
    def f:((Long,Form[Person]) => play.api.templates.HtmlFormat.Appendable) = (key,personForm) => apply(key,personForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 14 21:46:01 BRT 2014
                    SOURCE: C:/Desenv/Play/play2-crud-activator/play2-crud-activator/app/views/PersonForm.scala.html
                    HASH: a8fbf1a65a5342892748fcf44f3a2aec8a05bf2a
                    MATRIX: 790->1|974->38|1002->94|1039->97|1102->152|1141->154|1197->175|1220->190|1259->192|1293->209|1305->214|1343->215|1387->228|1436->243|1656->454|1696->456|1754->478|1831->533|1948->614|1972->629|2012->631|2040->641|2053->646|2092->647|2134->656|2190->681
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|36->7|36->7|36->7|36->7|38->9|39->10|39->10|41->12|41->12|43->14|43->14|43->14|43->14|43->14|43->14|43->14|45->16
                    -- GENERATED --
                */
            