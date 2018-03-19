<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>用户列表</title>
</head>
<body>
<%@ page isELIgnored="false" %>
<c:forEach items="${requestScope.users}" var="user">
     ${user.uname} - ${user.age} - ${user.addr} <br/>
</c:forEach>

</body>
</html>