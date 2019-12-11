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
										  <a class="dropdown-item" href="../panaderia">Panadería</a>
										  <a class="dropdown-item" href="../legumbres">Legumbres</a>
										  <a class="dropdown-item" href="../frutosSecos">Frutos Secos</a>
										  <a class="dropdown-item" href="../embutidos">Embutidos</a>
										  <a class="dropdown-item" href="../conservas">Conservas</a>
										  <a class="dropdown-item" href="../quesos">Quesos</a>
										  <a class="dropdown-item" href="../postres">Postres </a>
										  <a class="dropdown-item" href="/bebidas">Bebidas</a>
										</div>
									  </li>
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
	
	
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>