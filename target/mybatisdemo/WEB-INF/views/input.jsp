<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%@ page isELIgnored="false" %>
<form action="save" method="post">

<input type="text" name="uname" placeholder="姓名"><br>
<input type="text" name="pwd" placeholder="密码"><br>
<input type="number" name="age" max="120" min="0" placeholder="年龄"><br>

<input type="submit" value="保存">

</form>
</body>
</html>