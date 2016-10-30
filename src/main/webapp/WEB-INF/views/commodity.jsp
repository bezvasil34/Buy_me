<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>commodity</title>
</head>
<body>
<a href="home">home</a>

<div style="text-align: center; margin-top: 20%">
<form:form modelAttribute="commodity" action="newCommodity" method="post">
    <form:input path="name" placeholder="commodity name"/>
    <form:input path="description" placeholder="description"/>
    <form:input path="price" placeholder="price"/>
    <form:input path="quantity" placeholder="quantity" type="number"/>

    <select name="subCategoryID">
        <option>choose subCategory</option>
        <c:forEach var="subCategory" items="${subcategories}">
            <option value="${subCategory.id}">${subCategory.name} ${subCategory.category.name}</option>
        </c:forEach>
    </select>
    <select name="countryID">
        <option>choose country</option>
        <c:forEach var="country" items="${countries}">
            <option value="${country.id}">${country.name}</option>
        </c:forEach>
    </select>
    <br>
    <br>
    <button>save commodity</button>
</form:form>

    </div>
</body>
</html>
