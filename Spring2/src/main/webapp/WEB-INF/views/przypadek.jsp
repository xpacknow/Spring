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



	<c:forEach items="${klienci}" var="klient">


		${klient.idKlient}
		${klient.login}
		${klient.haslo}
		${klient.imie}
		${klient.nazwisko}
		
		
		<br>
	</c:forEach>

	
</html>
