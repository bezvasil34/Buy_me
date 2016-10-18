<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>subCategory</title>
</head>
<body>
<a href="home">home</a>
    <div style="text-align: center; margin-top: 20%">
        <form action="newSubCategory" method="post">
            <input name="name" placeholder="subcategory name">
            <select name="categoryID">
                <c:forEach var="category" items="${categories}">
                    <option value="${category.id}">${category.name}</option>
                </c:forEach>
            </select>
            <br>
            <br>
            <button>save subCategory</button>
        </form>
    </div>

    <div style="text-align: center; margin-top: 30px">
        <c:forEach var="subcategory" items="${subCategories}">
            ${subcategory.name} ${subcategory.category.name}
            <a href="deleteSubCategory/${subcategory.id}">delete</a>
            <br>
        </c:forEach>
    </div>


</body>
</html>
