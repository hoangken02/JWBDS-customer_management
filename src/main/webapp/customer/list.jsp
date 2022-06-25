<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<table border="1">
<tr>
    <td>ID</td>
    <td>Name</td>
    <td>Email</td>
    <td>Country</td>
    <td colspan="2">Action</td>
</tr>

<c:forEach items="${customerList}" var="customer">
<tr>
    <td><a href="/customer/${customer.id}"> ${customer.id}</a></td>
    <td>${customer.name}</td>
    <td>${customer.email}</td>
    <td>${customer.country}</td>
    <td><a href="/customer/${customer.id}/edit">Edit</a></td>
    <td><a href="/customer/${customer.id}/delete">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>
