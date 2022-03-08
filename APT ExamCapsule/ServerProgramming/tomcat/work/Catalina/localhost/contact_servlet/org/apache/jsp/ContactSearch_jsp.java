/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.14
 * Generated at: 2022-01-05 12:02:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class ContactSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Contact Search</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!--java code goes here-->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    ");
  
    Connection conn2 = null;
    String query = request.getParameter("query");
    try{
        conn2 = DriverManager.getConnection("jdbc:sqlite:/home/rishav/Git/assignment/APT/JAVA-Programming-Assignment/apache-tomcat-10.0.14/webapps/contact_servlet/contacts.db");
    }catch(Exception e){
        e.getMessage();
    }  
    
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <style>\n");
      out.write("            input{\n");
      out.write("                height: 100px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("                width: 300px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                height: 100px;\n");
      out.write("                width: 200px;\n");
      out.write("                background-color: brown;\n");
      out.write("                font-size: large;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            #query{\n");
      out.write("                font-size: x-large;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <h1>Contact Search JSP Implementation</h1>\n");
      out.write("        <form id=\"form\" method=\"POST\" action=\"ContactSearch.jsp\"> \n");
      out.write("        <input type=\"search\" id=\"query\" name=\"query\" placeholder=\"Search using name\">\n");
      out.write("        <button type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        <hr>\n");
      out.write("        <table border=1 width=50% height=50%>  \n");
      out.write("        ");

        try{
           Statement stmt = conn2.createStatement();  
            ResultSet result = stmt.executeQuery("SELECT * FROM CONTACTS WHERE NAME="+"'"+query+"'"); 
            
      out.write(" \n");
      out.write("            <tr><th>CID</th><th>NAME</th><th>EMAIL</th><tr>\n");
      out.write("            <table border=1 width=50% height=50%> \n");
      out.write("            ");

            while (result.next()){  
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(result.getInt("CID") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("NAME") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("EMAIL") );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    }  
            conn2.close();
            }catch(Exception ex){
                
      out.write("\n");
      out.write("                <p> ");
      out.print( ex.getMessage() );
      out.write(" </p>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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