<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: koko
  Date: 16.10.16
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>category</title>
</head>
<body>
<a href="home">home</a>
    <div style="text-align: center; margin-top: 20%">
        <form:form modelAttribute="category" action="newCategory" method="post">
            <form:input path="name" placeholder="category name"/>
            <br>
            <br>
            <button>save category</button>
        </form:form>
    </div>
<br>
    <div style="text-align: center; margin-top: 30px">
        <c:forEach var="category" items="${categories}">
            ${category}
            <br>
        </c:forEach>
    </div>

</body>
</html>
