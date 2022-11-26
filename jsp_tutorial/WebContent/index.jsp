<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jsp_tutorial.Model" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Model model = new Model();
//	int result = model.a();
//	out.println("result : "+result+"<hr><hr>");
%>

<form name="jspForm" action="result.jsp" onsubmit="hel()" method="get">
	<input type="text" name="coffee"><br>
	<input type="number" name="price"><br>
	<input type="button" value="항목추가" id="register">
	<input type="reset" value="지우기">
	<input type="submit" value="입력">
</form>

<script>

<%-- 	document.getElementById("register").onclick = function(){
		<%=model.hel() %>
	} --%>
</script>

</body>
</html>