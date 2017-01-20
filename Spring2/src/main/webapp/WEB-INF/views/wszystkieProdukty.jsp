<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>Produkty</title>
</head>
<body>

	<br /> POWINNO DZIAŁAĆ



	<c:forEach items="${produkt2}" var="product">


		${product.idProdukty}
		${product.nazwa}
		${product.cenaZaSztuke}
		${product.opis}
		${product.sztukWMagazynie}
		${product.stan}
		//${product.zdjecie}
		<img src="<c:url value="/resource/123.png"></c:url>" alt="image"  style = "width:10%"/>
		<br>
	</c:forEach>

	
</html>
