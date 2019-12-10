<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file = "/WEB-INF//views/navbar.jsp" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <title>FOOD FOR RESCUE </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/animate.css">
    
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">

    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/ionicons.min.css">

    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/jquery.timepicker.css">

    
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/icomoon.css">
	<link rel="stylesheet" href="css/style.css">
	
<!-- Bootstrap core CSS -->
	<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
	<link href="../frontal_principal/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

<!-- Custom styles for this template -->
	<link href="css/grayscale.min.css" rel="stylesheet">

<!-- login -->
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	<!-- Main Style Css -->
	<link rel="stylesheet" href="css/csslogin.css"/>
	

	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


  </head>
  <body class="goto-here page-top">
	  <!----------------------------------------------------BARRA------------------------------------------------------------------>
	<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
		<div class="container">
			 <a href="bebidas.html"> <img class = "logo" src="../frontal_principal/img/logo.final.png" href alt=""></a>		
				<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">Menu
				<i class="fas fa-bars"></i>
			 	</button>
					<div class="collapse navbar-collapse" id="navbarResponsive">
						<ul class="navbar-nav ml-auto">
							<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" 
										role="button" aria-haspopup="true" aria-expanded="false">Productos</a>
										<div class="dropdown-menu">
										  <a class="dropdown-item" href="../productosasturianos/panaderia.html">Panadería</a>
										  <a class="dropdown-item" href="../productosasturianos/legumbres.html">Legumbres</a>
										  <a class="dropdown-item" href="../productosasturianos/frutosSecos.html">Frutos Secos</a>
										  <a class="dropdown-item" href="../productosasturianos/embutidos.html">Embutidos</a>
										  <a class="dropdown-item" href="../productosasturianos/conservas.html">Conservas</a>
										  <a class="dropdown-item" href="../productosasturianos/quesos.html">Quesos</a>
										  <a class="dropdown-item" href="../productosasturianos/postres.html">Postres </a>
										  <a class="dropdown-item" href="../productosasturianos/bebidas.html">Bebidas</a>
										</div>
									  </li>
							<li class="nav-item">
								<a class="nav-link js-scroll-trigger" href="reciclaje.html">Reciclaje</a>
							</li>
							<li class="nav-item">
								<a class="nav-link js-scroll-trigger" href="#signup">Contacto</a>
							</li>

							<button onclick="document.getElementById('id01').style.display='block'" class="w3-button w3-white">Login</button>

							<div id="id01" class="w3-modal">
							  <div class="page-content">
								  <div class="form-v8-content">
								  <div class="form-right">
										  <span onclick="document.getElementById('id01').style.display='none'" 
										  class="w3-button w3-display-topright">&times;</span>
									  <div class="tab">
										  <div class="tab-inner">
											  <button class="tablinks" onclick="openCity(event, 'sign-up')" id="defaultOpen">Entrar</button>
										  </div>
										  <div class="tab-inner">
											  <button class="tablinks" onclick="openCity(event, 'sign-in')">Registrarse</button>
										  </div>
									  </div>
									  <form class="form-detail" action="#" method="post">
										  <div class="tabcontent" id="sign-up">						 
											<div class="form-row">
												<label class="form-row-inner">
													<input type="text" name="email" id="email" class="input-text" required>
													<span class="label">E-Mail</span>
													  <span class="border"></span>
												</label>
											</div>
											<div class="form-row">
												<label class="form-row-inner">
													<input type="password" name="password" id="password" class="input-text" required>
													<span class="label">Contraseña</span>
													<span class="border"></span>
												</label>
											</div>
											
											<div class="form-row-last">
												<input type="submit" name="register" class="register" value="Entrar">
											</div>
										</div>
										<!-- -------------------- -->
									</form>
									<form class="form-detail" action="#" method="post">
										<div class="tabcontent" id="sign-in">
											<div class="form-row">
												<label class="form-row-inner">
													<input type="text" name="firstname" id="firstname" class="input-text" required>
													<span class="label">Nombre</span>
													  <span class="border"></span>
												</label>
											</div>
											<div class="form-row">
													<label class="form-row-inner">
														<input type="text" name="lastname" id="lastname" class="input-text" required>
														<span class="label">Apellidos</span>
														  <span class="border"></span>
													</label>
												</div>
											<div class="form-row">
												<label class="form-row-inner">
													<input type="text" name="email" id="email" class="input-text" required>
													<span class="label">E-Mail</span>
													  <span class="border"></span>
												</label>
											</div>
											<div class="form-row">
												<label class="form-row-inner">
													<input type="password" name="password" id="password" class="input-text" required>
													<span class="label">Contraseña</span>
													<span class="border"></span>
												</label>
											</div>
										
										  
											  <div class="form-row-last">
												  <input type="submit" name="register" class="register" value="Registrarse">
											  </div>
										  </div>
									  </form>
								  </div>
							  </div>

						  
								</div>
								
							  </div>
								
							
							<li class="nav-item cta cta-colored"><a href="cart.html" class="nav-link"><span class="icon-shopping_cart"></span>[0]</a></li>
						</ul>
					</div>
			</div>
			</nav>
		


      <!----------------------------------------------------CARROUSEL------------------------------------------------------------------>
	<div class="hero-wrap hero-bread" style="background-image: url('images/Bebidas/cubitera.jpg');">
		<div class="container">
		  <div class="row no-gutters slider-text align-items-center justify-content-center">
			<div class="col-md-9 ftco-animate text-center">
				<p class="breadcrumbs"><span class="mr-2"><a href="index.html">Inicio</a></span> <span>Productos</span></p>
			  <h1 class="mb-0 bread">Bebidas</h1>
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
						  <li><a href="#">Vinos</a></li>
						  <li><a href="#">Orujos</a></li>
						  <li><a href="#">Licores</a></li>
						  <li><a href="#">Sidras</a></li>
						  
					  </ul>
				  </div>
			  </div>
			  <div class="row">
				  <div class="col-md-6 col-lg-3 ftco-animate">
					  <div class="product">
							  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="205" onmouseout="this.src='images/Bebidas/guilfa_blanco.png';
								  " onmouseover="this.src='images/Bebidas/copa-blanco.jpg';" src="images/Bebidas/guilfa_blanco.png" />
							  </a>
						  
						  <div class="text py-3 pb-4 px-3 text-center">
							  <h3><a href="#">Vino blanco</a></h3>
							  <div class="d-flex">
								  <div class="pricing">
									  <p class="price"><span class="price-sale">8€ 70cl</span></p>
								  </div>
							  </div>
							  <div class="bottom-area d-flex px-3">
								  <div class="m-auto d-flex">
									  <a href="#" class="add-to-cart d-flex justify-content-center align-items-center text-center">
										  <span><i class="ion-ios-menu"></i></span>
									  </a>
									  <a href="#" class="buy-now d-flex justify-content-center align-items-center mx-1">
										  <span><i class="ion-ios-cart"></i></span>
									  </a>
									  <a href="#" class="heart d-flex justify-content-center align-items-center ">
										  <span><i class="ion-ios-heart"></i></span>
									  </a>
								  </div>
							  </div>
						  </div>
					  </div>
				  </div>
				  <div class="col-md-6 col-lg-3 ftco-animate">
					  <div class="product">
						  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="205" onmouseout="this.src='images/Bebidas/guilfa.png';
							  " onmouseover="this.src='images/Bebidas/copa-tinto.jpg';" src="images/Bebidas/guilfa.png" />
							  
						  </a>
						  <div class="text py-3 pb-4 px-3 text-center">
							  <h3><a href="#">Vino tinto</a></h3>
							  <div class="d-flex">
								  <div class="pricing">
									  <p class="price"><span>8€ 70cl</span></p>
								  </div>
							  </div>
							  <div class="bottom-area d-flex px-3">
								  <div class="m-auto d-flex">
									  <a href="#" class="add-to-cart d-flex justify-content-center align-items-center text-center">
										  <span><i class="ion-ios-menu"></i></span>
									  </a>
									  <a href="#" class="buy-now d-flex justify-content-center align-items-center mx-1">
										  <span><i class="ion-ios-cart"></i></span>
									  </a>
									  <a href="#" class="heart d-flex justify-content-center align-items-center ">
										  <span><i class="ion-ios-heart"></i></span>
									  </a>
								  </div>
							  </div>
						  </div>
					  </div>
				  </div>
				  <div class="col-md-6 col-lg-3 ftco-animate">
					  <div class="product">
						  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="205" onmouseout="this.src='images/Bebidas/orujo-de-hierbas.png';
							  " onmouseover="this.src='images/Bebidas/hierbas.jpg';" src="images/Bebidas/orujo-de-hierbas.png" />
							  
						  </a>
						  <div class="text py-3 pb-4 px-3 text-center">
							  <h3><a href="#">Orujo de hierbas</a></h3>
							  <div class="d-flex">
								  <div class="pricing">
									  <p class="price"><span>11€ 70cl</span></p>
								  </div>
							  </div>
							  <div class="bottom-area d-flex px-3">
								  <div class="m-auto d-flex">
									  <a href="#" class="add-to-cart d-flex justify-content-center align-items-center text-center">
										  <span><i class="ion-ios-menu"></i></span>
									  </a>
									  <a href="#" class="buy-now d-flex justify-content-center align-items-center mx-1">
										  <span><i class="ion-ios-cart"></i></span>
									  </a>
									  <a href="#" class="heart d-flex justify-content-center align-items-center ">
										  <span><i class="ion-ios-heart"></i></span>
									  </a>
								  </div>
							  </div>
						  </div>
					  </div>
				  </div>
  
				  <div class="col-md-6 col-lg-3 ftco-animate">
					  <div class="product">
							  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="205" onmouseout="this.src='images/Bebidas/orujo-de-miel.png';
								  " onmouseover="this.src='images/Bebidas/miel.jpg';" src="images/Bebidas/orujo-de-miel.png" />
							  </a>
						  <div class="text py-3 pb-4 px-3 text-center">
							  <h3><a href="#">Orujo de miel</a></h3>
							  <div class="d-flex">
								  <div class="pricing">
									  <p class="price"><span>11€ 70cl</span></p>
								  </div>
							  </div>
							  <div class="bottom-area d-flex px-3">
								  <div class="m-auto d-flex">
									  <a href="#" class="add-to-cart d-flex justify-content-center align-items-center text-center">
										  <span><i class="ion-ios-menu"></i></span>
									  </a>
									  <a href="#" class="buy-now d-flex justify-content-center align-items-center mx-1">
										  <span><i class="ion-ios-cart"></i></span>
									  </a>
									  <a href="#" class="heart d-flex justify-content-center align-items-center ">
										  <span><i class="ion-ios-heart"></i></span>
									  </a>
								  </div>
							  </div>
						  </div>
					  </div>
			  </div>
			  <div class="col-md-6 col-lg-3 ftco-animate">
				  <div class="product">
					  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="205" onmouseout="this.src='images/Bebidas/licor-arandanos.png';
						  " onmouseover="this.src='images/Bebidas/miel.jpg';" src="images/Bebidas/licor-arandanos.png" />
					  </a>
					  <div class="text py-3 pb-4 px-3 text-center">
						  <h3><a href="#">Licor de arándanos</a></h3>
						  <div class="d-flex">
							  <div class="pricing">
								  <p class="price"><span>9€ 70cl</span></p>
							  </div>
						  </div>
						  <div class="bottom-area d-flex px-3">
							  <div class="m-auto d-flex">
								  <a href="#" class="add-to-cart d-flex justify-content-center align-items-center text-center">
									  <span><i class="ion-ios-menu"></i></span>
								  </a>
								  <a href="#" class="buy-now d-flex justify-content-center align-items-center mx-1">
									  <span><i class="ion-ios-cart"></i></span>
								  </a>
								  <a href="#" class="heart d-flex justify-content-center align-items-center ">
									  <span><i class="ion-ios-heart"></i></span>
								  </a>
							  </div>
						  </div>
					  </div>
				  </div>
			  </div>
			  <div class="col-md-6 col-lg-3 ftco-animate">
				  <div class="product">
					  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="205" onmouseout="this.src='images/Bebidas/trabanco.jpg';
						  " onmouseover="this.src='images/Bebidas/sidra-principal.jpg';" src="images/Bebidas/trabanco.jpg" />
					  </a>
					  <div class="text py-3 pb-4 px-3 text-center">
						  <h3><a href="#">Sidra Trabanco</a></h3>
						  <div class="d-flex">
							  <div class="pricing">
								  <p class="price"><span>3€ 70cl</span></p>
							  </div>
						  </div>
						  <div class="bottom-area d-flex px-3">
							  <div class="m-auto d-flex">
								  <a href="#" class="add-to-cart d-flex justify-content-center align-items-center text-center">
									  <span><i class="ion-ios-menu"></i></span>
								  </a>
								  <a href="#" class="buy-now d-flex justify-content-center align-items-center mx-1">
									  <span><i class="ion-ios-cart"></i></span>
								  </a>
								  <a href="#" class="heart d-flex justify-content-center align-items-center ">
									  <span><i class="ion-ios-heart"></i></span>
								  </a>
							  </div>
						  </div>
					  </div>
				  </div>
			  </div>
  
			  <div class="col-md-6 col-lg-3 ftco-animate">
				  <div class="product">
					  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="205" onmouseout="this.src='images/Bebidas/licor-sidra-dulce.png';
						  " onmouseover="this.src='images/Bebidas/manzana.jpg';" src="images/Bebidas/licor-sidra-dulce.png" />
					  </a>
					  <div class="text py-3 pb-4 px-3 text-center">
						  <h3><a href="#">Licor de sidra dulce</a></h3>
						  <div class="d-flex">
							  <div class="pricing">
								  <p class="price"><span>8€ 70cl</span></p>
							  </div>
						  </div>
						  <div class="bottom-area d-flex px-3">
							  <div class="m-auto d-flex">
								  <a href="#" class="add-to-cart d-flex justify-content-center align-items-center text-center">
									  <span><i class="ion-ios-menu"></i></span>
								  </a>
								  <a href="#" class="buy-now d-flex justify-content-center align-items-center mx-1">
									  <span><i class="ion-ios-cart"></i></span>
								  </a>
								  <a href="#" class="heart d-flex justify-content-center align-items-center ">
									  <span><i class="ion-ios-heart"></i></span>
								  </a>
							  </div>
						  </div>
					  </div>
				  </div>
		  </div>
  
		  <div class="col-md-6 col-lg-3 ftco-animate">
			  <div class="product">
				  <a href="#" class="img-prod"><img alt="Cambiar imagen" height="205" onmouseout="this.src='images/Bebidas/sidra-baraga.jpg';
					  " onmouseover="this.src='images/Bebidas/vaso.jpeg';" src="images/Bebidas/sidra-baraga.jpg" />
				  </a>
				  <div class="text py-3 pb-4 px-3 text-center">
					  <h3><a href="#">Sidra DOP</a></h3>
					  <div class="d-flex">
						  <div class="pricing">
							  <p class="price"><span>4.20€ 70cl</span></p>
						  </div>
					  </div>
					  <div class="bottom-area d-flex px-3">
						  <div class="m-auto d-flex">
							  <a href="#" class="add-to-cart d-flex justify-content-center align-items-center text-center">
								  <span><i class="ion-ios-menu"></i></span>
							  </a>
							  <a href="#" class="buy-now d-flex justify-content-center align-items-center mx-1">
								  <span><i class="ion-ios-cart"></i></span>
							  </a>
							  <a href="#" class="heart d-flex justify-content-center align-items-center ">
								  <span><i class="ion-ios-heart"></i></span>
							  </a>
						  </div>
					  </div>
				  </div>
			  </div>
		  </div>			   
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
									<a href="#">foodforrescue@gmail.com</a>
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
		<script src="vendor/jquery/jquery.min.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	
		<!-- Plugin JavaScript -->
		<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
	
		<!-- Custom scripts for this template -->
		<script src="js/grayscale.min.js"></script>




		<script type="text/javascript">
			function openCity(evt, cityName) {
				var i, tabcontent, tablinks;
				tabcontent = document.getElementsByClassName("tabcontent");
				for (i = 0; i < tabcontent.length; i++) {
					tabcontent[i].style.display = "none";
				}
				tablinks = document.getElementsByClassName("tablinks");
				for (i = 0; i < tablinks.length; i++) {
					tablinks[i].className = tablinks[i].className.replace(" active", "");
				}
				document.getElementById(cityName).style.display = "block";
				evt.currentTarget.className += " active";
			}
		
			// Get the element with id="defaultOpen" and click on it
			document.getElementById("defaultOpen").click();
		</script>


  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


  <script src="js/jquery.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery.easing.1.3.js"></script>
  <script src="js/jquery.waypoints.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>
  <script src="js/jquery.animateNumber.min.js"></script>
  <script src="js/bootstrap-datepicker.js"></script>
  <script src="js/scrollax.min.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
  <script src="js/google-map.js"></script>
  <script src="js/main.js"></script>
    
  </body>
</html>