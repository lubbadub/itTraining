<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - Evaluation</title>
<%@include file="head/head.jsp"%>
</head>
<body onload="initPage()">

	<div id="page">

		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp"%>

		<section id="logistique">
			<fieldset>
			<legend>Session</legend>
				<p>
					<label>Formation inter-entreprise ou intra-entreprise : </label> <input
						type="radio" name="isInterIntra" value="inter" checked />inter-entreprise
					<input type="radio" name="isInterIntra" value="intra" />intra-entreprise
				</p>
				<p>
					<label>Session : </label> 17
				</p>
				<p>
					<label>Tarif : </label> 5395€
				</p>
				<p>
					<label>Sujet : </label> D&eacute;veloppement .Net
				</p>
				<p>
					<label>Date : </label> 12/08/2021 au 19/08/2021
				</p>
				<p>
					<label>Nombre de participants : </label> 12
				</p>
			</fieldset>
			<br/>
			<fieldset>
				<legend>Formateur</legend>
				<p>
					<label>Nom : </label> John Snow
				</p>
				<p>
					<label>Date premi&egrave;re session : </label> 15/04/2019
				</p>
				<p> 
					<label>Moyenne obtenue : </label> 4.4 / 5
				</p>
			</fieldset>
			<p>
				<label>Annulation ?</label>
				<br/> 
				<input type="button" value="Annuler session" />
			</p>
		</section>

	</div>
</body>
</html>