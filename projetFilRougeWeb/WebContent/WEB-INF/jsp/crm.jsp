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
			<li><fieldset><legend>Client 1</legend>
				<p>Demande formation</p>
			</fieldset></li>
			<li><fieldset><legend>Client 2</legend>
				<p>Demande informations</p>
			</fieldset></li>
			<li><fieldset><legend>Client 3</legend>
				<p>Question</p>
			</fieldset></li>
			<li><fieldset><legend>Client 4</legend>
				<p>Evaluation</p>
			</fieldset></li>
			<li><fieldset><legend>Client 5</legend>
				<p>Demande formation intra</p>
			</fieldset></li>
			<li>...</li>
		</ul>
	</fieldset>
	<table id="indicateur">
		<tr>
			<th colspan="3" id="commerciaux">Indicateurs commerciaux</th>
		</tr>
		<tr>
			<td>Nombre stagiaires en formation: xyz</td>
			<td>Formation en cours: xyz</td>
			<td>Chiffre d'affaires: xyz</td>
		</tr>
		<tr>
			<td>Nombre stagiaires à venir: xyz</td>
			<td>Formation planifies : xyz</td>
			<td>Formations complétées: xyz</td>
		</tr>
	</table>
		
	</div>
</body>
</html>