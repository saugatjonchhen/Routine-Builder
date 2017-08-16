<%-- 
    Document   : newjsp
    Created on : Jun 15, 2017, 8:05:09 AM
    Author     : Saugat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String a = request.getParameter("semester");
            out.println(a);
        %>
    </body>
</html>
