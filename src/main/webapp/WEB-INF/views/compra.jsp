<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>producto List | Awesome App</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<style type="text/css">

.badge a{ 
text-decoration:none;
transition:0.4s;
color:#ffffff;
}
a{
color:#4747ff;
transition:0.4s;
text-decoration:none;
}
a:hover{ 
opacity:0.7;
text-decoration:none;
}
</style>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">

</head>
<body>
	<header>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/"><img alt="Logo" src="${pageContext.request.contextPath}/img/awesome.png"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/productos">Productos</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/reciclajes">Reciclaje</a>
      </li>  
      <li class="nav-item">
        <a class="nav-link" href="/tags">Tags</a>
      </li>  
    </ul>
  </div>
</nav>
	</header>
	<div class = "pt-5 container">
		<p>${numProductos}</p>
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
<%-- 					<td><a href="${pageContext.request.contextPath}/manufacturers/${producto.manufacturer.id}"> ${producto.manufacturer.name}</a></td> --%>
<!-- 					<td> -->
<%-- 						<c:forEach items="${producto.tags}" var="tag"> --%>
<%-- 						 <span class="badge badge-success"><a href="${pageContext.request.contextPath}/tags/${tag.id}">${tag.name}</a></span> --%>
<%-- 						 </c:forEach> --%>
<!-- 					</td> -->
					<td> 
					<div class="form-group">
					<label for="reciclajes">Reciclajes</label> <br>
						<form:select class = "form-control" path=""
 						 items="${reciclajes}" itemLabel="descripcion" itemValue="id"/>
					</div>
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/compra/${reciclajes.id}">Finalizar compra</a> 
<%-- 						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/productos/${producto.id}/delete">Delete</a>  --%>
					</td>
				</tr>
				
			</c:forEach>
			
		</table>
		
	</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>