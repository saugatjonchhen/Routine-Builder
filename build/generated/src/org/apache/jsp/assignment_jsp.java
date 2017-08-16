package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.util.Connect;
import java.sql.Connection;

public final class assignment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    //int sem=1;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Assign Subjects to teachers!!</title>\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/form-elements.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Favicon and touch icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            function callservlet()\n");
      out.write("            {\n");
      out.write("                //alert(\"hello\");\n");
      out.write("                document.form1.action = \"AssignmentServlet\";\n");
      out.write("                document.form1.submit();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--");
int semId, id;
      out.write("-->\n");
      out.write("\n");
      out.write("        <div class=\"top-content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8 col-sm-offset-2 text\">\n");
      out.write("                        <h1>Assigning subjects to teachers.</h1>\n");
      out.write("                        <div class=\"description\">\n");
      out.write("                            <p>\n");
      out.write("                                Please assign respected teacher to the corresponding subject.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label>Faculty:</label>\n");
      out.write("\n");
      out.write("                    <label>\n");
      out.write("                        <select>\n");
      out.write("                            <option selected>Bsc.CSIT</option>\n");
      out.write("                        </select>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <form name=\"form1\">\n");
      out.write("                    <div>\n");
      out.write("                        <label>Semester</label>\n");
      out.write("                        <label>\n");
      out.write("                            <center>\n");
      out.write("                                <select name=\"semester\" onchange=\"callservlet();\">\n");
      out.write("                                    <option value=\"0\" selected>--Select-one--</option>\n");
      out.write("                                    <option value=\"1\">1</option>\n");
      out.write("                                    <option value=\"2\">2</option>\n");
      out.write("                                    <option value=\"3\">3</option>\n");
      out.write("                                    <option value=\"4\">4</option>\n");
      out.write("                                    <option value=\"5\">5</option>\n");
      out.write("                                    <option value=\"6\">6</option>\n");
      out.write("                                    <option value=\"7\">7</option>\n");
      out.write("                                    <option value=\"8\">8</option>\n");
      out.write("                                </select>\n");
      out.write("                            </center>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <!--<input type=\"submit\" value=\"Submit\">-->\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        ");

//                            String sem2;
//                            sem2=request.getParameter("semester");
//                            out.println(sem2);
//                            sem=Integer.parseInt(sem2);
//                            out.println(sem);
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div id=\"container\" style=\"width:100%;\">                                   \n");
      out.write("                    <div id=\"left\" style=\"float:left; width:50%;\">\n");
      out.write("                        ");
 for (int i = 1; i <= 5; i += 1) {
      out.write("\n");
      out.write("                        <div class=\"row register-form\">\n");
      out.write("\n");
      out.write("                            <form role=\"form\" method=\"post\" class=\"r-form\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div id=\"left1\" style=\"float:left; width:25%;\">\n");
      out.write("                                        <label for=\"r-form-first-name\">Subject ");
      out.print(i);
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"left2\" style=\"float:left; width:25%;\">\n");
      out.write("\n");
      out.write("                                        <center>\n");
      out.write("                                            ");

                                                try {
                                                    List<String> subjectList = new ArrayList<String>();
                                                    subjectList = (List<String>) request.getAttribute("data");
                                                    if (subjectList == null) {
                                                        out.println("accomList is null, Why is the list null?");
                                                    } else {
                                            
      out.write("\n");
      out.write("                                            <select name=\"subject");
      out.print(i);
      out.write("\">\n");
      out.write("                                                ");

                                                    for (int k = 0; k < subjectList.size(); k++) {
                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print(subjectList.get(k));
      out.write('"');
      out.write('>');
      out.print(subjectList.get(k));
      out.write("</option>\n");
      out.write("                                                ");
}
                                                        }
                                                    } catch (Exception e) {
                                                        out.println("error :" + e);
                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </center>\n");
      out.write("                                        ");

                                        
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </div>                     \n");
      out.write("                    <div id=\"right\" style=\"float:right; width:50%;\"> \n");
      out.write("                        ");
 for (int j = 1; j <= 5; j += 1) {
      out.write("\n");
      out.write("                        <div class=\"row register-form\">\n");
      out.write("                            <form role=\"form\" method=\"post\" class=\"r-form\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div id=\"right1\" style=\"float:left; width:25%;\">\n");
      out.write("                                        <label for=\"r-form-first-name\">Teacher ");
      out.print(j);
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"right2\" style=\"float:left; width:25%;\">\n");
      out.write("                                        ");

                                            try {
                                                Connection con = Connect.connector();
                                                String qry = "SELECT TeacherName FROM teacher_info";
                                                PreparedStatement pst = con.prepareStatement(qry);
                                                ResultSet resultset = pst.executeQuery(qry);
                                        
      out.write("\n");
      out.write("                                        <center>\n");
      out.write("                                            <select name=\"teacher");
      out.print(j);
      out.write("\">\n");
      out.write("                                                ");
  while (resultset.next()) {
      out.write("\n");
      out.write("                                                <option>");
      out.print( resultset.getString(1));
      out.write("</option>\n");
      out.write("                                                ");
 }
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </center>\n");
      out.write("                                        ");

                                                //**Should I input the codes here?**
                                            } catch (Exception e) {
                                                out.println("wrong entry" + e);
                                            }
                                        
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                    </div>                   \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <form name=\"recordForm\" action=\"AssignmentServlet2\" >\n");
      out.write("        ");

        
      out.write("\n");
      out.write("        <button type=\"submit\" class=\"btn\"> Submit </button>\n");
      out.write("    </form>\n");
      out.write("    <br />\n");
      out.write("    <br />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-8 col-sm-offset-2\">\n");
      out.write("                    <div class=\"footer-border\"></div>\n");
      out.write("                    <p>Made by @Saugat Jonchhen</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!--<div><label></label></div>-->\n");
      out.write("    <!-- Javascript -->\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.backstretch.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/js/scripts.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <!--[if lt IE 10]>\n");
      out.write("        <script src=\"assets/js/placeholder.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
