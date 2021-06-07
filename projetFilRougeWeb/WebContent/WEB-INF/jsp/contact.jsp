<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - Contact</title>
<%@include file="head/head.jsp" %>
</head>
<body onload="initPage()">

	<div id="page">
	
		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp" %>
		
	<form id="contactForm">
			<p>
				<label id="civilite">Civilit&eacute;</label> <input type="radio" name="civilite"
					value="h" />Mr <input type="radio" name="civilite" value="femme" />Mme
			
			<p>
				<label>Nom:</label><input type="text" name="nom" placeholder="Nom"/>
			</p>
			<p>
				<label>Prenom:</label><input type="text" name="prenom" placeholder="Pr&eacute;nom" />
			</p>
			<p>
				<label>Organisation:</label><input type="text" name="organisation" placeholder="Organisation"/>
			</p>
			<p>
				<label>Mail:</label><input type="text" name="mail" placeholder="Mail"/>
			</p>

			<p>
				<label>Message: </label><br/>
				<textarea name="message" cols="40" rows="9" class="wpcf7-form-control wpcf7-textarea form-control" aria-invalid="false" placeholder="Votre message"></textarea>			</p>
		<input type="submit" value="Envoyer" />
	</form>
		
	</div>
</body>
</html>