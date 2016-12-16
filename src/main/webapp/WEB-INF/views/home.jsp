<%--
  Created by IntelliJ IDEA.
  User: Eyuel Tadesse
  Date: 12/15/2016
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Home</title>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>Simple Spring App</h1>
                <a href="<spring:url value="/login" />" class="btn btn-success">Login</a>
            </div>
        </div>
    </section>
</body>
</html>
