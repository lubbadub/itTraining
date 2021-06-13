<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - CRM</title>
<%@include file="head/head.jsp" %>
</head>
<body onload="initPage()">

	<div id="page">
	
		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp" %>
		
	<fieldset id="remontee">
		<legend>Remontées clients</legend>
		<ul>
			<li><fieldset><legend>Pierre G.</legend>
				<p>Demande formation</p>
			</fieldset></li>
			<li><fieldset><legend>Clemence A.</legend>
				<p>Demande informations</p>
			</fieldset></li>
			<li><fieldset><legend>Jean B.</legend>
				<p>Question</p>
			</fieldset></li>
			<li><fieldset><legend>Julie T.</legend>
				<p>Evaluation</p>
			</fieldset></li>
			<li><fieldset><legend>Michel P.</legend>
				<p>Demande formation intra</p>
			</fieldset></li>
			<li></li>
		</ul>
	</fieldset>
	<br/>
	<table id="indicateur">
		<tr>
			<th colspan="3" id="commerciaux">Indicateurs commerciaux</th>
		</tr>
		<tr>
			<td>Nombre stagiaires en formation: 94</td>
			<td>Formation en cours: 7</td>
			<td>Chiffre d'affaires: 643 500€</td>
		</tr>
		<tr>
			<td>Nombre stagiaires à venir: 86</td>
			<td>Formation planifies : 8</td>
			<td>Formations complétées: 85</td>
		</tr>
	</table>
		
	</div>
</body>
</html>