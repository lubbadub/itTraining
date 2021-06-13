<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - Catalogue</title>
<%@include file="head/head.jsp"%>
</head>
<body onload="initPage()">

	<div id="page">

		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp"%>
<!-- 		<button onclick="loadModuleDescription()">Rafraichir</button> -->
		<form action="catalogue" method="post"
			id="choixFormationForm">
			<p>
				<!-- <label>Formation</label> <select id="formation">
					<option value=""></option>
				</select> --> 
				<label>Th&egrave;me</label> <select id="theme" onchange="majModule()">
					<option value=""></option>
				</select> 
				<label>Module</label> <select id="module" onchange="majVille(); loadModuleDescription();">
					<option value=""></option>
				</select>
				
			<fieldset id="descriptif">
				<legend>Descriptif</legend>
				<h4>Ojectifs</h4>
				<p id="objectif">

				</p>
				<h4>Pr&eacute;-requis</h4>
				<p id="preRequis">
				</p>
				<h4>Programme</h4>
				<p id="programme">
				</p>
				<h4>Prix</h4>
				<p id="prix">
				</p>

			</fieldset>
			<div id="infoSession">
				<p>
					<label>Sessions :</label>
				</p>
				<p>
					<select id="session" name="session">
						<option value=""></option>
<!-- 						<option value="paris">Paris</option> -->
<!-- 						<option value="toulouse">Toulouse</option> -->
<!-- 						<option value="marseille">Marseille</option> -->
					</select>
					<br/>
				</p>
<!-- 				<p> -->
<!-- 					<label>Date des sessions</label> -->
<!-- 				</p> -->
<!-- 				<p> -->
<!-- 					<input type="date" /> -->
<!-- 				</p> -->

				<input type="submit" value="S'enregistrer en ligne" class="boutonEnregistrement"/>
			</div>
		</form>

	</div>
</body>
</html>