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

		<fieldset id="monitoring">
			<legend>
				<h2>Monitoring des sessions</h2>
			</legend>
			<div id="session">
				<p>
					<label>Choix de la session :</label> <select
						id="choixFormationMonitorer">
						<option value=""></option>
						<option value="formation1">Formation 1</option>
						<option value="formation2">Formation 2</option>
						<option value="formation3">Formation 3</option>
					</select>
				</p>

				<p>
					<label>Salle install&eacute;e : </label> <input type="checkbox" />
				</p>

				<p>
					<label>Formateur confirm&eacute; : </label> <input type="checkbox" />
				</p>

				<p>
					<label>Support imprim&eacute; : </label> <input type="checkbox" />
				</p>
			</div>
			<div id="date">
				<p>
					<label>Date de d&eacute;but : </label> <input type="date" />
				</p>

				<p>
					<label>Date de fin : </label> <input type="date" />
				</p>
			</div>

		</fieldset>
		<fieldset id="salle">
			<p>
				<label>Evaluations stagiaires : </label> <select id="evalStagiaires">
					<option value=""></option>
					<option value="stagiaire1">Stagiaire 1</option>
					<option value="stagiaire2">Stagiaire 2</option>
					<option value="stagiaire3">Stagiaire 3</option>
				</select>
			</p>

			<p>
				<label>Alertes : </label> <select id="alertes">
					<option value=""></option>
					<option value="alerte1">Alerte 1</option>
					<option value="alerte2">Alerte 2</option>
					<option value="alerte3">Alerte 3</option>
				</select>
			</p>
		</fieldset>

	</div>
</body>
</html>