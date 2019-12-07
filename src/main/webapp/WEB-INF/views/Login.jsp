<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	
	<div class = "container">
	
		<h1>User Login</h1>
		<hr/>
		<p>${aviso}</p>
		<div class = "row">
			<div class = "col-md-4">
	
			    <form:form action = "${pageContext.request.contextPath}/login" method="POST" modelAttribute="usuario">
					
					<div class = "form-group">
					  <label for="email">Email</label>
					  <form:input path="email" class = "form-control" />
					</div>
					<div class = "form-group">
					  <label for="password">Password</label>
					  <form:input path="password" class = "form-control" />
					</div>
						
					<button class = "btn btn-primary" type = "submit" >Acceder</button>
				</form:form>
			</div>
		</div>
	
	</div>
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>