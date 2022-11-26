<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jspweb.Controller"%>
<!doctype html>
<html lang="kr">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet" crossorigin="anonymous">
<link href="./css/style.css" rel="stylesheet">

<title>web title</title>
</head>
<body>
<%
	Controller con = new Controller();
	String name = con.info();
%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp"><%= name %></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link1</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link2</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link3</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
		
<div>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
				  <div class="carousel-indicators">
				    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
				    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
				    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
				  </div>
				  <div class="carousel-inner">
				    <div class="carousel-item active">
				      <img src="./images/photo1.jpg" class="d-block w-100 caru-height" alt="내사진">
				    </div>
				    <div class="carousel-item">
				      <img src="./images/realforce.jpg" class="d-block w-100 caru-height" alt="키보드">
				    </div>
				    <div class="carousel-item">
				      <img src="./images/google.png" class="d-block w-100 caru-height" alt="로고">
				    </div>
				  </div>
				  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
				    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
				    <span class="visually-hidden">Previous</span>
				  </button>
				  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
				    <span class="carousel-control-next-icon" aria-hidden="true"></span>
				    <span class="visually-hidden">Next</span>
				  </button>
				</div>
			</div>
			<div class="col-md-4">
				<div style="height:20px;"></div>
				<form action="#" method="get">
				  <div class="mb-3 row">
				    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="staticEmail" placeholder="example.example.com">
				    </div>
				  </div>
				  <div class="mb-3 row">
				    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
				    <div class="col-sm-10">
				      <input type="password" class="form-control" id="inputPassword">
				    </div>
				  </div>
				  <div class="d-grid gap-2 col-6 mx-auto">
				  	<input type="submit" class="btn btn-outline-primary" value="로그인">
				  </div>
			  	</form>
			  	<div style="height:20px;"></div>
				<div class="">
					<img src="./images/google.png" alt="이미지" style="height:55px;">
				</div>
			</div>
			
			<div class="col-md-12">
				<div class="card-group">
					<div class="card">
						<img src="./images/photo1.jpg" class="card-img-top card-img" alt="...">
					    <div class="card-body">
					    	<h5 class="card-title"><%= con.getDate() %></h5>
					      	<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
					    </div>
					    <div class="card-footer">
					      	<small class="text-muted">Last updated 3 mins ago</small>
					    </div>
					</div>
					<div class="card">
						<img src="./images/realforce.jpg" class="card-img-top card-img" alt="...">
					    <div class="card-body">
					  	  <h5 class="card-title">Card title</h5>
					  	  <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
					    </div>
					    <div class="card-footer">
					  	  <small class="text-muted">Last updated 3 mins ago</small>
					    </div>
					  </div>
					<div class="card">
					    <img src="./images/google.png" class="card-img-top card-img" alt="...">
					    <div class="card-body">
					      <h5 class="card-title">Card title</h5>
					      <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
					    </div>
					    <div class="card-footer">
					      <small class="text-muted">Last updated 3 mins ago</small>
					    </div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="card-group">
					<div class="card">
						<img src="./images/photo1.jpg" class="card-img-top card-img" alt="...">
					    <div class="card-body">
					    	<h5 class="card-title">Card title</h5>
					      	<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
					    </div>
					    <div class="card-footer">
					      	<small class="text-muted">Last updated 3 mins ago</small>
					    </div>
					</div>
					<div class="card">
						<img src="./images/realforce.jpg" class="card-img-top card-img" alt="...">
					    <div class="card-body">
					  	  <h5 class="card-title">Card title</h5>
					  	  <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
					    </div>
					    <div class="card-footer">
					  	  <small class="text-muted">Last updated 3 mins ago</small>
					    </div>
					  </div>
					<div class="card">
					    <img src="./images/google.png" class="card-img-top card-img" alt="...">
					    <div class="card-body">
					      <h5 class="card-title">Card title</h5>
					      <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
					    </div>
					    <div class="card-footer">
					      <small class="text-muted">Last updated 3 mins ago</small>
					    </div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<footer class="card text-white bg-dark footer">
  	<p class="card-text"><pre style="color:white;margin-top:0%;margin-bottom:0%;overflow:hidden;text-align:center;">
      TEL. 070-0000-0000 | PHONE. 010-2580-2463 | Email. <span style="color:red;">tbxmtbfm@naver.com</span> | 지구 대한민국 인천 우리집, 201호
      © Copyright 손성종 All Rights Reserved</pre>
      </p>
</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>
</body>
</html>