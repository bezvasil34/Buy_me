<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: koko
  Date: 16.10.16
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>country</title>
</head>
<body>
<a href="home">home</a>
    <div style="text-align: center; margin-top: 20%">
        <form:form modelAttribute="country" action="newCountry" method="post">
            <form:input path="name" placeholder="country name"/>
            <br>
            <br>
            <button>save subCategory</button>
        </form:form>
    </div>
</body>
</html>
