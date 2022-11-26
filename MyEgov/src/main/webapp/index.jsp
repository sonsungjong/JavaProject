<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"         uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시작페이지</title>
</head>
<body>
	${gugu1 }
	<form action="gugu.do" method="post">
	단:<input type="number" name="num" value="2">
	<input type="submit" value="보내기">
	</form>
	
</body>
</html>