
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
<meta charset="utf-8" />
<title>"""),_display_(Seq[Any](/*8.9*/title)),format.raw/*8.14*/("""</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta content="" name="description" />
<meta content="" name="author" />

<script src=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("js/jquery-1.7.1.min.js"))),format.raw/*13.57*/("""" type="text/javascript"></script>  

<!-- BEGIN PLUGIN CSS -->
<link href=""""),_display_(Seq[Any](/*16.14*/routes/*16.20*/.Assets.at("plugins/fullcalendar/fullcalendar.css"))),format.raw/*16.71*/("""" rel="stylesheet" type="text/css" media="screen"/>
<link href=""""),_display_(Seq[Any](/*17.14*/routes/*17.20*/.Assets.at("plugins/pace/pace-theme-flash.css"))),format.raw/*17.67*/("""" rel="stylesheet" type="text/css" media="screen"/>
<link href=""""),_display_(Seq[Any](/*18.14*/routes/*18.20*/.Assets.at("plugins/gritter/css/jquery.gritter.css"))),format.raw/*18.72*/("""" rel="stylesheet" type="text/css"/>
<link href=""""),_display_(Seq[Any](/*19.14*/routes/*19.20*/.Assets.at("plugins/bootstrap-datepicker/css/datepicker.css"))),format.raw/*19.81*/("""" rel="stylesheet" type="text/css" />
<link href=""""),_display_(Seq[Any](/*20.14*/routes/*20.20*/.Assets.at("plugins/jquery-ricksaw-chart/css/rickshaw.css"))),format.raw/*20.79*/("""" rel="stylesheet" type="text/css" media="screen" charset="utf-8">
<link href=""""),_display_(Seq[Any](/*21.14*/routes/*21.20*/.Assets.at("plugins/jquery-morris-chart/css/morris.css"))),format.raw/*21.76*/("""" rel="stylesheet" type="text/css" media="screen" charset="utf-8">
<link href=""""),_display_(Seq[Any](/*22.14*/routes/*22.20*/.Assets.at("plugins/jquery-slider/css/jquery.sidr.light.css"))),format.raw/*22.81*/("""" rel="stylesheet" type="text/css" media="screen"/>
<link href=""""),_display_(Seq[Any](/*23.14*/routes/*23.20*/.Assets.at("plugins/bootstrap-select2/select2.css"))),format.raw/*23.71*/("""" rel="stylesheet" type="text/css" media="screen"/>
<link href=""""),_display_(Seq[Any](/*24.14*/routes/*24.20*/.Assets.at("plugins/jquery-jvectormap/css/jquery-jvectormap-1.2.2.css"))),format.raw/*24.91*/("""" rel="stylesheet" type="text/css" media="screen"/>
<link href=""""),_display_(Seq[Any](/*25.14*/routes/*25.20*/.Assets.at("plugins/boostrap-checkbox/css/bootstrap-checkbox.css"))),format.raw/*25.86*/("""" rel="stylesheet" type="text/css" media="screen"/>
<!-- END PLUGIN CSS -->

<!-- BEGIN CORE CSS FRAMEWORK -->
<link href=""""),_display_(Seq[Any](/*29.14*/routes/*29.20*/.Assets.at("plugins/bootstrap/css/bootstrap.min.css"))),format.raw/*29.73*/("""" rel="stylesheet" type="text/css"/>
<link href=""""),_display_(Seq[Any](/*30.14*/routes/*30.20*/.Assets.at("plugins/bootstrap/css/bootstrap-responsive.min.css"))),format.raw/*30.84*/("""" rel="stylesheet" type="text/css"/>
<link href=""""),_display_(Seq[Any](/*31.14*/routes/*31.20*/.Assets.at("plugins/font-awesome/css/font-awesome.css"))),format.raw/*31.75*/("""" rel="stylesheet" type="text/css"/>
<link href=""""),_display_(Seq[Any](/*32.14*/routes/*32.20*/.Assets.at("css/animate.min.css"))),format.raw/*32.53*/("""" rel="stylesheet" type="text/css"/>
<!-- END CORE CSS FRAMEWORK -->

<!-- BEGIN CSS TEMPLATE -->
<link href=""""),_display_(Seq[Any](/*36.14*/routes/*36.20*/.Assets.at("css/style.css"))),format.raw/*36.47*/("""" rel="stylesheet" type="text/css"/>
<link href=""""),_display_(Seq[Any](/*37.14*/routes/*37.20*/.Assets.at("css/responsive.css"))),format.raw/*37.52*/("""" rel="stylesheet" type="text/css"/>
<link href=""""),_display_(Seq[Any](/*38.14*/routes/*38.20*/.Assets.at("css/custom-icon-set.css"))),format.raw/*38.57*/("""" rel="stylesheet" type="text/css"/>
<!-- END CSS TEMPLATE -->
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="">
<!-- BEGIN HEADER -->
<div class="header navbar navbar-inverse "> 
  <!-- BEGIN TOP NAVIGATION BAR -->
  <div class="navbar-inner">
	<div class="header-seperation"> 
		<ul class="nav pull-left notifcation-center" id="main-menu-toggle-wrapper" style="display:none">	
		 <li class="dropdown"> <a id="main-menu-toggle" href="#main-menu"  class="" > <div class="iconset top-menu-toggle-white"></div> </a> </li>		 
		</ul>
      <!-- BEGIN LOGO -->	
      <a href="index.html"><img src=""""),_display_(Seq[Any](/*54.39*/routes/*54.45*/.Assets.at("img/logo.png"))),format.raw/*54.71*/("""" class="logo pull-left"  data-src=""""),_display_(Seq[Any](/*54.108*/routes/*54.114*/.Assets.at("img/logo.png"))),format.raw/*54.140*/("""" data-src-retina=""""),_display_(Seq[Any](/*54.160*/routes/*54.166*/.Assets.at("img/logo2x.png"))),format.raw/*54.194*/("""" width="106" height="92"/></a>
      <!-- END LOGO --> 
      <ul class="nav pull-right notifcation-center">	
        <li class="dropdown" id="header_task_bar"> <a href="index.html" class="dropdown-toggle active" data-toggle=""> <div class="iconset top-home"></div> </a> </li>
        <li class="dropdown" id="header_inbox_bar" > <a href="email.html" class="dropdown-toggle" > <div class="iconset top-messages"></div>  <span class="badge" id="msgs-badge">2</span> </a>
		<li class="dropdown" id="portrait-chat-toggler" style="display:none"> <a href="#sidr" class="chat-menu-toggle"> <div class="iconset top-chat-white "></div> </a> </li>        
      </ul>
      </div>
      <!-- END RESPONSIVE MENU TOGGLER --> 
      <div class="header-quick-nav" > 
      <!-- BEGIN TOP NAVIGATION MENU -->
	  <div class="pull-left"> 
		  <ul class="nav quick-section">
			<li class="quicklinks"> <a href="#" class="" id="layout-condensed-toggle" ><div class="iconset top-menu-toggle-dark"></div> </a> </li>        
		  </ul>
		  <ul class="nav quick-section">
			<li class="quicklinks"> <a href="#" class="" ><div class="iconset top-reload"></div> </a> </li> 
			<li class="quicklinks"> <span class="h-seperate"></span></li>
			<li class="quicklinks"> <a href="#" class="" ><div class="iconset top-tiles"></div></a> </li>
			<div class="input-prepend inside search-form no-boarder">
				<span class="add-on"> <a href="#" class="" ><div class="iconset top-search"></div></a></span>
				 <input name="" type="text"  class="no-boarder " placeholder="Search Dashboard" style="width:250px;">
			</div>
		  </ul>
	  </div>
	 <!-- END TOP NAVIGATION MENU -->
	 <!-- BEGIN CHAT TOGGLER -->
      <div class="pull-right"> 
		<div class="chat-toggler">	
				<a href="#" class="dropdown-toggle" id="my-task-list" data-placement="bottom" 
						   data-content='
						<div style="width:300px" class="scroller" data-height="100px">
						  <div class="notification-messages info">
									<div class="user-profile">
										<img src=""""),_display_(Seq[Any](/*88.22*/routes/*88.28*/.Assets.at("img/profiles/d.png"))),format.raw/*88.60*/("""" data-src=""""),_display_(Seq[Any](/*88.73*/routes/*88.79*/.Assets.at("img/profiles/d.png"))),format.raw/*88.111*/("""" data-src-retina=""""),_display_(Seq[Any](/*88.131*/routes/*88.137*/.Assets.at("img/profiles/d2x.png"))),format.raw/*88.171*/("""" width="35" height="35">
									</div>
									<div class="message-wrapper">
										<div class="heading">
											David Nester - Commented on your wall
										</div>
										<div class="description">
											Meeting postponed to tomorrow
										</div>
										<div class="date pull-left">
										A min ago
										</div>										
									</div>
									<div class="clearfix"></div>									
								</div>	
							<div class="notification-messages danger">
								<div class="iconholder">
									<i class="icon-warning-sign"></i>
								</div>
								<div class="message-wrapper">
									<div class="heading">
										Server load limited
									</div>
									<div class="description">
										Database server has reached its daily capicity
									</div>
									<div class="date pull-left">
									2 mins ago
									</div>
								</div>
								<div class="clearfix"></div>
							</div>	
							<div class="notification-messages success">
								<div class="user-profile">
									<img src=""""),_display_(Seq[Any](/*122.21*/routes/*122.27*/.Assets.at("img/profiles/h.png"))),format.raw/*122.59*/("""" data-src=""""),_display_(Seq[Any](/*122.72*/routes/*122.78*/.Assets.at("img/profiles/h.png"))),format.raw/*122.110*/("""" data-src-retina=""""),_display_(Seq[Any](/*122.130*/routes/*122.136*/.Assets.at("img/profiles/h2x.png"))),format.raw/*122.170*/("""" width="35" height="35">
								</div>
								<div class="message-wrapper">
									<div class="heading">
										You haveve got 150 messages
									</div>
									<div class="description">
										150 newly unread messages in your inbox
									</div>
									<div class="date pull-left">
									An hour ago
									</div>									
								</div>
								<div class="clearfix"></div>
							</div>							
						</div>' data-toggle="dropdown" data-original-title="Notifications">
					<div class="user-details"> 
						<div class="username">
							<span class="badge badge-important">3</span> 
							John <span class="bold">Smith</span>									
						</div>						
					</div> 
					<div class="iconset top-down-arrow"></div>
				</a>						
				<div class="profile-pic"> 
					<img alt="" src=""""),_display_(Seq[Any](/*147.24*/routes/*147.30*/.Assets.at("img/profiles/avatar_small.jpg"))),format.raw/*147.73*/("""" data-src=""""),_display_(Seq[Any](/*147.86*/routes/*147.92*/.Assets.at("img/profiles/avatar_small.jpg"))),format.raw/*147.135*/("""" data-src-retina=""""),_display_(Seq[Any](/*147.155*/routes/*147.161*/.Assets.at("img/profiles/avatar_small2x.jpg"))),format.raw/*147.206*/("""" width="35" height="35" /> 
				</div>       			
			</div>
		 <ul class="nav quick-section ">
			<li class="quicklinks"> 
				<a data-toggle="dropdown" class="dropdown-toggle  pull-right" href="#">						
					<div class="iconset top-settings-dark "></div> 	
				</a>
				<ul class="dropdown-menu  pull-right" role="menu" aria-labelledby="dropdownMenu">
                  <li><a href="user-profile.html"> My Account</a>
                  </li>
                  <li><a href="calender.html">My Calendar</a>
                  </li>
                  <li><a href="email.html"> My Inbox&nbsp;&nbsp;<span class="badge badge-important animated bounceIn">2</span></a>
                  </li>
                  <li class="divider"></li>                
                  <li><a href="login.html"><i class="icon-off"></i>&nbsp;&nbsp;Log Out</a></li>
               </ul>
			</li> 
			<li class="quicklinks"> <span class="h-seperate"></span></li> 
			<li class="quicklinks"> 	
			<a id="chat-menu-toggle" href="#sidr" class="chat-menu-toggle" ><div class="iconset top-chat-dark "><span class="badge badge-important hide" id="chat-message-count">1</span></div>
			</a> 
				<div class="simple-chat-popup chat-menu-toggle hide" >
					<div class="simple-chat-popup-arrow"></div><div class="simple-chat-popup-inner">
						 <div style="width:100px">
						 <div class="semi-bold">David Nester</div>
						 <div class="message">Hey you there </div>
						</div>
					</div>
				</div>
			</li> 
		</ul>
      </div>
	   <!-- END CHAT TOGGLER -->
      </div> 
      <!-- END TOP NAVIGATION MENU --> 
   
  </div>
  <!-- END TOP NAVIGATION BAR --> 
</div>
</div>
<!-- END HEADER --> 
<!-- BEGIN CONTAINER -->
<div class="page-container row-fluid"> 
  <!-- BEGIN SIDEBAR -->
  <div class="page-sidebar" id="main-menu"> 
  <!-- BEGIN MINI-PROFILE -->
   <div class="user-info-wrapper">	
	<div class="profile-wrapper">
		<img src=""""),_display_(Seq[Any](/*197.14*/routes/*197.20*/.Assets.at("img/profiles/avatar.jpg"))),format.raw/*197.57*/("""" data-src=""""),_display_(Seq[Any](/*197.70*/routes/*197.76*/.Assets.at("img/profiles/avatar.jpg"))),format.raw/*197.113*/("""" data-src-retina=""""),_display_(Seq[Any](/*197.133*/routes/*197.139*/.Assets.at("img/profiles/avatar2x.jpg"))),format.raw/*197.178*/("""" width="69" height="69" />
	</div>
    <div class="user-info">
      <div class="greeting">Welcome</div>
      <div class="username">John <span class="semi-bold">Smith</span></div>
      <div class="status">Status<a href="#"><div class="status-icon green"></div>Online</a></div>
    </div>
   </div>
  <!-- END MINI-PROFILE -->
  
  <!-- BEGIN MINI-WIGETS -->

   <!-- END MINI-WIGETS -->
   
   <!-- BEGIN SIDEBAR MENU -->	
	<p class="menu-title">BROWSE <span class="pull-right"><a href="javascript:;"><i class="icon-refresh"></i></a></span></p>
    <ul>	
      <li class="start active "> <a href="index.html"> <i class="icon-custom-home"></i> <span class="title">Dashboard</span> <span class="selected"></span> <span class="badge badge-important pull-right">5</span></a> </li>
	  <li class=""> <a href="email.html"> <i class="icon-envelope"></i> <span class="title">Email</span>  <span class=" badge badge-disable pull-right ">203</span></a> </li>      
      <li class=""> <a href="javascript:;"> <i class="icon-custom-ui"></i> <span class="title">UI Elements</span> <span class="arrow "></span> </a>
        <ul class="sub-menu">
		  <li > <a href="typography.html"> Typography </a> </li>
		  <li > <a href="messages_notifications.html"> Messages & Notifications </a> </li>
		   <li > <a href="icons.html">Icons</a> </li>
		   <li > <a href="buttons.html">Buttons</a> </li>		 
          <li > <a href="tabs_accordian.html"> Tabs & Accordions </a> </li>
          <li > <a href="sliders.html">Sliders</a> </li>
          <li > <a href="group_list.html">Group list </a> </li>
        </ul>
      </li>
	  <li class=""> <a href="javascript:;"> <i class="icon-custom-form"></i> <span class="title">Forms</span> <span class="arrow "></span> </a>
        <ul class="sub-menu">
          <li > <a href="form_elements.html">Form Elements </a> </li>
          <li > <a href="form_validations.html">Form Validations</a> </li>
        </ul>
      </li>
      <li class=""> <a href="javascript:;"> <i class="icon-custom-portlets"></i> <span class="title">Grids</span> <span class="arrow "></span> </a>
        <ul class="sub-menu">
          <li > <a href="grids_simple.html">Simple Grids</a> </li>
          <li > <a href="grids_draggable.html">Draggable Grids </a> </li>
        </ul>
      </li>
      <li class=""> <a href="javascript:;"> <i class="icon-custom-thumb"></i> <span class="title">Tables</span> <span class="arrow "></span> </a>
        <ul class="sub-menu">
          <li > <a href="tables.html"> Basic Tables </a> </li>
          <li > <a href="datatables.html"> Data Tables </a> </li>
        </ul>
      </li>
      <li class=""> <a href="javascript:;"> <i class="icon-custom-map"></i> <span class="title">Maps</span> <span class="arrow "></span> </a>
        <ul class="sub-menu">
          <li > <a href="google_map.html"> Google Maps </a> </li>
          <li > <a href="vector_map.html"> Vector Maps </a> </li>
        </ul>
      </li>
      <li class=""> <a href="charts.html"> <i class="icon-custom-chart"></i> <span class="title">Charts</span> </a> </li>    
      <li class=""> <a href="javascript:;"> <i class="icon-custom-extra"></i> <span class="title">Extra</span> <span class="arrow "></span> </a>
        <ul class="sub-menu">
          <li > <a href="user-profile.html"> User Profile </a> </li>
          <li > <a href="gallery.html"> Gallery</a> </li>
		  <li class=""><a href="calender.html"> Calendar</a> </li>
          <li > <a href="search_results.html"> Search Results </a> </li>
          <li > <a href="invoice.html"> Invoice </a> </li>
          <li > <a href="404.html"> 404 Page </a> </li>
          <li > <a href="500.html"> 500 Page </a> </li>
          <li > <a href="blank_template.html"> Blank Page </a> </li>
        </ul>
      </li>
	  <li class="hidden-desktop hidden-phone visible-tablet" id="more-widgets" style="display:" > <a href="javascript:;"> <i class="icon-ellipsis-horizontal"></i></a> 
		  <ul class="sub-menu">
		  	<div class="side-bar-widgets">
			<p class="menu-title">FOLDER <span class="pull-right"><a href="#" class="create-folder"><i class="icon-plus"></i></a></span></p>
			<ul class="folders" id="folders">
				  <li><a href="#"><div class="status-icon green"></div> My quick tasks </a> </li>
				  <li><a href="#"><div class="status-icon red"></div> To do list </a> </li>
				  <li><a href="#"><div class="status-icon blue"></div> Projects </a> </li>
				  <li id="folder-input" class="folder-input" style="display:none"><input type="text" placeholder="Name of folder" class="no-boarder folder-name" name="" id="folder-name"></li>
			</ul>
	<p class="menu-title">PROJECTS </p>
		<div class="status-widget">
			<div class="status-widget-wrapper">
				<div class="title">Freelancer<a href="#" class="remove-widget"><i class="icon-custom-cross"></i></a></div>
				<p>Redesign home page</p>
			</div>
		</div>
		<div class="status-widget">
			<div class="status-widget-wrapper">
				<div class="title">envato<a href="#" class="remove-widget"><i class="icon-custom-cross"></i></a></div>
				<p>Statistical report</p>
			</div>
		</div>
	</div>
		</ul>
	  </li>    
    </ul>
	<div class="side-bar-widgets">
	<p class="menu-title">FOLDER <span class="pull-right"><a href="#" class="create-folder"><i class="icon-plus"></i></a></span></p>
	<ul class="folders" id="folders">
		  <li><a href="#"><div class="status-icon green"></div> My quick tasks </a> </li>
		  <li><a href="#"><div class="status-icon red"></div> To do list </a> </li>
		  <li><a href="#"><div class="status-icon blue"></div> Projects </a> </li>
		  <li id="folder-input" class="folder-input" style="display:none"><input type="text" placeholder="Name of folder" class="no-boarder folder-name" name="" id="folder-name"></li>
	</ul>
	<p class="menu-title">PROJECTS </p>
		<div class="status-widget">
			<div class="status-widget-wrapper">
				<div class="title">Freelancer<a href="#" class="remove-widget"><i class="icon-custom-cross"></i></a></div>
				<p>Redesign home page</p>
			</div>
		</div>
		<div class="status-widget">
			<div class="status-widget-wrapper">
				<div class="title">envato<a href="#" class="remove-widget"><i class="icon-custom-cross"></i></a></div>
				<p>Statistical report</p>
			</div>
		</div>
	</div>

	<a href="#" class="scrollup">Scroll</a>
	<div class="clearfix"></div>
    <!-- END SIDEBAR MENU --> 
  </div>
   <div class="footer-widget">		
	<div class="progress transparent progress-success progress-small no-radius no-margin">
		<div data-percentage="79%" class="bar animate-progress-bar" ></div>		
	</div>
	<div class="pull-right">
		<div class="details-status">
		<span data-animation-duration="560" data-value="86" class="animate-number"></span>%
	</div>	
	<a href="login.html"><i class="icon-off"></i></a></div>
  </div>
  <!-- END SIDEBAR --> 
  <!-- BEGIN PAGE CONTAINER-->
  <div class="page-content"> 
    <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
    <div id="portlet-config" class="modal hide">
      <div class="modal-header">
        <button data-dismiss="modal" class="close" type="button"></button>
        <h3>Widget Settings</h3>
      </div>
      <div class="modal-body"> Widget settings form goes here </div>
    </div>
    <div class="clearfix"></div>
    <div class="content">  
		"""),_display_(Seq[Any](/*341.4*/content)),format.raw/*341.11*/("""			
	</div> 
  </div>  
  <!-- END PAGE --> 
</div>
<!-- END CONTAINER --> 

<!-- BEGIN CORE JS FRAMEWORK--> 
<script src=""""),_display_(Seq[Any](/*349.15*/routes/*349.21*/.Assets.at("plugins/jquery-1.8.3.min.js"))),format.raw/*349.62*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*350.15*/routes/*350.21*/.Assets.at("plugins/jquery-ui/jquery-ui-1.10.1.custom.min.js"))),format.raw/*350.83*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*351.15*/routes/*351.21*/.Assets.at("plugins/bootstrap/js/bootstrap.min.js"))),format.raw/*351.72*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*352.15*/routes/*352.21*/.Assets.at("plugins/breakpoints.js"))),format.raw/*352.57*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*353.15*/routes/*353.21*/.Assets.at("plugins/jquery-unveil/jquery.unveil.min.js"))),format.raw/*353.77*/("""" type="text/javascript"></script> 
<!-- END CORE JS FRAMEWORK --> 
<!--[if lt IE 9]>
	<script src=""""),_display_(Seq[Any](/*356.16*/routes/*356.22*/.Assets.at("plugins/excanvas.js"))),format.raw/*356.55*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*357.16*/routes/*357.22*/.Assets.at("plugins/respond.js"))),format.raw/*357.54*/(""""></script>	
	<![endif]--> 

<!-- BEGIN PAGE LEVEL JS --> 

<script src=""""),_display_(Seq[Any](/*362.15*/routes/*362.21*/.Assets.at("plugins/pace/pace.min.js"))),format.raw/*362.59*/("""" type="text/javascript"></script>  
<script src=""""),_display_(Seq[Any](/*363.15*/routes/*363.21*/.Assets.at("plugins/jquery-slimscroll/jquery.slimscroll.min.js"))),format.raw/*363.85*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*364.15*/routes/*364.21*/.Assets.at("plugins/jquery-numberAnimate/jquery.animateNumbers.js"))),format.raw/*364.88*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*365.15*/routes/*365.21*/.Assets.at("plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"))),format.raw/*365.90*/("""" type="text/javascript"></script>  
<script src=""""),_display_(Seq[Any](/*366.15*/routes/*366.21*/.Assets.at("plugins/jquery-slimscroll/jquery.slimscroll.min.js"))),format.raw/*366.85*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*367.15*/routes/*367.21*/.Assets.at("plugins/jquery-block-ui/jqueryblockui.js"))),format.raw/*367.75*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*368.15*/routes/*368.21*/.Assets.at("plugins/bootstrap-select2/select2.min.js"))),format.raw/*368.75*/("""" type="text/javascript"></script>
<script src=""""),_display_(Seq[Any](/*369.15*/routes/*369.21*/.Assets.at("plugins/jquery-ricksaw-chart/js/raphael-min.js"))),format.raw/*369.81*/(""""></script> 
<script src=""""),_display_(Seq[Any](/*370.15*/routes/*370.21*/.Assets.at("plugins/jquery-ricksaw-chart/js/d3.v2.js"))),format.raw/*370.75*/(""""></script>
<script src=""""),_display_(Seq[Any](/*371.15*/routes/*371.21*/.Assets.at("plugins/jquery-ricksaw-chart/js/rickshaw.min.js"))),format.raw/*371.82*/(""""></script>
<script src=""""),_display_(Seq[Any](/*372.15*/routes/*372.21*/.Assets.at("plugins/jquery-morris-chart/js/morris.min.js"))),format.raw/*372.79*/(""""></script>
<script src=""""),_display_(Seq[Any](/*373.15*/routes/*373.21*/.Assets.at("plugins/jquery-easy-pie-chart/js/jquery.easypiechart.min.js"))),format.raw/*373.94*/(""""></script>
<script src=""""),_display_(Seq[Any](/*374.15*/routes/*374.21*/.Assets.at("plugins/jquery-slider/jquery.sidr.min.js"))),format.raw/*374.75*/("""" type="text/javascript"></script> 	
<script src=""""),_display_(Seq[Any](/*375.15*/routes/*375.21*/.Assets.at("plugins/jquery-jvectormap/js/jquery-jvectormap-1.2.2.min.js"))),format.raw/*375.94*/("""" type="text/javascript"></script> 	
<script src=""""),_display_(Seq[Any](/*376.15*/routes/*376.21*/.Assets.at("plugins/jquery-jvectormap/js/jquery-jvectormap-us-lcc-en.js"))),format.raw/*376.94*/("""" type="text/javascript"></script> 	
<script src=""""),_display_(Seq[Any](/*377.15*/routes/*377.21*/.Assets.at("plugins/jquery-sparkline/jquery-sparkline.js"))),format.raw/*377.79*/(""""></script>
<script src=""""),_display_(Seq[Any](/*378.15*/routes/*378.21*/.Assets.at("plugins/jquery-flot/jquery.flot.min.js"))),format.raw/*378.73*/(""""></script>
<script src=""""),_display_(Seq[Any](/*379.15*/routes/*379.21*/.Assets.at("plugins/jquery-flot/jquery.flot.animator.min.js"))),format.raw/*379.82*/(""""></script>
<script src=""""),_display_(Seq[Any](/*380.15*/routes/*380.21*/.Assets.at("plugins/skycons/skycons.js"))),format.raw/*380.61*/(""""></script>

<!-- END PAGE LEVEL PLUGINS --> 	
<!-- PAGE JS --> 	
<script src=""""),_display_(Seq[Any](/*384.15*/routes/*384.21*/.Assets.at("javascripts/dashboard.js"))),format.raw/*384.59*/("""" type="text/javascript"></script> 

<!-- BEGIN CORE TEMPLATE JS --> 
<script src=""""),_display_(Seq[Any](/*387.15*/routes/*387.21*/.Assets.at("javascripts/core.js"))),format.raw/*387.54*/("""" type="text/javascript"></script> 
<script src=""""),_display_(Seq[Any](/*388.15*/routes/*388.21*/.Assets.at("javascripts/demo.js"))),format.raw/*388.54*/("""" type="text/javascript"></script> 
<!-- END CORE TEMPLATE JS -->

</body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 14 21:41:28 BRT 2014
                    SOURCE: C:/Desenv/Play/play2-crud-activator/play2-crud-activator/app/views/main.scala.html
                    HASH: 5157636aaa53496a38f684a8a8369a37c9d24273
                    MATRIX: 778->1|902->31|1071->166|1097->171|1345->383|1360->389|1418->425|1534->505|1549->511|1622->562|1724->628|1739->634|1808->681|1910->747|1925->753|1999->805|2086->856|2101->862|2184->923|2272->975|2287->981|2368->1040|2485->1121|2500->1127|2578->1183|2695->1264|2710->1270|2793->1331|2895->1397|2910->1403|2983->1454|3085->1520|3100->1526|3193->1597|3295->1663|3310->1669|3398->1735|3562->1863|3577->1869|3652->1922|3739->1973|3754->1979|3840->2043|3927->2094|3942->2100|4019->2155|4106->2206|4121->2212|4176->2245|4327->2360|4342->2366|4391->2393|4478->2444|4493->2450|4547->2482|4634->2533|4649->2539|4708->2576|5369->3201|5384->3207|5432->3233|5506->3270|5522->3276|5571->3302|5628->3322|5644->3328|5695->3356|7781->5406|7796->5412|7850->5444|7899->5457|7914->5463|7969->5495|8026->5515|8042->5521|8099->5555|9219->6638|9235->6644|9290->6676|9340->6689|9356->6695|9412->6727|9470->6747|9487->6753|9545->6787|10420->7625|10436->7631|10502->7674|10552->7687|10568->7693|10635->7736|10693->7756|10710->7762|10779->7807|12780->9771|12796->9777|12856->9814|12906->9827|12922->9833|12983->9870|13041->9890|13058->9896|13121->9935|20583->17361|20613->17368|20782->17500|20798->17506|20862->17547|20950->17598|20966->17604|21051->17666|21139->17717|21155->17723|21229->17774|21317->17825|21333->17831|21392->17867|21480->17918|21496->17924|21575->17980|21716->18084|21732->18090|21788->18123|21853->18151|21869->18157|21924->18189|22040->18268|22056->18274|22117->18312|22206->18364|22222->18370|22309->18434|22397->18485|22413->18491|22503->18558|22591->18609|22607->18615|22699->18684|22788->18736|22804->18742|22891->18806|22979->18857|22995->18863|23072->18917|23160->18968|23176->18974|23253->19028|23340->19078|23356->19084|23439->19144|23504->19172|23520->19178|23597->19232|23661->19259|23677->19265|23761->19326|23825->19353|23841->19359|23922->19417|23986->19444|24002->19450|24098->19523|24162->19550|24178->19556|24255->19610|24344->19662|24360->19668|24456->19741|24545->19793|24561->19799|24657->19872|24746->19924|24762->19930|24843->19988|24907->20015|24923->20021|24998->20073|25062->20100|25078->20106|25162->20167|25226->20194|25242->20200|25305->20240|25426->20324|25442->20330|25503->20368|25627->20455|25643->20461|25699->20494|25787->20545|25803->20551|25859->20584
                    LINES: 26->1|29->1|36->8|36->8|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|116->88|116->88|116->88|116->88|116->88|116->88|116->88|116->88|116->88|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|175->147|175->147|175->147|175->147|175->147|175->147|175->147|175->147|175->147|225->197|225->197|225->197|225->197|225->197|225->197|225->197|225->197|225->197|369->341|369->341|377->349|377->349|377->349|378->350|378->350|378->350|379->351|379->351|379->351|380->352|380->352|380->352|381->353|381->353|381->353|384->356|384->356|384->356|385->357|385->357|385->357|390->362|390->362|390->362|391->363|391->363|391->363|392->364|392->364|392->364|393->365|393->365|393->365|394->366|394->366|394->366|395->367|395->367|395->367|396->368|396->368|396->368|397->369|397->369|397->369|398->370|398->370|398->370|399->371|399->371|399->371|400->372|400->372|400->372|401->373|401->373|401->373|402->374|402->374|402->374|403->375|403->375|403->375|404->376|404->376|404->376|405->377|405->377|405->377|406->378|406->378|406->378|407->379|407->379|407->379|408->380|408->380|408->380|412->384|412->384|412->384|415->387|415->387|415->387|416->388|416->388|416->388
                    -- GENERATED --
                */
            