<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

<style>

span{
text-align: right;
padding-left: 10px;
padding-right: 10px;
border-left-style: solid;

border-left-width: 1px;
border-right-width: 1px;

}
.stopka{
text-align: right;}

.separator{
border-top-style:solid;
border-top-width: 1px;
border-color:red;
margin-top: 50px;
margin-left: 20px;
margin-right: 20 px;


}

.col-xs-3 {

padding-left: 0px;

}

.container-fluid{

padding-left: 0px;
padding-top: 15px;

}




</style>
</head>

<body>


<footer class="separator">
	<div class="container-fluid  ">



		<div class=" col-xs-12 ">

			<div class="col-xs-3">
				<img src="<c:url value="/resource/123.png"></c:url>" alt="image"
					width="100" height="30">&copy; Nowa firma
			</div>
			<div class=" stopka col-xs-9 ">
						<a href="<spring:url value=""/>"><span>O nas</span></a> <a
					href="<spring:url value=""/>"><span>Praca</span></a> <a
					href="<spring:url value=""/>"><span>Regulamin</span></a> <a
					href="<spring:url value=""/>"><span>Kontakt</span></a>
			</div>
		</div>




	</div>
	</footer>
</body>
</html>
