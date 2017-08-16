<%-- 
    Document   : assignment
    Created on : Jun 14, 2017, 6:21:03 PM
    Author     : Saugat
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.util.Connect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    //int sem=1;%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assign Subjects to teachers!!</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
        <script type="text/javascript">

            function callservlet()
            {
                //alert("hello");
                document.form1.action = "AssignmentServlet";
                document.form1.submit();
            }

        </script>
    </head>
    <body>
        <!--<%int semId, id;%>-->
        <div class="top-content">
            <div class="container">


                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1>Assigning subjects to teachers.</h1>
                        <div class="description">
                            <p>
                                Please assign respected teacher to the corresponding subject.
                            </p>
                        </div>
                    </div>
                </div>
                <div>
                    <label>Faculty:</label>

                    <label>
                        <select>
                            <option selected>Bsc.CSIT</option>
                        </select>
                    </label>
                </div>
                <form name="form1">
                    <div>
                        <label>Semester</label>
                        <label>
                            <center>
                                <select name="semester" onchange="callservlet();">
                                    <option value="0" selected>--Select-one--</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                </select>
                            </center>
                        </label>
                    </div>
                    <div>
                        <!--<input type="submit" value="Submit">-->
                    </div>
                    <div>
                        <%
                            //                            String sem2;
                            //                            sem2=request.getParameter("semester");
                            //                            out.println(sem2);
                            //                            sem=Integer.parseInt(sem2);
                            //                            out.println(sem);
                        %>

                    </div>
                </form>
                <div id="container" style="width:100%;">                                   
                    <div id="left" style="float:left; width:50%;">
                        <% for (int i = 1; i <= 5; i += 1) {%>
                        <div class="row register-form">

                            <form role="form" method="post" class="r-form">
                                <div class="form-group">
                                    <div id="left1" style="float:left; width:25%;">
                                        <label for="r-form-first-name">Subject <%=i%></label>
                                    </div>
                                    <div id="left2" style="float:left; width:25%;">

                                        <center>
                                            <%
                                                try {
                                                    List<String> subjectList = new ArrayList<String>();
                                                    subjectList = (List<String>) request.getAttribute("data");
                                                    if (subjectList == null) {
                                                        out.println("accomList is null, Why is the list null?");
                                                    } else {
                                            %>
                                            <select name="subject<%=i%>">
                                                <%
                                                    for (int k = 0; k < subjectList.size(); k++) {
                                                %>
                                                <option value="<%=subjectList.get(k)%>"><%=subjectList.get(k)%></option>
                                                <%}
                                                        }
                                                    } catch (Exception e) {
                                                        out.println("error :" + e);
                                                    }
                                                %>
                                            </select>
                                        </center>
                                        <%
                                            
                                            
                                        %>
                                    </div>
                                </div>

                            </form>

                        </div>
                        <% }%>
                    </div>                     
                    <div id="right" style="float:right; width:50%;"> 
                        <% for (int j = 1; j <= 5; j += 1) {%>
                        <div class="row register-form">
                            <form role="form" method="post" class="r-form">
                                <div class="form-group">
                                    <div id="right1" style="float:left; width:25%;">
                                        <label for="r-form-first-name">Teacher <%=j%></label>
                                    </div>
                                    <div id="right2" style="float:left; width:25%;">
                                        <%
                                            try {
                                                Connection con = Connect.connector();
                                                String qry = "SELECT TeacherName FROM teacher_info";
                                                PreparedStatement pst = con.prepareStatement(qry);
                                                ResultSet resultset = pst.executeQuery(qry);
                                        %>
                                        <center>
                                            <select name="teacher<%=j%>">
                                                <%  while (resultset.next()) {%>
                                                <option><%= resultset.getString(1)%></option>
                                                <% }%>
                                            </select>
                                        </center>
                                        <%
                                                //**Should I input the codes here?**
                                            } catch (Exception e) {
                                                out.println("wrong entry" + e);
                                            }
                                        %>
                                    </div>
                                </div>

                            </form>
                        </div>
                        <% }%>

                    </div>                   
                </div> 
            </div>
        </div>

        <form action="AssignmentServlet2">
            <div>
                <button type="submit" class="btn"> Submit </button>
            </div>

        </form>



        <br />
        <br />


        <!-- Footer -->
        <footer>
            <div class="container">
                <div class="row">

                    <div class="col-sm-8 col-sm-offset-2">
                        <div class="footer-border"></div>
                        <p>Made by @Saugat Jonchhen</p>
                    </div>

                </div>
            </div>
        </footer>

        <!--<div><label></label></div>-->
        <!-- Javascript -->

        <script src="assets/js/jquery-1.11.1.min.js" type="text/javascript"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="assets/js/jquery.backstretch.min.js" type="text/javascript"></script>
        <script src="assets/js/scripts.js" type="text/javascript"></script>

        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>
</html>
