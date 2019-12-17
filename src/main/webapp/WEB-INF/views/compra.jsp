<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>producto List </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>

	 body { background-color: #EFFBEF; }
    
 </style>



	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mycss.css">


</head>
<body>
	<header>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/"><img alt="Logo" src="${pageContext.request.contextPath}/img/logo.final.png"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="/principal">Principal</a>
      </li>  
      <li class="nav-item">
        <a class="nav-link" href="/reciclajes">Reciclaje</a>
      </li>  
      <li class="nav-item">
        <a class="nav-link" href="/productos">Compra</a>
      </li>  
      <li class="nav-item">
<!--         <a class="nav-link" href="/categorias">Categorias</a> -->
          <li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" 
										role="button" aria-haspopup="true" aria-expanded="false">Categorias</a>
										<div class="dropdown-menu">
										  <a class="dropdown-item" href="../categoria/1">Panadería</a>
										  <a class="dropdown-item" href="../categoria/2">Legumbres</a>
										  <a class="dropdown-item" href="../categoria/3">Frutos Secos</a>
										  <a class="dropdown-item" href="../categoria/4">Embutidos</a>
										  <a class="dropdown-item" href="../categoria/5">Conservas</a>
										  <a class="dropdown-item" href="../categoria/6">Quesos</a>
										  <a class="dropdown-item" href="../categoria/7">Postres </a>
										  <a class="dropdown-item" href="../categoria/8">Bebidas</a>
										</div>
	 </li>
      <li class="nav-item">
        <a class="nav-link" href="/compra">Carrito</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="/logout">Cerrar Sesión</a>
      </li>
    </ul>
  </div>
</nav>
	</header>
	<div class = "pt-5 container">
		<h1> <font color="black"/> <align="center">Listado de Productos</h1>
		<hr/>

		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Referencia</th>
				<th>Peso</th>
				<th>Precio</th>
				<th>Categoría</th>
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
					</td>
				</tr>
				
			</c:forEach>
			
		</table>
		
		 <form:form action = "${pageContext.request.contextPath}/aplicarDescuento" method="POST"  modelAttribute="compra">
		 
		         <form:select class = "form-control" path="reciclaje"
 						 items="${reciclajes}" itemLabel="descripcion" itemValue="id"/>
 						 <br> 
 						 
 						 	<button align="center" class = "example_b" type = "submit" >Aplicar</button>

		 </form:form>
		
<!-- 					<div class="form-group"> -->
<!-- 					<label for="reciclajes">Reciclajes</label> <br> -->
<%-- 						<form:select class = "form-control" path="" --%>
<%--  						 items="${reciclajes}" itemLabel="descripcion" itemValue="id"/> --%>
<!-- 					</div> -->
						
 						 
				
	</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>