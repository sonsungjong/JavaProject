<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String coffee = request.getParameter("coffee");
	String price = request.getParameter("price");
	
	
%>

<h1>form태그</h1>
<h3>이름 : <%=coffee %></h3>
<h3>이름 : <%=price %></h3>
</body>
</html>