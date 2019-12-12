<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file = "/WEB-INF/views/navbar.jsp" %>

<!DOCTYPE html>
<html lang="es">
  <head>
    <title>FOOD FOR RESCUE </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
        
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/open-iconic-bootstrap.min.css">
    
    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/animate.css"/>
    
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/owl.carousel.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/owl.theme.default.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/magnific-popup.css"/>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/aos.css">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ionicons.min.css"/>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-datepicker.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery.timepicker.css"/>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/flaticon.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/icomoon.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
	
<!-- Bootstrap core CSS -->
	<link type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
	<link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

<!-- Custom styles for this template -->
	<link type="text/css" href="${pageContext.request.contextPath}/css/grayscale.min.css" rel="stylesheet">

<!-- login -->
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	<!-- Main Style Css -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/csslogin.css"/>
	

	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


  </head>
  <body class="goto-here page-top">
	  <!----------------------------------------------------BARRA------------------------------------------------------------------>
	
	


      <!----------------------------------------------------CARROUSEL------------------------------------------------------------------>
	<div class="hero-wrap hero-bread" style="background-image: url('${pageContext.request.contextPath}/${categoria.imagen}');">
		<div class="container">
		  <div class="row no-gutters slider-text align-items-center justify-content-center">
			<div class="col-md-9 ftco-animate text-center">
					<p class="breadcrumbs"><span class="mr-2">Inicio</span> <span>Productos</span></p>			  <h1 class="mb-0 bread">${categoria.titulo}</h1>
			</div>
		  </div>
		</div>
	  </div>
    <!----------------------------------------------------PRODUCTOS------------------------------------------------------------------>		

	  <section class="ftco-section">
		  <div class="container">
			  <div class="row justify-content-center">
				  <div class="col-md-10 mb-5 text-center">
					  <ul class="product-category">
						  <c:forEach items="${categoria.productos}" var="producto">
						    <li><a href="#">${producto.categoria}</a></li>
						  </c:forEach>
					  </ul>
				  </div>
			  </div>
			  
			   <div class="row">
			    <c:forEach items="${categoria.productos}" var="producto">
			    <div class="col-md-6 col-lg-3 ftco-animate">
					  <div class="product">
						  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="210" onmouseout="this.src='${pageContext.request.contextPath}/${producto.foto1}'" onmouseover="this.src='${pageContext.request.contextPath}/${producto.foto2}'" src="${pageContext.request.contextPath}/${producto.foto1}" />
							  
						  </a>
						  <div class="text py-3 pb-4 px-3 text-center">
							  <h3><a href="#">${producto.categoria}</a></h3>
							  <div class="d-flex">
								  <div class="pricing">
									  <p class="price"><span>${producto.precio}</span></p>
								  </div>
							  </div>
							  <div class="bottom-area d-flex px-3">
								  <div class="m-auto d-flex">								
									  <a href="${pageContext.request.contextPath}/carrito/${producto.id}" class="buy-now d-flex justify-content-center align-items-center mx-1">
										  <span><i class="ion-ios-cart"></i></span>
									  </a>								
								  </div>
							  </div>
						  </div>
					  </div>
				  </div>
			  
			   </c:forEach>
			    </div>
			 
		  </div>
	  </section>
		



  <!----------------------------------------------------FOOTER------------------------------------------------------------------>		

    <!-- Signup Section -->
    <section id="signup" class="signup-section">
			<div class="container">
				<div class="row">
					<div class="col-md-10 col-lg-8 mx-auto text-center">
	
					</div>
				</div>
			</div>
		</section>
	
		<!-- Contact Section -->
		<section class="contact-section bg-black">
			<div class="container">
	
				<div class="row">
	
					<div class="col-md-4 mb-3 mb-md-0">
						<div class="card py-4 h-100">
							<div class="card-body text-center">
								<i class="fas fa-map-marked-alt text-primary mb-2"></i>
								<h4 class="text-uppercase m-0">Dirección</h4>
								<hr class="my-4">
								<div class="small text-black-50">Calle Avenida de Oviedo, nº55, bajo 6</div>
							</div>
						</div>
					</div>
	
					<div class="col-md-4 mb-3 mb-md-0">
						<div class="card py-4 h-100">
							<div class="card-body text-center">
								<i class="fas fa-envelope text-primary mb-2"></i>
								<h4 class="text-uppercase m-0">Email</h4>
								<hr class="my-4">
								<div class="small text-black-50">
									<a href="#">foofforrescue@gmail.com</a>
								</div>
							</div>
						</div>
					</div>
	
					<div class="col-md-4 mb-3 mb-md-0">
						<div class="card py-4 h-100">
							<div class="card-body text-center">
								<i class="fas fa-mobile-alt text-primary mb-2"></i>
								<h4 class="text-uppercase m-0">Teléfono</h4>
								<hr class="my-4">
								<div class="small text-black-50">985678598</div>
							</div>
						</div>
					</div>
				</div>
	
				<div class="social d-flex justify-content-center">
					<a href="#" class="mx-2">
						<i class="fab fa-twitter"></i>
					</a>
					<a href="#" class="mx-2">
						<i class="fab fa-facebook-f"></i>
					</a>
					<a href="#" class="mx-2">
						<i class="fab fa-instagram"></i>
					</a>
				</div>
	
			</div>
		</section>
	
		<!-- Footer -->
		<footer class="bg-black small text-center text-white-50">
			<div class="container">
				Copyright &copy; Food For Rescue 2019
			</div>
		</footer>
	
		  <!----------------------------------------------------SCRIPTS------------------------------------------------------------------>		

		<!-- Bootstrap core JavaScript -->
		<script src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	
		<!-- Plugin JavaScript -->
		<script src="${pageContext.request.contextPath}/vendor/jquery-easing/jquery.easing.min.js"></script>
	


<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/jquery-migrate-3.0.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/popper.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/jquery.easing.1.3.js"></script>
  <script src="${pageContext.request.contextPath}/js/jquery.waypoints.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/jquery.stellar.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/owl.carousel.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/jquery.magnific-popup.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/aos.js"></script>
  <script src="${pageContext.request.contextPath}/js/jquery.animateNumber.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/bootstrap-datepicker.js"></script>
  <script src="${pageContext.request.contextPath}/js/scrollax.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/main.js"></script>
  </body>
</html>