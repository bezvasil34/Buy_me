<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

    <title>buy_me</title>

</head>

<body>
<sec:authentication property="name"/>
<sec:authorize access="hasRole('ROLE_ADMIN')">
    <a href="admin">admin</a>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
    <a href="loginpage">login</a>
    <a href="registration">registration</a>
</sec:authorize>
<br>

<sec:authorize access="isAuthenticated()">
    <form:form action="logout" method="post">
        <button>logout</button>
    </form:form>
    <a href="profile">your profile</a>
</sec:authorize>
<br>
<br>
<br>

<c:forEach var="commodity" items="${commodities}">

    <form:form action="getOrder" method="post">
        ${commodity.name} ${commodity.quantity} ${commodity.price}
            <sec:authorize access="isAuthenticated()">
            <input type="hidden" name="commodityId" value="${commodity.id}">
            <input name="quantity" value="0" type="number" placeholder="quantity">
                <button>get order</button>
            </sec:authorize>
    </form:form>

    <br>
</c:forEach>

</body>
</html>