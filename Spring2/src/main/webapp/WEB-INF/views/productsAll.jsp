<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

<style>

.sep{
border-bottom-style: dashed ;
	border-bottom-width: 1px;
	border-bottom-color: gray;

}





</style>







<title>Produkty</title>
</head>
<body>

	<br /> POWINNO DZIAŁAĆ



	<c:forEach items="${produkt2}" var="product">


	<div class="col-xs-12">
		<div class="col-xs-1">${product.idProdukty}</div>
		<div class="col-xs-3"><img src="<c:url value="/resource/123.png"></c:url>" alt="image"  style = "width:100%"/></div>
		<div class="col-xs-1">${product.nazwa}</div>
		<div class="col-xs-1">${product.cenaZaSztuke}</div>
		<div class="col-xs-2">${product.opis}</div>
		<div class="col-xs-1">${product.sztukWMagazynie}</div>
		<div class="col-xs-1">${product.stan}</div>
		<div class="col-xs-1"><a href="http://localhost:8080/xpacknow/products/edit?id=${product.idProdukty}">EDYCJA</a></div>
		<div class="col-xs-1"><a href="http://localhost:8080/xpacknow/products/delete?id=${product.idProdukty}">USUŃ</a></div>
			<br>
	</div>
<div class="col-xs-12 sep"></div>
		
	</c:forEach>





	
		

	
	
	
	
	
	
	
</html>
