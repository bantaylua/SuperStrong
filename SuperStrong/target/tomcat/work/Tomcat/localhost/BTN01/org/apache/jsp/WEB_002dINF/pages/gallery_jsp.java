/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-29 10:27:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--A Design by W3layouts\r\n");
      out.write("Author: W3layout\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Kitchen Food a Hotels and Restaurants Category  Bootstrap responsive Website Template | Gallery :: w3layouts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"keywords\" content=\"Kitchen Food Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- bootstrap-css -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// bootstrap-css -->\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// css -->\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<!-- gallery -->\r\n");
      out.write("<link href='css/simplelightbox.min.css' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- //gallery -->\r\n");
      out.write("<!-- font -->\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //font -->\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script> \r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- banner -->\r\n");
      out.write("\t<div class=\"banner\">\r\n");
      out.write("\t\t<div class=\"header-top-grids\">\r\n");
      out.write("\t\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t\t\t<div class=\"header-left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts-logo\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Kitchen <span>food</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"top-nav\">\r\n");
      out.write("\t\t\t\t<div class=\"top-nav-info\">\r\n");
      out.write("\t\t\t\t\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"about.html\">About</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"active\" href=\"gallery.html\">Gallery</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"codes.html\" class=\"dropdown-toggle\" data-hover=\"Pages\" data-toggle=\"dropdown\">Pages <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"icons.html\">Icons</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"codes.html\">Short Codes</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"danhsachmonan.html\">Danh sách món ăn</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"danhsachchinhanh.html\">Danh sách chi nhánh</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"giohang.html\">Giỏ hàng</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"lichsudonhang.html\">Lịch sử đơn hàng</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"timkiemmonan.html\">Tìm kiếm món ăn</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t</nav>\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"wthree-heading\">\r\n");
      out.write("\t\t\t<h2>Gallery</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //banner -->\r\n");
      out.write("\t<!-- gallery -->\r\n");
      out.write("\t<div class=\"gallery-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"gallery\">\t\r\n");
      out.write("\t\t\t\t<div class=\"gallery-bg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-bg-text effect-2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g1.jpg\" class=\"big\"><img src=\"images/g1.jpg\" alt=\"\" title=\"Maecenas aliquam nec arcu at efficitur. Praesent cursus aliquam erat a commodo.\" /></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g2.jpg\"><img src=\"images/g2.jpg\" alt=\"\" title=\"Donec dictum nisi sit amet ex volutpat interdum.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g3.jpg\"><img src=\"images/g3.jpg\" alt=\"\" title=\"Ut dignissim ipsum dolor, in scelerisque neque commodo sit amet.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g4.jpg\"><img src=\"images/g4.jpg\" alt=\"\" title=\"Nulla molestie nulla et dolor commodo pharetra.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g5.jpg\"><img src=\"images/g5.jpg\" alt=\"\" title=\"Maecenas aliquam nec arcu at efficitur. Praesent cursus aliquam erat a commodo.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-bg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-bg-text effect-2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g7.jpg\" class=\"big\"><img src=\"images/g7.jpg\" alt=\"\" title=\"Maecenas aliquam nec arcu at efficitur. Praesent cursus aliquam erat a commodo.\" /></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g6.jpg\"><img src=\"images/g6.jpg\" alt=\"\" title=\"Maecenas aliquam nec arcu at efficitur.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g8.jpg\"><img src=\"images/g8.jpg\" alt=\"\" title=\"Nulla molestie nulla et dolor commodo pharetra.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"gallery-bg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-bg-text effect-2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g9.jpg\" class=\"big\"><img src=\"images/g9.jpg\" alt=\"\" title=\"Maecenas aliquam nec arcu at efficitur. Praesent cursus aliquam erat a commodo.\" /></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g2.jpg\"><img src=\"images/g2.jpg\" alt=\"\" title=\"Maecenas aliquam nec arcu at efficitur. Praesent cursus aliquam erat a commodo.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g5.jpg\"><img src=\"images/g5.jpg\" alt=\"\" title=\"Maecenas aliquam nec arcu at efficitur.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-small gallery-middle\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agileits-gallery gallery-small-text effect-3\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g6.jpg\"><img src=\"images/g6.jpg\" alt=\"\" title=\"Nulla molestie nulla et dolor commodo pharetra.\"/></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"js/simple-lightbox.js\"></script>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\tvar $gallery = $('.gallery a').simpleLightbox();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$gallery.on('show.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Requested for showing');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('shown.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Shown');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('close.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Requested for closing');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('closed.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Closed');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('change.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Requested for change');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('next.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Requested for next');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('prev.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Requested for prev');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('nextImageLoaded.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Next image loaded');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('prevImageLoaded.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Prev image loaded');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('changed.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Image changed');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('nextDone.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Image changed to next');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('prevDone.simplelightbox', function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('Image changed to prev');\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t.on('error.simplelightbox', function(e){\r\n");
      out.write("\t\t\t\t\t\tconsole.log('No image found, go to the next/prev');\r\n");
      out.write("\t\t\t\t\t\tconsole.log(e);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //gallery -->\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"agileinfo_footer_grids\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 agileinfo_footer_grid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agile-logo\">\r\n");
      out.write("\t\t\t\t\t\t<h4><a href=\"index.html\">Kitchen <span>Food</span></a></h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc non risus et ex bibendum posuere. Morbi semper leo sed tincidunt rhoncus. Curabitur nec erat rhoncus, efficitur nibh ac, porta leo. Nullam luctus lacinia urna sagittis tempus. </p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 agileinfo_footer_grid\">\r\n");
      out.write("\t\t\t\t\t<h3>Contact Info</h3>\r\n");
      out.write("\t\t\t\t\t<ul class=\"agileinfo_footer_grid_list\">\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>1234k Avenue, 4th block, <span>New York City.</span></li>\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">info@example.com</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>+1234 567 567</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 agileinfo_footer_grid\">\r\n");
      out.write("\t\t\t\t\t<h3>Navigation</h3>\r\n");
      out.write("\t\t\t\t\t<ul class=\"agileinfo_footer_grid_nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span><a href=\"about.html\">About</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span><a href=\"gallery.html\">Gallery</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span><a href=\"codes.html\">Short Codes</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span><a href=\"icons.html\">Icons</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span><a href=\"contact.html\">Mail Us</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w3agile_footer_copy\">\r\n");
      out.write("\t\t\t\t<p>&copy; 2017 Kitchen Food. All rights reserved | Design by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //footer -->\r\n");
      out.write("\t<script src=\"js/SmoothScroll.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("\t<!-- here stars scrolling icon -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\t\tvar defaults = {\r\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\r\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\r\n");
      out.write("\t\t\t\teasingType: 'linear' \r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- //here ends scrolling icon -->\r\n");
      out.write("</body>\t\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}