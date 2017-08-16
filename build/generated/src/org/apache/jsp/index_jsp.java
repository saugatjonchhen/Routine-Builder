package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Routine Builder Login</title>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Top content -->\n");
      out.write("        <div class=\"top-content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8 col-sm-offset-2 text\">\n");
      out.write("                        <h1>Web Based Routine Builder </h1>\n");
      out.write("                        <div class=\"description\">\n");
      out.write("                            <p>\n");
      out.write("                                Routine Builder is an application designed to help design a routine or time table for teachers, students, subjects and time slots, in such a way that is it satisfies as nearly as possible the constraints imposed by a particular educational institution. It is an automated system which helps to create personalized schedules. \n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-10 col-sm-offset-1 show-forms\">\n");
      out.write("                        <span class=\"show-register-form active\">Register</span> \n");
      out.write("                        <span class=\"show-forms-divider\">/</span> \n");
      out.write("                        <span class=\"show-login-form\">Login</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row register-form\">\n");
      out.write("                    <div class=\"col-sm-4 col-sm-offset-1\">\n");
      out.write("                        <form role=\"form\" action=\"RegisterController\" method=\"post\" class=\"r-form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"r-form-first-name\">First name</label>\n");
      out.write("                                <input type=\"text\" name=\"fName\" placeholder=\"First name...\" class=\"r-form-first-name form-control\" id=\"r-form-first-name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"r-form-last-name\">Last name</label>\n");
      out.write("                                <input type=\"text\" name=\"lName\" placeholder=\"Last name...\" class=\"r-form-last-name form-control\" id=\"r-form-last-name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"r-form-email\">Email</label>\n");
      out.write("                                <input type=\"text\" name=\"eMail\" placeholder=\"Email...\" class=\"r-form-email form-control\" id=\"r-form-email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"r-form-about-yourself\">About yourself</label>\n");
      out.write("                                <textarea name=\"abtYou\" placeholder=\"About yourself...\" \n");
      out.write("                                          class=\"r-form-about-yourself form-control\" id=\"r-form-about-yourself\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"l-form-username\">Username</label>\n");
      out.write("                                <input type=\"text\" name=\"uName\" placeholder=\"Username...\" class=\"l-form-username form-control\" id=\"l-form-username\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"l-form-password\">Password</label>\n");
      out.write("                                <input type=\"password\" name=\"passWd\" placeholder=\"Password...\" class=\"l-form-password form-control\" id=\"l-form-password\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn\">Sign me up!</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 forms-right-icons\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-2 icon\"><i class=\"fa fa-pencil\"></i></div>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <h3>Beautiful Forms</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-2 icon\"><i class=\"fa fa-commenting\"></i></div>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <h3>Awesome Login</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-2 icon\"><i class=\"fa fa-magic\"></i></div>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <h3>Great Registration</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row login-form\">\n");
      out.write("                    <div class=\"col-sm-4 col-sm-offset-1\">\n");
      out.write("                        <form role=\"form\" action=\"LoginController\" method=\"post\" class=\"l-form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"l-form-username\">Username</label>\n");
      out.write("                                <input type=\"text\" name=\"uName\" placeholder=\"Username...\" class=\"l-form-username form-control\" id=\"l-form-username\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"l-form-password\">Password</label>\n");
      out.write("                                <input type=\"password\" name=\"passWd\" placeholder=\"Password...\" class=\"l-form-password form-control\" id=\"l-form-password\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn\" >Sign in!</button>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"social-login\">\n");
      out.write("                            <!--                        \t<p>Or login with:</p>\n");
      out.write("                                                            <div class=\"social-login-buttons\">\n");
      out.write("                                                                    <a class=\"btn btn-link-1\" href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                                                    <a class=\"btn btn-link-1\" href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                                                    <a class=\"btn btn-link-1\" href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                                                            </div>-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 forms-right-icons\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-2 icon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <h3>New Features</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-2 icon\"><i class=\"fa fa-eye\"></i></div>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <h3>Easy To Use</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-2 icon\"><i class=\"fa fa-twitter\"></i></div>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <h3>Social Integrated</h3>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-8 col-sm-offset-2\">\n");
      out.write("                        <div class=\"footer-border\"></div>\n");
      out.write("                        <p>Made by @Saugat Jonchhen</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Javascript -->\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.backstretch.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 10]>\n");
      out.write("            <script src=\"assets/js/placeholder.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </body>\n");
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
