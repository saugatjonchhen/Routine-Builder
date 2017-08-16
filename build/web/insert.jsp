<%-- 
    Document   : assign
    Created on : Jun 14, 2017, 4:49:15 PM
    Author     : Saugat
--%>

<%@page import="com.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Teachers and Subjects</title>

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
    </head>
    <body>
        <%
            User user = (User) session.getAttribute("vuser");
            String us1 = request.getParameter("validuser");
            if (user == null) {
                response.sendRedirect("index.jsp");
            } else {
        %>

        <div class="top-content">
            <div class="container">

                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1>Inserting Teachers And Subjects </h1>
                        <div class="description">

                            <p>
                                Please add teachers and subjects. If you dont have any teachers and subjects to add then please click the "Forward" button at the end of the page.
                            </p>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-10 col-sm-offset-1 show-forms">
                        <span class="show-register-form active">Teachers</span> 
                        <span class="show-forms-divider">/</span> 
                        <span class="show-login-form">Subjects</span>
                    </div>
                </div>


                <div class="row register-form">
                    <div class="col-sm-4 col-sm-offset-1">
                        <form role="form" action="TeacherController" method="post" class="r-form">
                            <div class="form-group">
                                <label class="sr-only" for="r-form-first-name">Teacher ID</label>
                                <input type="text" name="teacherId" placeholder="Teacher ID... example: Teacher1 or T1" class="r-form-first-name form-control" id="r-form-first-name">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="r-form-last-name">Teacher Name</label>
                                <input type="text" name="teacherName" placeholder="Teacher name..." class="r-form-last-name form-control" id="r-form-last-name">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="r-form-email">Teacher Phone</label>
                                <input type="text" name="teacherPhone" placeholder="Teacher Phone..." class="r-form-email form-control" id="r-form-email">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="r-form-about-yourself">Faculty</label>
                                <input type="text" name="faculty" placeholder="Faculty..." 
                                       class="r-form-about-yourself form-control" id="r-form-about-yourself" value="Bsc.CSIT" readonly/>
                            </div>
                            <button type="submit" class="btn">Add Teacher</button>
                        </form>
                    </div>
                    <div class="col-sm-6 forms-right-icons">
                        <div class="row">
                            <div class="col-sm-2 icon"><i class="fa fa-pencil"></i></div>
                            <div class="col-sm-10">
                                <h3>Beautiful Forms</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-2 icon"><i class="fa fa-commenting"></i></div>
                            <div class="col-sm-10">
                                <h3>Awesome Login</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-2 icon"><i class="fa fa-magic"></i></div>
                            <div class="col-sm-10">
                                <h3>Great Registration</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row login-form">
                    <div class="col-sm-4 col-sm-offset-1">
                        <form role="form" action="SubjectController" method="post" class="l-form">
                            <div class="form-group">
                                <label class="sr-only" for="l-form-username">Subject Code</label>
                                <input type="text" name="subCode" placeholder="Subject Code... example:CSC-101" class="l-form-username form-control" id="l-form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="l-form-password">Subject Name</label>
                                <input type="text" name="subName" placeholder="Subject Name..." class="l-form-password form-control" id="l-form-password">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="l-form-username">Semester id</label>
                                <input type="text" name="semId" placeholder="Semester id... example:1" class="l-form-username form-control" id="l-form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="l-form-password">Faculty</label>
                                <input type="text" name="faculty" placeholder="Faculty..." class="l-form-password form-control" id="l-form-password" value="Bsc.CSIT" readonly>

                            </div>
                            <button type="submit" class="btn" >Add Subject</button>
                        </form>
                        <div class="social-login">
                            <p>Or login with:</p>
                            <div class="social-login-buttons">
                                <a class="btn btn-link-1" href="#"><i class="fa fa-facebook"></i></a>
                                <a class="btn btn-link-1" href="#"><i class="fa fa-twitter"></i></a>
                                <a class="btn btn-link-1" href="#"><i class="fa fa-google-plus"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 forms-right-icons">
                        <div class="row">
                            <div class="col-sm-2 icon"><i class="fa fa-user"></i></div>
                            <div class="col-sm-10">
                                <h3>New Features</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-2 icon"><i class="fa fa-eye"></i></div>
                            <div class="col-sm-10">
                                <h3>Easy To Use</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-2 icon"><i class="fa fa-twitter"></i></div>
                            <div class="col-sm-10">
                                <h3>Social Integrated</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <div class="container">
                <div class="row">

                    <div class="col-sm-8 col-sm-offset-2">
                        <div class="footer-border"></div>
                        <form method="Post" action="InsertController">
                            <p>If You Have finished adding teachers and subjects please click here.</p>
                            <button type="submit" class="btn" >Forward</button>
                        </form>
                    </div>

                </div>
            </div>
        </footer>

        <!-- Javascript -->

        <script src="assets/js/jquery-1.11.1.min.js" type="text/javascript"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="assets/js/jquery.backstretch.min.js" type="text/javascript"></script>
        <script src="assets/js/scripts.js" type="text/javascript"></script>

        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->
        <% }
        %>
    </body>
</html>
