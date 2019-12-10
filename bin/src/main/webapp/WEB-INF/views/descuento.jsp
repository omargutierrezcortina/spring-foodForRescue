<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ include file = "/WEB-INF//views/navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>producto List | Awesome App</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">



</head>
<body>
	<header>
	
	</header>
	<div class = "pt-5 container">
		<h1>Listado de Productos</h1>
		<hr/>

<!-- 				<div class="alert alert-primary" role="alert"> -->
<%-- 				 ${message} --%>
<!-- 				</div> -->
	

		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Referencia</th>
				<th>Peso</th>
				<th>Precio</th>
				<th>Categor�a</th>
				<th>Fabricante</th>
				<th>Descuento</th>
				
				<th>Actions</th>
			</tr>
			
			<c:forEach items="${productos}" var="producto">
			
				<tr>
					<td>${producto.referencia}</td>
					<td>${producto.peso}</td>
					<td>${producto.precio}</td>
					<td>${producto.categoria}</td>
					<td>${producto.fabricante}</td>
					<td>${producto.descuento}</td>
					<td>${producto.cantidad}</td>
					<td> 
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/principal/finCompra">Finalizar compra</a> 
					</td>
				</tr>
				
			</c:forEach>
			
		</table>
		
		
		<p>Total sin descuento: ${compra.precio}</p>
		<p>Total con descuento aplicado: ${compra.precioConDescuento}</p>
		
	</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>