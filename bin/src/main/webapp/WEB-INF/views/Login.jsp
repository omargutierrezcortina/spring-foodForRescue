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

</div>
</div>
</div>



<!--   <div id="id01" class="w3-modal"> -->
<!-- 	<div class="page-content"> -->
<!-- 		<div class="form-v8-content"> -->
<!-- 		<div class="form-right"> -->
<!-- 				<span onclick="document.getElementById('id01').style.display='none'"  -->
<!-- 				class="w3-button w3-display-topright">&times;</span> -->
			
<%-- 			<form class="form-detail" action="#" method="post"> --%>
<!-- 				<div class="tabcontent" id="sign-up"> -->
					
<!-- 					<div class="form-row"> -->
<!-- 						<label class="form-row-inner"> -->
<!-- 							<input type="text" name="your_email" id="your_email" class="input-text" required> -->
<!-- 							<span class="label">E-Mail</span> -->
<!-- 							  <span class="border"></span> -->
<!-- 						</label> -->
<!-- 					</div> -->
<!-- 					<div class="form-row"> -->
<!-- 						<label class="form-row-inner"> -->
<!-- 							<input type="password" name="password" id="password" class="input-text" required> -->
<!-- 							<span class="label">Contraseña</span> -->
<!-- 							<span class="border"></span> -->
<!-- 						</label> -->
<!-- 					</div> -->
<!-- 					<div class="tab"> -->
<!-- 				<div class="tab-inner"> -->
<!-- 					<button class="tablinks" onclick="openCity(event, 'sign-up')" id="defaultOpen">Entrar</button> -->
<!-- 				</div> -->
				
<!-- 			</div> -->
<!-- 				</div> -->
<%-- 					</form>	 --%>
<!-- 			</div> -->
<!-- </div> -->
<!-- 	</div> -->
<!-- 	</div> -->
	
	
	
	
<!-- 	<div class = "container"> -->
	
<!-- 		<h1>User Login</h1> -->
<!-- 		<hr/> -->
<%-- 		<p>${aviso}</p> --%>
<!-- 		<div class = "row"> -->
<!-- 			<div class = "col-md-4"> -->
	
<%-- 			    <form:form action = "${pageContext.request.contextPath}/login" method="POST" modelAttribute="usuario"> --%>
					
<!-- 					<div class = "form-group"> -->
<!-- 					  <label for="email">Email</label> -->
<%-- 					  <form:input type ="email" path="email" class = "form-control" /> --%>
<!-- 					</div> -->
<!-- 					<div class type = "password" = "form-group"> -->
<!-- 					  <label for="password">Password</label> -->
<%-- 					  <form:input type ="password" path="password" class = "form-control" /> --%>
<!-- 					</div> -->
						
<!-- 					<button class = "btn btn-primary" type = "submit" >Acceder</button> -->
<%-- 				</form:form> --%>
<!-- 			</div> -->
<!-- 		</div> -->
	
<!-- 	</div> -->
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>