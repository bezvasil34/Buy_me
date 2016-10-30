<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: koko
  Date: 16.10.16
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
    <link type="text/css" rel="stylesheet" href="/resources/css/registration.css">
    <script src="/resources/js/"></script>
</head>
<body>
<div class="login">
    <div class="login-triangle"></div>

    <h2 class="login-header">Log in</h2>
    <form:form modelAttribute="user" action="registration" method="post">


        <p><form:input path="username" type="text" placeholder="user name"/></p>
        <p><form:input path="email" type="email" placeholder="email"/></p>
        <p><form:input path="phoneNumber" placeholder="phone"/></p>
        <p><form:input path="password" type="password" placeholder="Password"/></p>
        <p><input type="submit" value="Log in"></p>

    </form:form>
</div>
<%--<div style="text-align: center; margin-top: 20%">
    <form action="registration" method="post">
        <input name="username" placeholder="username">
        <br>
        <br>
        <input name="email" placeholder="email" type="email" required="required" >
        <br>
        <br>
        <input name="phoneNumber" placeholder="phone number">
        <br>
        <br>
        <input name="password" placeholder="password">
        <br>
        <br>
        <button>sign up</button>
    </form>
</div>--%>
</body>
</html>
