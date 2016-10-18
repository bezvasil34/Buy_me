<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: koko
  Date: 14.10.16
  Time: 1:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="text-align: center">
        <a href="admin">admin page</a>
        <br>
        <br>
        <a href="registration">registration</a>
    </div>

    <div style="text-align: center; margin-top: 30px">
        <c:forEach var="commodity" items="${commodities}">
            ${commodity}
            <a href="buy/${commodity.id}">buy</a>
        </c:forEach>
    </div>

</body>
</html>
