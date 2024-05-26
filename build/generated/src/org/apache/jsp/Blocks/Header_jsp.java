package org.apache.jsp.Blocks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("  <meta name=\"copyright\" content=\"MACode ID, https://macodeid.com/\">\n");
      out.write("\n");
      out.write("  <title>One Health - Medical Center HTML5 Template</title>\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"Assests/css/maicons.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"Assests/css/bootstrap.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"Assests/vendor/owl-carousel/css/owl.carousel.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"Assests/vendor/animate/animate.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"Assests/css/theme.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Back to top button -->\n");
      out.write("  <div class=\"back-to-top\"></div>\n");
      out.write("\n");
      out.write("  <header>\n");
      out.write("    <div class=\"topbar\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-8 text-sm\">\n");
      out.write("            <div class=\"site-info\">\n");
      out.write("              <a href=\"#\"><span class=\"mai-call text-primary\"></span> +00 123 4455 6666</a>\n");
      out.write("              <span class=\"divider\">|</span>\n");
      out.write("              <a href=\"#\"><span class=\"mai-mail text-primary\"></span> mail@example.com</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-4 text-right text-sm\">\n");
      out.write("            <div class=\"social-mini-button\">\n");
      out.write("              <a href=\"#\"><span class=\"mai-logo-facebook-f\"></span></a>\n");
      out.write("              <a href=\"#\"><span class=\"mai-logo-twitter\"></span></a>\n");
      out.write("              <a href=\"#\"><span class=\"mai-logo-dribbble\"></span></a>\n");
      out.write("              <a href=\"#\"><span class=\"mai-logo-instagram\"></span></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div> <!-- .row -->\n");
      out.write("      </div> <!-- .container -->\n");
      out.write("    </div> <!-- .topbar -->\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light shadow-sm\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\"><span class=\"text-primary\">One</span>-Health</a>\n");
      out.write("\n");
      out.write("        <form action=\"#\">\n");
      out.write("          <div class=\"input-group input-navbar\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("              <span class=\"input-group-text\" id=\"icon-addon1\"><span class=\"mai-search\"></span></span>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Enter keyword..\" aria-label=\"Username\" aria-describedby=\"icon-addon1\">\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupport\" aria-controls=\"navbarSupport\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupport\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link\" href=\"index.jsp\">Home</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"about.jsp\">About Us</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"Doctors.jsp\">Doctors</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"blog.jsp\">News</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"contact.jsp\">Contact</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"btn btn-primary ml-lg-3\" href=\"#\">Login / Register</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div> <!-- .navbar-collapse -->\n");
      out.write("      </div> <!-- .container -->\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
