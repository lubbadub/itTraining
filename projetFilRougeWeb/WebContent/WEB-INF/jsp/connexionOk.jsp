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
		
		<div id="pagesIntranet">
			<p>
				<a href="logistique">Logistique & Organisation</a> 
				<a href="evaluation">Evaluation de la session</a>
			</p>
			<br />
			<p>
				<a href="monitoring">Monitoring</a>
				<a href="crm">Service commercial - CRM</a>
			</p>
		</div>

	</div>
</body>
</html>