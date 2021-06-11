<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Erreur 404</title>
<%@include file="../head/head.jsp" %>

</head>
<body onload="initPage()">

	<div id="page">
	
		<jsp:include page="../header/header.jsp"></jsp:include>
		<%@include file="../nav/nav.jsp" %>
		
		<p align="center"><img src="images/erreur404.png" /></p>
		
		
	</div>
</body>
</html>