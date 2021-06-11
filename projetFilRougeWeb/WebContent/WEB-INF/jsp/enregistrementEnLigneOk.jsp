<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>IT Training - Enregistrement en ligne</title>
<%@include file="head/head.jsp"%>
</head>
<body onload="initPage()">

		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp"%>

		<p>${sessionScope.stagiaire.prenom } ${sessionScope.stagiaire.nom } est bien inscrit</p>
		
</body>
</html>