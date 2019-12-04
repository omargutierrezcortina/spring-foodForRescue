<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar productos | Aswesome App</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	
	<div class = "pt-5 container">
			<h2>Producto ${producto.id}</h2>
			<hr>
		<div class = " row justify-content-center">

			<div class = "col-md-8">
				 <form:form action = "${pageContext.request.contextPath}/productos" method="POST" modelAttribute="producto">
				
					<div class = "form-group">
					  <label for="referencia">Referencia</label>
					  <form:input path="referencia" class = "form-control" />
					</div>
				
					<div class = "form-group">
						<label for="peso">Peso</label>
						<form:input path="peso" class = "form-control"/>
					</div>
				
					<div class="form-group">
						<label for="precio">Precio</label>
						<form:input path="precio" class = "form-control"/>
					</div>
					
					<div class="form-group">
						<label for="categoria">Categoría</label>
						<form:input path="categoria" class = "form-control"/>
					</div>
					
					<div class="form-group">
						<label for="fabricante">Fabricante</label>
						<form:input path="fabricante" class = "form-control"/>
					</div>
					
					<div class="form-group">
						<label for="descuento">Descuento</label>
						<form:input path="descuento" class = "form-control"/>
					</div>
					
<!-- 					<div class="form-group"> -->
<!-- 					<label for="manufacturer">Manufacturer</label> <br> -->
<%-- 						<form:select class = "form-control" path="manufacturer" --%>
<%-- 						 items="${manufacturers}" itemLabel="name" itemValue="id"/> --%>
<!-- 					</div> -->
					
<!-- 					<div class="form-group"> -->
<!-- 					<label for="tag">Tag</label> <br> -->
<%-- 					<form:select class = "form-control" path="tags" items="${tags}" --%>
<%-- 					 itemLabel="name" itemValue="id"/> --%>
<!-- 					</div> -->
					
					<form:hidden path="id" />
				
					<a class = "btn btn-info" href = "${pageContext.request.contextPath}/productos" >Back to list</a>
					<button class = "btn btn-primary" type = "submit" >Save</button>
				</form:form>
        
			</div>
		</div>
	</div>
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>