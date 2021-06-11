<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*" session ="true" %>
<%@ page session="true" %>

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
			<c:if test="${sessionScope.role == 'Stagiaire'}">
				<a href="evaluation">Evaluation de la session</a>
			</c:if>
			</p>
			<c:if test="${sessionScope.role == 'Responsable'}">
			
				<a href="logistique">Logistique & Organisation</a> 
				
			
			<br />
			<p>
				<a href="monitoring">Monitoring</a>
				<a href="crm">Service commercial - CRM</a>
				
			</p>
			</c:if>
			
			<p>
			 <%= session.getAttribute("role") %>
			</p>
		</div>

	</div>
</body>
</html>