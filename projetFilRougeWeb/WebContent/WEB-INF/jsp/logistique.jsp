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
				<p>
					<label>Formation inter-entreprise ou intra-entreprise : </label> <input
						type="radio" name="isInterIntra" value="inter" />inter-entreprise
					<input type="radio" name="isInterIntra" value="intra" />intra-entreprise
				</p>
				<p>
					<label>Session : </label> xyz
				</p>
				<p>
					<label>Tarif : </label> xyz
				</p>
				<p>
					<label>Sujet : </label> xyz
				</p>
				<p>
					<label>Date : </label> xyz
				</p>
				<p>
					<label>Nombre de participants : </label> xyz
				</p>
			</fieldset>
			<fieldset>
				<legend>Formateur</legend>
				<p>
					<label>Date premi&egrave;re session : </label> xyz<br /> <label>Moyenne
						obtenue : </label> xyz
				</p>
			</fieldset>
			<p>
				<label>Annulation ?</label> <input type="button"
					value="Annuler session" />
			</p>
		</section>

	</div>
</body>
</html>