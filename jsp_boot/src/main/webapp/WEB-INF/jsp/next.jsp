<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력결과 페이지</title>
</head>
<body>
	${m2}
	<br>
	${m3}
	<br>
	<input type="button" value="뒤로가기" onclick="window.history.back()">
</body>
</html>