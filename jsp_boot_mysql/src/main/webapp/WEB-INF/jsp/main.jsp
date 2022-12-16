<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- JSP를 사용할 땐 타임리프를 추가하지 않는다
spring web, spring dev tool, MySQL Driver, Spring Data JPA
-->
<!-- 
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
 -->
 <!-- src/webapp/WEB-INF/jsp/main.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringBoot JSP MySQL 게시판</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="/">Management</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<br><br>

<div class="container">
	<div class="row">
		<h1> My Table </h1>	
	</div>
	
	<div class="row">
		<div class="col-lg-3">
			<a href="/new" class="btn btn-primary btn-sm mb-3">등록하기</a>
		</div>
	</div>
	
	<table class="table table-striped table-bordered">
  <thead class="table-dark">
    <tr>
      <th>Name</th>
      <th>Gender</th>
      <th>Phone</th>
      <th>Email</th>
      <th>Actions</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${workers}" var="worker">
		<tr>
			<td><c:out value="${worker.name}"/></td>
			<td><c:out value="${worker.gender}"/></td>
			<td><c:out value="${worker.phone}"/></td>
			<td><c:out value="${worker.email}"/></td>
			<td>
				<a href="<c:url value='/edit/${worker.id}'/>" class="btn btn-primary">수정하기</a>
				<a href="<c:url value='/${worker.id}'/>" class="btn btn-danger">삭제하기</a>
			</td>
		</tr>
    </c:forEach>
  </tbody>
</table>

<%-- <div>
<c:if test="${totalPages > 1}">
	<div class="row col-sm-10">
		<div class="col-sm-2">
			Total Rows: ${totalElements}
		</div>
		<div class="col-sm-1">
			<c:choose>
				<c:when test="${currentPage > 1}">
					<a href="@{'/page/'+1}">First</a>
				</c:when>
				<c:otherwise>
					<span>First</span>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="col-sm-1">
			<a th:if="${currentPage > 1}" th:href="@{'/page/'+${currentPage -1}}">Prev</a>
			<span th:unless="${currentPage > 1}">Prev</span>
		</div>
		<div class="col-sm-2">
			<span th:each="i: ${#numbers.sequence(1,totalPages)}">
				<a th:if="${currentPage != i}" th:href="@{'/page/'+${i}}">[[${i}]]</a>
				<span th:unless="${currentPage != i}">[[${i}]]</span>	&nbsp; &nbsp;
			</span>
		</div>
		<div class="col-sm-1">
			<a th:if="${currentPage < totalPages}" th:href="@{'/page/'+${currentPage +1}}">Next</a>
			<span th:unless="${currentPage < totalPages}">Next</span>
		</div>
		<div class="col-sm-1">
			<a th:if="${currentPage < totalPages}" th:href="@{'/page/'+${totalPages}}">Last</a>
			<span th:unless="${currentPage < totalPages}">Last</span>
		</div>
	</div>
</c:if>
</div> --%>

</div>

</body>
</html>