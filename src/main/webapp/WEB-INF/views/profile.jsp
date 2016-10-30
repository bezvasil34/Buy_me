<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: koko
  Date: 28.10.16
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>profile</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

    ${user.getOriginUsername()}
    <br>
    <img src="${user.pathImage}">

    <form:form action="./saveImage?${_csrf.parameterName}=${_csrf.token}"
               method="post" enctype="multipart/form-data">
        <input type="file" name="image">
        <button>save image</button>
    </form:form>
    <br>
    <br>
    <br>
    <c:forEach var="commodity" items="${user.commodities}">
        ${commodity.name} ${commodity.price}
        <a href="deleteCommodityFromUser/${commodity.id}">delete</a>
        <br>
    </c:forEach>
</body>
</html>
