<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - Catalogue</title>
<%@include file="head/head.jsp" %>
</head>
<body onload="initPage()">

	<div id="page">
	
		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp" %>
		
	<form action="enregistrementEnLigne" method="post"
		id="choixFormationForm">
		<p>
			<label>Formation</label> <select id="formation">
				<option value=""></option>
				<option value="reseau">R&eacute;seau</option>
				<option value="systemeExploitation">Syst&egrave;me
					d'exploitation</option>
				<option value="gestionProjet">Gestion de projet</option>
				<option value="langageDev">Langages de d&eacute;veloppement</option>
			</select> <label>Th&egrave;me</label> <select id="theme">
				<option value=""></option>
				<option value="theme1">Theme 1</option>
				<option value="theme2">Theme 2</option>
				<option value="theme3">Theme 3</option>
			</select> <label>Module</label> <select id="module">
				<option value=""></option>
				<option value="module1">Module 1</option>
				<option value="module2">Module 2</option>
				<option value="module3">Module 3</option>
			</select>
		<fieldset id="descriptif">
			<legend>Descriptif</legend>
			<p id="ojectif">
			<h4>Ojectifs</h4>
			Lorem ipsum dolor sit amet, consectetur adipiscing elit. 		Lorem ipsum dolor sit amet, consectetur adipiscing elit		Lorem ipsum dolor sit amet, consectetur adipiscing elit
			</p>
			<p id="preRequis">
			<h4>Pr&eacute;-requis</h4>
			Lorem ipsum dolor sit amet, consectetur adipiscing elit.
			</p>
			<p id="programme">
			<h4>Programme</h4>
			Lorem ipsum dolor sit amet, consectetur adipiscing elit.
			</p>
			<p id="prix">
			<h4>Prix</h4>
			xxxx &euro;
			</p>

		</fieldset>
		<div id="infoSession">
		<p><label>Ville</label></p>
		<p> <select id="ville">
			<option value=""></option>
			<option value="paris">Paris</option>
			<option value="toulouse">Toulouse</option>
			<option value="marseille">Marseille</option>
		</select> 
		</p>
		<p><label>Date des sessions</label></p>
			<p><input type="date" /></p>

		<input type="submit" value="S'enregistrer en ligne" />
		</div>
	</form>
		
	</div>
</body>
</html>