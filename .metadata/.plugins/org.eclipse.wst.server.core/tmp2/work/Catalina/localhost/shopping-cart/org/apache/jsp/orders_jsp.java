/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-12-11 06:04:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.test.connection.DbCon;
import com.test.model.*;
import java.util.*;

public final class orders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/includes/head.jsp", Long.valueOf(1660834324555L));
    _jspx_dependants.put("/includes/footer.jsp", Long.valueOf(1660662137406L));
    _jspx_dependants.put("/includes/navbar.jsp", Long.valueOf(1661061064201L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.test.model");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.test.connection.DbCon");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
 User auth = (User) request.getSession().getAttribute("auth");
    if(auth!=null){
    	request.setAttribute("auth", auth);
    }
    
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    if (cart_list != null) {
    	request.setAttribute("cart_list", cart_list);
    }
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Orders Page</title>\r\n");
      out.write("\r\n");
      out.write("<!-- The jsp:include action tag is used to include the content of another resource it may be jsp, html or servlet. -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" />\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("</head>");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\">E-Commerce Shopping Cart</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"cart.jsp\">Cart<span class=\"badge badge-danger px-1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart_list.size() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      ");
if(auth!= null){ 
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"orders.jsp\">My Orders</a>\r\n");
      out.write("      </li>\r\n");
      out.write("       <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"log-out\">Logout</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      ");
 } else{ 
      out.write("\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"login.jsp\">Login</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      ");
} 
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write('\r');
      out.write('\n');
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" ></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"></script>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
