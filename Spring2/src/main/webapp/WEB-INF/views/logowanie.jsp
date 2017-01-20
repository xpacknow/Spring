<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<c:url var="postLoginUrl" value="/j_spring_security_check"/>

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

	<h2 style="text-align: center;">Logowanie</h2>



    <div class="row">
		<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h3 class="panel-title">Zaloguj się</h3>
			 	</div>
			  	<div class="panel-body">
			  		<c:if test="${not empty error}">
					<div class="alert alert-danger">
						<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
					</div>
				</c:if>
			    	<form action="${postLoginUrl}" method="post">
                    <fieldset>
			    	  	<div class="form-group">
			    		    <input class="form-control" placeholder="Nazwa użytkownika" name='name' type="text">
			    		</div>
			    		<div class="form-group">
			    			<input class="form-control" placeholder="Hasło" name='password'  type="password" >
			    		</div>
			    		<div class="form-group">
			    		
			    		<input type="checkbox" name='remember'/>
			    		Zapamiętaj mnie <br/>
			    		
			    		</div>
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="Zaloguj">
			    		

			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>

</body>





</html>
