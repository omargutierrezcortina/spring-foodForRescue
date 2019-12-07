<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>reciclaje List | Awesome App</title>
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
        <a class="nav-link" href="/reciclajes">reciclajes</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/reciclaje">Reciclaje</a>
      </li>  
      <li class="nav-item">
        <a class="nav-link" href="/tags">Tags</a>
      </li>  
    </ul>
  </div>
</nav>
	</header>
	<div class = "pt-5 container">
		
		<h1>Listado de reciclajes</h1>
		<hr/>

<!-- 				<div class="alert alert-primary" role="alert"> -->
<%-- 				 ${message} --%>
<!-- 				</div> -->
	

		
		<p>
			<a class = "btn btn-primary" href="${pageContext.request.contextPath}/reciclajes/empty">Add reciclaje</a>
			
		</p>
	
		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Tipo</th>
				<th>Peso</th>
				<th>Descuento</th>
				
				
				
			</tr>
			
			<c:forEach items="${reciclajes}" var="reciclaje">
			
				<tr>
					<td>${reciclaje.tipo}</td>
					<td>${reciclaje.peso}</td>
					<td>${reciclaje.descuento}</td>
					
<%-- 					<td><a href="${pageContext.request.contextPath}/reciclajes/${reciclaje.reciclaje.id}"> ${reciclaje.reciclaje.name}</a></td> --%>
<!-- 					<td> -->
<%-- 						<c:forEach items="${reciclaje.tags}" var="tag"> --%>
<%-- 						 <span class="badge badge-success"><a href="${pageContext.request.contextPath}/tags/${tag.id}">${tag.name}</a></span> --%>
<%-- 						 </c:forEach> --%>
<!-- 					</td> -->
					
				</tr>
				
			</c:forEach>
			
		</table>
		
	</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>