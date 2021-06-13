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

		<div>
			<h2>Session 14 - Base de donn&eacute;es</h2>
			<p>1 : médiocre 5: excellent</p>
		</div>
<!-- 		<p> -->
<!-- 			<select id="monselect"> -->
<!-- 				<option value="valeur1">Jean Bont</option> -->
<!-- 				<option value="valeur2" selected>Claud Haut</option> -->
<!-- 				<option value="valeur3">Rémi Molle</option> -->
<!-- 			</select> -->
<!-- 		</p> -->

		<form action="#evaluation" id="evalForm" method="post">
			<fieldset id="evals">

				<div id="evalAccueil">
					<label>Evaluation Accueil</label>
					<p>
						<input type="radio" id="1" name="accueil" value="1"> <label
							for="1">1</label> <input type="radio" id="2" name="accueil"
							value="2"> <label for="2">2</label> <input type="radio"
							id="3" name="accueil" value="3"> <label for="3">3</label>
						<input type="radio" id="4" name="accueil" value="4"> <label
							for="4">4</label> <input type="radio" id="5" name="accueil"
							value="5"> <label for="5">5</label>
					</p>
				</div>
				<div id="evalEnvironnement">
					<label>Evaluation Environnement</label>
					<p>
						<input type="radio" id="1" name="environnement" value="1">
						<label for="1">1</label> <input type="radio" id="2"
							name="environnement" value="2"> <label for="2">2</label>
						<input type="radio" id="3" name="environnement" value="3">
						<label for="3">3</label> <input type="radio" id="4"
							name="environnement" value="4"> <label for="4">4</label>
						<input type="radio" id="5" name="environnement" value="5">
						<label for="5">5</label>
					</p>
				</div>

				<div id="evalContenu">
					<label>Evaluation Contenu</label>
					<p>
						<input type="radio" id="1" name="contenu" value="1"> <label
							for="1">1</label> <input type="radio" id="2" name="contenu"
							value="2"> <label for="2">2</label> <input type="radio"
							id="3" name="contenu" value="3"> <label for="3">3</label>
						<input type="radio" id="4" name="contenu" value="4"> <label
							for="4">4</label> <input type="radio" id="5" name="contenu"
							value="5"> <label for="5">5</label>
					</p>
				</div>

				<div id="evalFormateur">
					<label>Evaluation Formateur</label>
					<p>
						<input type="radio" id="1" name="formateur" value="1"> <label
							for="1">1</label> <input type="radio" id="2" name="formateur"
							value="2"> <label for="2">2</label> <input type="radio"
							id="3" name="formateur" value="3"> <label for="3">3</label>
						<input type="radio" id="4" name="formateur" value="4"> <label
							for="4">4</label> <input type="radio" id="5" name="formateur"
							value="5"> <label for="5">5</label>
					</p>
				</div>
			</fieldset>
			<br/>
			<input type="submit" class="boutonEnregistrement" value="Soumettre" id="soumettre">
		</form>

	</div>
</body>
</html>