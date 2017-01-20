<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>

<head>
<style>
.nawigacja {
	border-bottom-style: solid;
	border-bottom-width: 1px;
	border-bottom-color: red;
}
</style>



</head>

<body>

	<nav class="navbar nawigacja ">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">SYMBOL</a>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="<spring:url value=""/>">Strona główna</a></li>
				<li><a href="<spring:url value=""/>">Produkty</a></li>
				<li><a href="<spring:url value=""/>">Dodaj produkt</a></li>
				<li><a href="<spring:url value=""/>">Zaloguj</a></li>
			</ul>
		</div>
	</nav>

</body>
</html>