<%-- 
    Document   : index
    Created on : Jun 13, 2017, 3:12:39 PM
    Author     : Saugat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Routine Builder Login</title>

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
        <!-- Top content -->
        <div class="top-content">
            <div class="container">

                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1>Web Based Routine Builder </h1>
                        <div class="description">
                            <p>
                                Routine Builder is an application designed to help design a routine or time table for teachers, students, subjects and time slots, in such a way that is it satisfies as nearly as possible the constraints imposed by a particular educational institution. It is an automated system which helps to create personalized schedules. 
                            </p>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-10 col-sm-offset-1 show-forms">
                        <span class="show-register-form active">Register</span> 
                        <span class="show-forms-divider">/</span> 
                        <span class="show-login-form">Login</span>
                    </div>
                </div>


                <div class="row register-form">
                    <div class="col-sm-4 col-sm-offset-1">
                        <form role="form" action="RegisterController" method="post" class="r-form">
                            <div class="form-group">
                                <label class="sr-only" for="r-form-first-name">First name</label>
                                <input type="text" name="fName" placeholder="First name..." class="r-form-first-name form-control" id="r-form-first-name">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="r-form-last-name">Last name</label>
                                <input type="text" name="lName" placeholder="Last name..." class="r-form-last-name form-control" id="r-form-last-name">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="r-form-email">Email</label>
                                <input type="text" name="eMail" placeholder="Email..." class="r-form-email form-control" id="r-form-email">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="r-form-about-yourself">About yourself</label>
                                <textarea name="abtYou" placeholder="About yourself..." 
                                          class="r-form-about-yourself form-control" id="r-form-about-yourself"></textarea>
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="l-form-username">Username</label>
                                <input type="text" name="uName" placeholder="Username..." class="l-form-username form-control" id="l-form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="l-form-password">Password</label>
                                <input type="password" name="passWd" placeholder="Password..." class="l-form-password form-control" id="l-form-password">
                            </div>
                            <button type="submit" class="btn">Sign me up!</button>
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
                        <form role="form" action="LoginController" method="post" class="l-form">
                            <div class="form-group">
                                <label class="sr-only" for="l-form-username">Username</label>
                                <input type="text" name="uName" placeholder="Username..." class="l-form-username form-control" id="l-form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="l-form-password">Password</label>
                                <input type="password" name="passWd" placeholder="Password..." class="l-form-password form-control" id="l-form-password">
                            </div>
                            <button type="submit" class="btn" >Sign in!</button>
                        </form>
                        <div class="social-login">
                            <!--                        	<p>Or login with:</p>
                                                            <div class="social-login-buttons">
                                                                    <a class="btn btn-link-1" href="#"><i class="fa fa-facebook"></i></a>
                                                                    <a class="btn btn-link-1" href="#"><i class="fa fa-twitter"></i></a>
                                                                    <a class="btn btn-link-1" href="#"><i class="fa fa-google-plus"></i></a>
                                                            </div>-->
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
