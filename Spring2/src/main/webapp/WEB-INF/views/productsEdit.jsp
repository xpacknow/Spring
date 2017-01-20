<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

<style>

input.col-xs-1{
margin-left: 1px;


}

textarea.col-xs-3{
margin-left: 1px;
margin-right: 5px;


}

</style>







<title>Produkty</title>
</head>
<body>
	<form:form modelAttribute="form" enctype="multipart/form-data">


	<div class="row">
		<div class="col-xs-12">
			<div class="col-xs-1">ID</div>
			<div class="col-xs-3">Zdjęcie produktu :</div>
			<div class="col-xs-1">Nazwa :</div>
			<div class="col-xs-1">Cena :</div>
			<div class="col-xs-3">Opis :</div>
			<div class="col-xs-1">Sztuk :</div>
			<div class="col-xs-1">Stan :</div>

		</div>
	</div>
	<br>
	<br>

	<div class="row">
		<div class="col-xs-12">
			<div class="col-xs-1"  >${produkt2.idProdukty}</div>
			<div class="col-xs-3">
				<img src="<c:url value="/resource/123.png"></c:url>" alt="image"
					style="width: 50%" />
			</div>
			<div class="col-xs-1">${produkt2.nazwa}</div>
			<div class="col-xs-1">${produkt2.cenaZaSztuke}</div>
			<div class="col-xs-3">${produkt2.opis}</div>
			<div class="col-xs-1">${produkt2.sztukWMagazynie}</div>
			<div class="col-xs-1">${produkt2.stan}</div>
			<br>
		</div>
	</div>


		<div class="row">
			<div class="col-xs-12">

		
            <input class="col-xs-1"  id="idProdukty" name="idProdukty" type="text"  disabled value="${produkt2.idProdukty}"/>

				
				<div class="col-xs-3">Edycja zdjecia</div>

			
		
					<form:input class="col-xs-1" path="nazwa" type="text"   />
				

			
					<form:input class="col-xs-1" path="cenaZaSztuke" type="text" />
				

				
					<form:textarea class="col-xs-3"  path="opis" type="text" />


			
					<form:input class="col-xs-1" path="sztukWMagazynie" type="text" />
				
				
					<form:input class="col-xs-1" path="stan" type="text" />
				
</div>
		</div>

		<br>
		<br>
		<br>
		<div class="row">
			<div class="col-xs-12">
				<button class=" col-xs-2 col-xs-offset-9" type="submit">Wyślij
					formularz</button>
			</div>
		</div>
	</form:form>
</html>
