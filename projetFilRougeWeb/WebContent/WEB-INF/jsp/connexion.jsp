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

		<form action="connexion" id="connexionForm" method="post">
			<p>
				<label>Login : </label><input type="text" name="prenom"
					placeholder="Login" title="Email" />
			</p>
			<p>
				<label>Mot de passe : </label><input type="password"
					name="motDePasse" placeholder="Mot de passe" title="Mot de passe" />
			</p>
			<p>S&eacute;lectionnez un r&ocirc;le </p>
			<div>
				<input type="radio" id="Stagiaire" name="role" value="Stagiaire" checked>
				<label for="Stagiaire">Stagiaire</label>
			</div>

			<div>
				<input type="radio" id="Responsable" name="role" value="Responsable"> <label
					for="Responsable">Responsable</label>
			</div>
			<br/>
			<input type="submit" value="Connexion" />
		</form>

	</div>
</body>
</html>