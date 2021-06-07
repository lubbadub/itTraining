<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - Accueil</title>
<%@include file="head/head.jsp" %>
</head>
<body onload="initPage()">

	<div id="page">
	
		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp" %>
		
		<!-- Slideshow container -->
	<div class="slideshow-container">

		<!-- Full-width images with number and caption text -->
		<div class="mySlides fade">
			<div class="numbertext">1 / 3</div>
			<img src="images/hidethepainharold.jpg" style="width: 100%">
			<div class="text">Caption Text</div>
		</div>

		<div class="mySlides fade">
			<div class="numbertext">2 / 3</div>
			<img src="images/IssouMeme.jpg" style="width: 100%">
			<div class="text">Caption Two</div>
		</div>

		<div class="mySlides fade">
			<div class="numbertext">3 / 3</div>
			<img src="images/meetingMeme.jpg" style="width: 100%">
			<div class="text">Caption Three</div>
		</div>

		<!-- Next and previous buttons -->
		<a class="prev" onclick="plusSlides(-1)">&#10094;</a> <a class="next"
			onclick="plusSlides(1)">&#10095;</a>
	</div>
	<br>

	<!-- The dots/circles -->
	<div style="text-align: center">
		<span class="dot" onclick="currentSlide(1)"></span> <span class="dot"
			onclick="currentSlide(2)"></span> <span class="dot"
			onclick="currentSlide(3)"></span>
	</div>

	<div id="temoignages">
		<h2>T&eacute;moignages</h2>
		<p>index</p>
	</div>
		
	</div>
</body>
</html>