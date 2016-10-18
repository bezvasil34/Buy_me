<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <form action="newCommodity" method="post">
            <input name="name" placeholder="commodity name">
            <input name="description" placeholder="description">
            <input name="price" placeholder="price">
            <select name="subCategoryID">
                <option>choose subCategory</option>
                <c:forEach var="subCategory" items="${subcategories}">
                    <option value="${subCategory.id}">${subCategory.name}</option>
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
            <button>save subCategory</button>
        </form>
    </div>
</body>
</html>
