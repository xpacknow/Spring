<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

<style>
.col-xs-5 {
	text-align: right;
}

h2 {
	margin-bottom: 25px;
}
</style>




</head>
<body>

	<h2 style="text-align: center;">Dodawanie produktu</h2>






	<form:form modelAttribute="form" enctype="multipart/form-data">
		<fieldset>



			<div class="col-xs-12">
				<label class="col-xs-5" for="nazwa">Nazwa :</label>
				<form:input class="col-xs-3" id="nazwa" path="nazwa" type="text" />
				<br />
			</div>
			<div class="col-xs-12">
				<label class="col-xs-5" for="cenaZaSztuke">Cena :</label>
				<form:input class="col-xs-3" id="cenaZaSztuke" path="cenaZaSztuke"
					type="text" />
				<br />
			</div>
			<div class="col-xs-12">
				<label class="col-xs-5" for="opis">Opis :</label>
				<form:textarea class="col-xs-3" id="opis" path="opis" type="text" />
				<br />
			</div>
			<div class="col-xs-12">
				<label class="col-xs-5" for="sztukWMagazynie">Magazyn :</label>
				<form:input class="col-xs-3" id="sztukWMagazynie"
					path="sztukWMagazynie" type="text" />
				<br />
			</div>
			
			<br><br>



			<div class="col-xs-12">
				<label class="col-xs-5" >Stan :</label>
				<label class="form-check-inline" for="stan1"> <form:radiobutton  id="stan1" path="stan" name="stan" value="Nowy" /> Nowy</label>
				<label class="form-check-inline" for="stan2"> <form:radiobutton  id="stan2" path="stan" name="stan" value="Nowy" /> Używany</label>
				
			</div>

			<div class="col-xs-12">
				<label class="col-xs-5" for="zdjecie">Zdjecie :</label>
				<form:input class="col-xs-3" id="zdjecie" path="zdjecie" type="file" />
				<br />
			</div>

			<div class="col-xs-12">
				<button class=" col-xs-2 col-xs-offset-5" type="submit">Wyślij
					formularz</button>
			</div>

		</fieldset>
	</form:form>
</html>
