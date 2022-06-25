<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form action="/customer/edit" method="post" c:object="${customer}">
    <lable>ID:</lable>
    <input type="text" name="id" id="id" value="${customer.id}">
    <br>
    <lable>Name: </lable>
    <input type="text" name="name" value="${customer.name}">  <br>
    <lable>Email: </lable>
    <input type="text" name="email" value="${customer.email}">  <br>
    <lable>Country: </lable>
    <input type="text" name="country" value="${customer.country}">
    <input type="submit" value="Update">
</form>
</body>
</html>
