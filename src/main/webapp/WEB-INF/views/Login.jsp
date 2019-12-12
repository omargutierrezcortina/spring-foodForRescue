<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	<!-- Main Style Css -->
	<link rel="stylesheet" href="css/csslogin.css"/>
	

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


<title>FFRLogin</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<header class="masthead">
	<div class ="container">
		<h1>Food For Rescue</h1>
		<hr/>
		<p>${aviso}</p>
		
		<form:form action = "${pageContext.request.contextPath}/login" method="POST" modelAttribute="usuario"> 
		
		<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Inicio de Sesión</h3>
			</div>
			<div class="card-body">
			
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
					<div class = "form-group">
					  <label for="email">Email</label>
					  <form:input type ="email" path="email" class = "form-control" />
	
<!-- 	<div id="id01" class="w3-modal"> --> 
<!-- 	<div class="page-content"> -->
	<div class = "container">	
		<div class="form-v8-content">
		<div class="form-right">
				<span onclick="document.getElementById('id01').style.display='none'" 
				class="w3-button w3-display-topright">&times;</span>
			
	
	
		<h1>User Login</h1>
		<hr/>
		<p>${aviso}</p>
		<div class = "row">
			<div class = "col-md-4">
	
			    <form:form action = "${pageContext.request.contextPath}/login" method="POST" modelAttribute="usuario">	
					<div class="form-row">
<!-- 					<label for="email"class="form-row-inner">Email</label> -->
					  <form:input type ="email" path="email" class = "form-control"/> 
					  		<span class="label">E-Mail</span>
							  <span class="border"></span>
							  
					</div>
					<div class="form-row">
						<label class="form-row-inner">
							<input type="password" name="password" id="password" class="input-text" required>
							<span class="label">Contraseña</span>
							<span class="border"></span>
						</label>
					</div>
  					<div class="tab">
						<div class="tab-inner">
  						<button class = "btn btn-primary" type = "submit" >Acceder</button>
  						</div>
					</div>
				</form:form>
			</div>
		</div>
		</header>	
		
					
		
				

</div>
</div>
</div>


	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>

