<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>Produkty</title>
</head>
<body>


	<form:form modelAttribute="form1" enctype="multipart/form-data">
		<fieldset>




			<label for="login">Login</label>
			<form:input id="login" path="login" type="text" />
			<br />

			<label for="haslo">Hasło</label>
			<form:input id="haslo" path="haslo" type="text" />
			<br />
		
			<label for="imie">Imie</label>
			<form:input id="imie" path="imie" type="text" />
			<br />
			
			<label for="nazwisko">Nazwisko</label>
			<form:input id="nazwisko" path="nazwisko" type="text" />
			<br />
			
			<label for="uprawnienia">Uprawnienia</label>
			<form:input id="uprawnienia" path="uprawnienia" type="text" />
			<br />
			
			<label for="aktywneKonto">Aktywne konto</label>
			<form:radiobutton path="aktywneKonto" value="1" />Tak 
			<form:radiobutton path="aktywneKonto" value="0" />Nie 
			<br />
			
			
			
			<label for="zdjecie">Zdjecie</label>
			<form:input id="zdjecie" path="zdjecie" type="file" />
			<br />
			
			
			
			 <input type="submit" value="Wyślij formularz" />
		</fieldset>
	</form:form>
</html>
