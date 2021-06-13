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
			<legend>Monitoring des sessions</legend>
			<div id="session">
				<p>
					<label>Choix de la session :</label> <select
						id="choixFormationMonitorer">
						<option value=""></option>
						<option value="">Stratégie informatique</option>
						<option value="">Transformation digitale</option>
						<option value="">Développement JAVA</option>
					</select>
				</p>

				<p>
					<label>Salle install&eacute;e : </label> <input type="checkbox" />
				</p>

				<p>
					<label>Formateur confirm&eacute; : </label> <input type="checkbox" checked />
				</p>

				<p>
					<label>Support imprim&eacute; : </label> <input type="checkbox" checked />
				</p>
			</div>
			<div id="date">
				<p>
					<label>Date de d&eacute;but : </label> <input type="date" value="2021-07-22" />
				</p>

				<p>
					<label>Date de fin : </label> <input type="date" value="2021-07-27"/>
				</p>
			</div>

		</fieldset>
		<br/>
		<fieldset id="salle">
			<p>
				<label>Evaluations stagiaires : </label> <select id="evalStagiaires">
					<option value=""></option>
					<option value="stagiaire1">Faiz A.</option>
					<option value="stagiaire2">Nicolas C.</option>
					<option value="stagiaire3">Yan F.</option>
				</select>
			</p>

			<p>
				<label>Alertes : </label> <select id="alertes">
					<option value=""></option>
					<option value="alerte1">D&eacute;gats salle</option>
					<option value="alerte2">Formateur indisponible</option>
				</select>
			</p>
			<input type="button" value="Voir le d&eacute;tail" style="align=center;" />
		</fieldset>

	</div>
</body>
</html>