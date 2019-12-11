<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file = "/WEB-INF//views/navbar.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>reciclaje List | Awesome App</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">


	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">

</head>
<body>
	<header>
	
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