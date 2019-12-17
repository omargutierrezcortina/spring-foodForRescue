<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ include file = "/WEB-INF/views/navbar.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear Reciclaje </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<style>
    body { background-color: #EFFBEF; }
    
     
  </style>



	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mycss.css">


</head>
<body>

	
	<div class = "pt-5 container">
			<h2> <font color="black">Reciclaje </font></h2>
			<hr>
		<div class = " row justify-content-center">

			<div class = "col-md-8">
				 <form:form action = "${pageContext.request.contextPath}/crearReciclaje" method="GET" modelAttribute="reciclaje">				
					
					<div class="form-group">
					<label for="tipos"> <font color="black">Tipos</label> <br>
						<form:select class = "form-control" path="tipo"
 						 items="${tipos}" itemLabel="value" itemValue="value"/>
					</div>
					
					
					<div class="form-group">
					<label for="Peso"><font color="black">Peso</font></label> <br>
 						 <form:input type="number" path="peso"  min="0" max="15" onkeydown="return false"/>
					</div>					
					
					<form:hidden path="id" />
				
					<a class = "example_b" href = "${pageContext.request.contextPath}/reciclajes" >Back to list</a>
					<button class = "example_b" type = "submit" >Save</button>
				</form:form>
        
			</div>
		</div>
	</div>
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>




