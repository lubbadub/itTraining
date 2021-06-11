<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - Accueil</title>
<%@include file="head/head.jsp"%>
<!-- bootstrap css -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<!-- style css -->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- Responsive-->
<link rel="stylesheet" href="css/responsive.css">
<!-- fevicon -->
<link rel="icon" href="images/fevicon.png" type="image/gif" />
<!-- Scrollbar Custom CSS -->
<link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
<!-- Tweaks for older IEs-->
<link rel="stylesheet"
	href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
<!-- owl stylesheets -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
	media="screen">

</head>
<body onload="initPage()">

	<jsp:include page="header/header.jsp"></jsp:include>
	<%@include file="nav/nav.jsp"%>

	<!-- 	<img src="images/formation1.jpg" style="width: 100%"> -->
	<!--banner start -->
	<div class="banner-main">
		<div class="container">
			<div id="main_slider" class="carousel slide" data-ride="carousel">
				<!-- The slideshow -->
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="titlepage-h1">
							<h1 class="bnner_title">
								<span id="titreAccueil">IT Training</span><br> Votre
								partenaire formation
							</h1>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	<!--banner end -->

	<!-- Feature -->

	<div class="container" id="features">
		<div class="row">
			<div class="col-md-12">
				<div class="main_heading">
					<h1>Nos Services</h1>
					<div class="text-center">
						<span class="underline"></span>
					</div>
				</div>
			</div>
			<!-- End col-md-12 -->
		</div>
		<!-- End row -->

		<div class="row">
			<div class="col-md-3 col-sm-6">
				<div class="features-div">
					<i class="fa fa-mobile"></i>
					<h4>Formations mobile</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore</p>
				</div>
			</div>
			<!-- End col-md-3-->
			<div class="col-md-3 col-sm-6">
				<div class="features-div">
					<i class="fa fa-code"></i>
					<h4>Bonnes pratiques du code</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore</p>
				</div>
			</div>
			<!-- End col-md-3-->
			<div class="col-md-3 col-sm-6">
				<div class="features-div">
					<i class="fa fa-pencil"></i>
					<h4>Design</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore</p>
				</div>
			</div>
			<!-- End col-md-3-->
			<!-- End col-md-3-->
			<div class="col-md-3 col-sm-6">
				<div class="features-div">
					<i class="fa fa-calendar"></i>
					<h4>Optimiser votre temps</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore</p>
				</div>
			</div>
			<!-- End col-md-3-->
		</div>
		<!-- End row -->
	</div>
	<!-- End Container -->
	<!-- End Feature -->

	<!-- Call to Action -->
	<div class="call-action-bg" id="Call-to-Action">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="main_heading">
						<h1>D&eacute;veloppez vos comp&eacute;tences</h1>
						<div class="text-center">
							<span class="underline"></span>
						</div>
					</div>
				</div>
				<!-- End col-md-12 -->
			</div>
			<!-- End row -->

			<div class="col-md-12">
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry. Lorem Ipsum has been the industry's standard
					dummy text ever since the 1500s, when an unknown printer took a
					galley of type</p>
			</div>
			<!-- End col-md-12-->

		</div>
		<!-- End container -->
	</div>

	<!-- End Call to Action -->


	<!-- About -->
	<div class="container" id="About">
		<div class="row">
			<div class="col-md-12">
				<div class="main_heading">
					<h1>Notre &eacute;quipe</h1>
					<div class="text-center">
						<span class="underline"></span>
					</div>
				</div>
			</div>
			<!-- End col-md-12 -->
		</div>
		<!-- End row -->


		<div class="row">
			<div class="col-md-4 about-us-box wow fadeInUp animated">
				<div class="about-us-photo">
					<img src="images/1.jpg" alt="">
					<div class="about-us-role">Dev</div>
				</div>
				<h3>Faiz Abdallah</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
					do eiusmod.</p>
			</div>

			<div class="col-md-4 about-us-box wow fadeInUp animated">
				<div class="about-us-photo">
					<img src="images/2.jpg" alt="">
					<div class="about-us-role">Dev</div>
				</div>
				<h3>Nicolas Cr&eacute;masco</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
					do eiusmod.</p>
			</div>

			<div class="col-md-4 about-us-box wow fadeInUp animated">
				<div class="about-us-photo">
					<img src="images/3.jpg" alt="">
					<div class="about-us-role">Dev</div>
				</div>
				<h3>Yan Flourac</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
					do eiusmod.</p>
			</div>
		</div>
		<!-- End row -->

	</div>
	<!-- End container -->
	<!-- End About -->

	<!-- Testimonial -->
	<div class="call-action-color" id="Testimonial">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="main_heading">
						<h1>T&eacute;moignages</h1>
						<div class="text-center">
							<span class="underline"></span>
						</div>
					</div>
				</div>
				<!-- End col-md-12 -->
			</div>
			<!-- End row -->

			<div class="col-md-12">
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry. Lorem Ipsum has been the industry's standard
					dummy text ever since the 1500s, when an unknown printer took a
					galley of type</p>
			</div>
			<!-- End col-md-12-->

		</div>
		<!-- End container -->
	</div>

	<!-- End Testimonial -->

</body>
</html>