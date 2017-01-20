<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="pl-PL">
<head>
   <meta charset="UTF-8">

<style>
.col-xs-5 {
	text-align: right;
}

h2 {
	margin-bottom: 25px;
	text-align: center;
}

.row{
margin-bottom: 5px;



}
</style>

</head>
<body>

	<h2>Rejestracja użytkownika</h2>




	<fieldset>

		<form:form modelAttribute="rejestracja1">




			<div class="row">
				<label class="col-xs-5" for="login">Login: </label>
				<form:input class="col-xs-3" id="login" path="login" type="text" />
				<br />
			</div>

			<div class="row">
				<label class="col-xs-5" for="haslo">Hasło: </label>
				<form:input class="col-xs-3" id="haslo" path="haslo" type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="imie">Imie: </label>
				<form:input class="col-xs-3" id="imie" path="imie" type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="nazwisko">Nazwisko: </label>
				<form:input class="col-xs-3" id="nazwisko" path="nazwisko"
					type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="regon">Regon: </label>
				<form:input class="col-xs-3" id="regon" path="regon" type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="nip">NIP: </label>
				<form:input class="col-xs-3" id="nip" path="nip" type="text" />

				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="miasto">Miasto: </label>
				<form:input class="col-xs-3" id="miasto" path="idAdres.miasto"
					type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="powiat">Powiat: </label>
				<form:input class="col-xs-3" id="powiat" path="idAdres.powiat"
					type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="kodPocztowy">Kod Pocztowy: </label>
				<form:input class="col-xs-3" id="kodPocztowy"
					path="idAdres.kodPocztowy" type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="ulica">Ulica: </label>
				<form:input class="col-xs-3" id="ulica" path="idAdres.ulica"
					type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="nrDomu">Nr Domu: </label>
				<form:input class="col-xs-3" id="nrDomu" path="idAdres.nrDomu"
					type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="nrLokalu">Nr Lokalu: </label>
				<form:input class="col-xs-3" id="nrLokalu" path="idAdres.nrLokalu"
					type="text" />
				<br />
			</div>
			
			<div class="row">
				<label class="col-xs-5" for="tel">tel: </label>
				<form:input class="col-xs-3" id="tel" path="idKontakty.tel"
					type="text" />
				<br />
			</div>

			<div class="row">
				<label class="col-xs-5" for="www">email: </label>
				<form:input class="col-xs-3" id="www" path="idKontakty.strona"
					type="text" />
				<br />
			</div>

			<div class="row">
				<button class=" col-xs-2 col-xs-offset-5" type="submit">Wyślij
					formularz</button>

			</div>




		</form:form>
	</fieldset>
</html>
