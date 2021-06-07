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
				<label>Email : </label><input type="text" name="prenom"
					placeholder="Email" title="Email" />
			</p>
			<p>
				<label>Mot de passe : </label><input type="password"
					name="motDePasse" placeholder="Mot de passe" title="Mot de passe" />
			</p>
			<input type="submit" value="Connexion" />
		</form>

	</div>
</body>
</html>