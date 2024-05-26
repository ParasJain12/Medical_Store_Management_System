package org.apache.jsp.Blocks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <!-- footer section -->\n");
      out.write("  <section class=\"container-fluid footer_section\">\n");
      out.write("    <p>\n");
      out.write("      &copy; 2019 All Rights Reserved. Design by\n");
      out.write("      <a href=\"https://html.design/\">Free Html Templates</a>\n");
      out.write("    </p>\n");
      out.write("  </section>\n");
      out.write("  <!-- footer section -->\n");
      out.write("\n");
      out.write("  <script type=\"text/javascript\" src=\"Assests/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"Assests/js/bootstrap.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/owl.carousel.min.js\">\n");
      out.write("  </script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(\".owl-carousel\").owlCarousel({\n");
      out.write("      loop: true,\n");
      out.write("      margin: 10,\n");
      out.write("      nav: true,\n");
      out.write("      navText: [],\n");
      out.write("      autoplay: true,\n");
      out.write("      responsive: {\n");
      out.write("        0: {\n");
      out.write("          items: 1\n");
      out.write("        },\n");
      out.write("        600: {\n");
      out.write("          items: 2\n");
      out.write("        },\n");
      out.write("        1000: {\n");
      out.write("          items: 4\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(\".owl-2\").owlCarousel({\n");
      out.write("      loop: true,\n");
      out.write("      margin: 10,\n");
      out.write("      nav: true,\n");
      out.write("      navText: [],\n");
      out.write("      autoplay: true,\n");
      out.write("\n");
      out.write("      responsive: {\n");
      out.write("        0: {\n");
      out.write("          items: 1\n");
      out.write("        },\n");
      out.write("        600: {\n");
      out.write("          items: 2\n");
      out.write("        },\n");
      out.write("        1000: {\n");
      out.write("          items: 4\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
