F<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - Enregistrement en ligne</title>
<%@include file="head/head.jsp"%>
</head>
<body onload="initPage()">

	<div id="page">

		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp"%>

		<p id="sessionChoisie">
			<label>Session choisie : </label>Session xyz
		</p>
		<p id="villeSessionChoisie">
			<label>Ville : </label>Ville xyz
		</p>
		<p id="dateSessionChoisie">
			<label>Date : </label> xx/xx/xx
		</p>


		<form action="#inscription" method="post" id="enregistrementForm">
			<fieldset>
				<legend>Coordonn&eacute;es participant</legend>
				<p>
					<label>Nom : </label><input type="text" name="nom"
						placeholder="Saisir votre nom" title="Saisir votre nom" />
				</p>
				<p>
					<label>Pr&eacute;nom : </label><input type="text" name="prenom"
						placeholder="Saisir votre prenom" title="Saisir votre prenom" />
				</p>
				<p>
					<label>Mail : </label><input type="text" name="mail"
						placeholder="Saisir votre email" title="Saisir votre email" />
				</p>
				<p>
					<label>T&eacute;l&eacute;phone : </label><input type="text"
						name="tel" placeholder="Saisir votre t&eacute;l&eacute;phone"
						title="Saisir votre t&eacute;l&eacute;phone" />
				</p>
				<p>
					<label>Entreprise : </label><input type="text" name="entreprise"
						placeholder="Saisir votre entreprise"
						title="Saisir votre entreprise" />
				</p>
				<p>
					<label>Session intra-entreprise ? </label><input type="checkbox"
						name="intra" />
				</p>
			</fieldset>
			<input type="submit" value="S'inscrire" /><br /> <a
				href="#testPreRequis">Passer le test de pr&eacute;-requis</a>
		</form>

	</div>
</body>
</html>