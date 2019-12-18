package com.foodForRescue.spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import foodForRescue.model.Producto;
import foodForRescue.model.Reciclaje;
import foodForRescue.model.Usuario;
import foodForRescue.repository.ProductoRepository;
import foodForRescue.repository.ReciclajeRepository;
import foodForRescue.repository.UsuarioRepository;



@SpringBootApplication
public class SpringFoodForRescueApplication implements CommandLineRunner {

	
	@Autowired
	private ProductoRepository productoRepository; 
	
	@Autowired
	private ReciclajeRepository reciclajeRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringFoodForRescueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		/**
		 * Listado de productos BEBIDAS
		 */
		productoRepository.save(new Producto(1L,"FF1212", 70, 2.9, "Sidra", "ibias", 0, "oriente", 2,"img/Bebidas/trabanco.jpg", "img/Bebidas/sidra-principal.jpg"));
		productoRepository.save(new Producto(2L,"FF2323", 70, 4.2, "Vino Blanco", "Ibias", 0, "oriente", 2,"img/Bebidas/copa-blanco.jpg", "img/Bebidas/guilfa_blanco.png"));
		productoRepository.save(new Producto(3L, "FF3434", 70, 4.2, "Vino Tinto", "Cangas", 0, "Narcea", 2, "img/Bebidas/guilfa.png", "img/Bebidas/copa-tinto.jpg" ));
		productoRepository.save(new Producto(4L, "FF2222", 70, 7, "Orujo de hierbas", "Oviedo",0, "Oviedo",2, "img/Bebidas/orujo-de-hierbas.png", "img/Bebidas/hierbas.jpg"));
		productoRepository.save(new Producto(5L, "FF2222", 70, 7, "Orujo de miel", "Oviedo",0, "Oviedo",2, "img/Bebidas/orujo-de-miel.png", "img/Bebidas/miel.jpg"));
		productoRepository.save(new Producto(6L, "FF2222", 70, 7.2, "Licor de Arandanos", "Oviedo",0, "Oviedo",2, "img/Bebidas/licor-arandanos.png", "img/Bebidas/miel.jpg"));
		productoRepository.save(new Producto(7L, "FF2222", 70, 4.4, "Sidra DOP", "Oviedo",0, "Oviedo",2, "img/Bebidas/sidra-baraga.jpg", "img/Bebidas/vaso.jpeg"));
		productoRepository.save(new Producto(8L, "FF2222", 70, 7.2, "Licor de sidra dulce", "Oviedo",0, "Oviedo",2, "img/Bebidas/licor-sidra-dulce.png", "img/Bebidas/manzana.jpg"));
		
		
		/**
		 * Listado de productos PANADERIA
		 */
		productoRepository.save(new Producto(9L,"CF456d", 250, 1.2, "Pan de Escanda", "ibias", 0, "oriente", 3,"img/foto_panaderia/pan de escanda.jpg","img/foto_panaderia/escanda2.jpg"));
		productoRepository.save(new Producto(10L,"FF3435", 200, 1.2, "Pan de leña", "ibias", 0, "oriente", 3,"img/foto_panaderia/panlena.jpg", "img/foto_panaderia/lena2.jpg"));
		productoRepository.save(new Producto(11L,"CF456d", 250, 1.4, "Bregao de Ibias", "ibias", 0, "oriente", 3,"img/foto_panaderia/bregao de ibias.jpg","img/foto_panaderia/bregao3.jpg"));
		productoRepository.save(new Producto(12L,"CF456d", 250, 2.2, "Carajitos", "ibias", 0, "oriente", 3,"img/foto_panaderia/Carajitos.jpg","img/foto_panaderia/carajitos2.jpg"));
		productoRepository.save(new Producto(13L,"CF456d", 450, 2.6, "Casadiellas", "ibias", 0, "oriente", 3,"img/foto_panaderia/Casadiellasjpg.jpg","img/foto_panaderia/casadielles2.jpg"));
		productoRepository.save(new Producto(14L,"CF456d", 350, 2.6, "Carbayones", "ibias", 0, "oriente", 3,"img/foto_panaderia/Carbayones.jpg","img/foto_panaderia/carbayones2.jpg"));
		productoRepository.save(new Producto(15L,"CF456d", 250, 2.5, "Maranuelas", "ibias", 0, "oriente", 3,"img/foto_panaderia/maranueles.jpg","img/foto_panaderia/maranuelas2.jpg"));
		productoRepository.save(new Producto(16L,"CF456d", 250, 4.2, "Moscovitas", "ibias", 0, "oriente", 3,"img/foto_panaderia/moscovitas1.jpg","img/foto_panaderia/moscovitas2.jpg"));
		
		
		/**
		 * Listado de CONSERVAS
		 */
		
		productoRepository.save(new Producto(17L,"FF4510",500, 3, "Fabada", "Litoral",0, "occidente", 4, "img/conservas/fabada.jpg", "img/conservas/fabada2.jpg")); 
		productoRepository.save(new Producto(18L, "FF4511",2, 14, "Cabrito", "Litoral",0, "oriente", 4, "img/conservas/cabrito.jpg", "img/conservas/cabrito2.jpg")); 
		productoRepository.save(new Producto(19L, "FF4512",200, 4, "Paté de cabracho", "Litoral",0, "occidente", 4, "img/conservas/pate.jpg", "img/conservas/pate2.jpg"));
		productoRepository.save(new Producto(20L, "FF4513",1, 2, "Chorizo", "Litoral",0, "oriente", 4, "img/conservas/chorizo.jpg", "img/conservas/chorizocasero.jpg"));
		productoRepository.save(new Producto(21L, "FF4514",1, 4.50, "Pote asturiano", "Litoral",0, "occidente", 4, "img/conservas/pote.jpg", "img/conservas/pote2.jpg"));
		productoRepository.save(new Producto(22L, "FF4515",500, 10, "Miel", "Litoral",0, "oriente", 4, "img/conservas/miel.jpg", "img/conservas/miel2.jpg"));
		productoRepository.save(new Producto(23L, "FF4515",2, 12, "Ternera asturiana", "Litoral",0, "occidente", 4, "img/conservas/ternera.jpg", "img/conservas/ternera2.jpg"));
		productoRepository.save(new Producto(24L, "FF4516",2, 9, "Cerdo asturcelta", "Litoral",0, "oriente", 4, "img/conservas/cerdoasturcelta.jpg", "img/conservas/cerdoasturcelta2.jpg"));

		
		
		
		/**
		 * Listado de EMBUTIDOS
		 * 
		 */
		productoRepository.save(new Producto(25L, "FF5555", 4, 4, "chorizo", "ibias", 0, "centro", 5, "img/Embutidos/chorizo.jpg", "img/Embutidos/chorizo2.jpg"));
		productoRepository.save(new Producto(26L, "FF5656", 200, 3, "chosco", "tineo", 0, "occidente", 5, "img/Embutidos/chosco.jpg", "img/Embutidos/Chosco2.jpg"));
		productoRepository.save(new Producto(27L, "FF5757", 4, 4, "morcilla", "cabrales", 0, "oriente", 5, "img/Embutidos/morcilla.jpg", "img/Embutidos/morcilla2.jpg"));
		productoRepository.save(new Producto(28L, "FF5858", 4, 4.5, "chorizo jabali", "narcea", 0, "occidente", 5, "img/Embutidos/chorizo_jabali.jpg", "img/Embutidos/chorizo_jabali2.jpg"));
		productoRepository.save(new Producto(29L, "FF5959", 100, 1.6, "lacon", "oviedo", 0, "centro", 5, "img/Embutidos/lacon.jpg", "img/Embutidos/lacon2.jpg"));
		productoRepository.save(new Producto(30L, "FF6060", 100, 1.9, "cecina", "tineo", 0, "occidente", 5, "img/Embutidos/cecina.jpg", "img/Embutidos/cecina2.jpg"));
		productoRepository.save(new Producto(31L, "FF6161", 200, 3.2,"longaniza", "ibias", 0, "occidente", 5, "img/Embutidos/longaniza.jpg", "img/Embutidos/longaniza2.jpg"));
		productoRepository.save(new Producto(32L, "FF6262", 200, 3.1, "picadillo", "onis", 0, "oriente", 5, "img/Embutidos/picadillo.jpg", "img/Embutidos/picadillo2.jpg"));

		
		
		
		/**
		 * Listado de productos LEGUMBRES
		 */
		productoRepository.save(new Producto(33L,"FF1212", 1, 3.5, "Fabas de la Granja", "ibias", 0, "oriente", 1,"img/Legumbres/bol-faba.jpg", "img/Legumbres/faba-cuchara.jpg"));
		productoRepository.save(new Producto(34L,"FF2323", 1, 3.5, "Garbanzos", "Ibias", 0, "oriente", 1,"img/Legumbres/bol-garbanzo.jpg", "img/Legumbres/garbanzo-cuchara.jpg"));
		productoRepository.save(new Producto(35L, "FF3434", 1, 2.2, "Lentejas", "Cangas", 0, "Narcea", 1, "img/Legumbres/bol-lenteja.jpg", "img/Legumbres/lenteja-cuchara.jpg" ));
		productoRepository.save(new Producto(36L, "FF2222", 1, 2.2, "Alubias pintas", "Oviedo",0, "Oviedo",1, "img/Legumbres/pinta.jpg", "img/Legumbres/pinta-cuchara.jpg"));
		productoRepository.save(new Producto(37L, "FF2222", 1, 3.6, "Verdinas", "Oviedo",0, "Oviedo",1, "img/Legumbres/bol-verdina.jpg", "img/Legumbres/cuchara-verdina.jpg"));
		productoRepository.save(new Producto(38L, "FF2222", 1, 3.8, "Judías", "Oviedo",0, "Oviedo",1, "img/Legumbres/bol-judion.jpg", "img/Legumbres/cuchara-judion.jpg"));
		productoRepository.save(new Producto(39L, "FF2222", 1, 1.8, "Guisantes", "Oviedo",0, "Oviedo",1, "img/Legumbres/bol-guisantes.jpg", "img/Legumbres/cuchara-guisantes.jpg"));
		productoRepository.save(new Producto(40L, "FF2222", 1, 2.6, "Soja", "Oviedo",0, "Oviedo",1, "img/Legumbres/bol-soja.jpg", "img/Legumbres/cuchara-soja.jpg"));
		
		
		/**
		 * Listado de productos POSTRES
		 */
		productoRepository.save(new Producto(41L,"FF1212", 2 ,2.25, "Arroz con leche", "ibias", 0, "oriente", 6,"img/postres/arrozconleche.jpg", "img/postres/arrozconleche2.jpg"));
		productoRepository.save(new Producto(42L,"FF2323", 2, 2.25, "Leche Frita", "Ibias", 0, "oriente", 6,"img/postres/lechefrita.jpg", "img/postres/lechefrita2.jpg"));
		productoRepository.save(new Producto(43L, "FF3434", 2, 3.25, "Frixuelos", "Cangas", 0, "Narcea", 6, "img/postres/frixuelos.jpg", "img/postres/frixuelos2.jpg" ));
		productoRepository.save(new Producto(44L, "FF2222", 2, 3.5, "Casadielles", "Oviedo",0, "Oviedo",6, "img/postres/casadielles.jpg", "img/postres/casadielles2.jpg"));
		productoRepository.save(new Producto(45L, "FF2222", 2, 3.0, "Torrijas", "Oviedo",0, "Oviedo",6, "img/postres/torrijas.jpg", "img/postres/torrijas2.jpg"));
		productoRepository.save(new Producto(46L, "FF2222", 4, 3.0, "Borrachinos", "Oviedo",0, "Oviedo",6, "img/postres/borrachinos.jpg", "img/postres/borrachinos2.jpg"));
		productoRepository.save(new Producto(47L, "FF2222", 4, 2.3, "Buñuelos de calabaza", "Oviedo",0, "Oviedo",6, "img/postres/bunuelos.jpg", "img/postres/bunuelos2.jpg"));
		productoRepository.save(new Producto(48L, "FF2222", 4, 2.2, "Manzana asada", "Oviedo",0, "Oviedo",6, "img/postres/manzanaasada.jpg", "img/postres/manzanaasada2.jpg"));
		
		
		/**
		 * Listado de productos FRUTOS SECOS
		 */
		productoRepository.save(new Producto (49L,"FF5510",100, 2.99, "Avellanas", "La Casa",0, "occidente", 7, "img/fotos_frutosSecos/avellanas.jpg", "img/fotos_frutosSecos/avellanas2.jpg")); 
		productoRepository.save(new Producto (50L, "FF5511",150, 2.50, "Castañas", "La Castañera",0, "oriente", 7, "img/fotos_frutosSecos/castana_valduna.jpg", "img/fotos_frutosSecos/castanas2.jpg")); 
		productoRepository.save(new Producto (51L, "FF5512",120, 3.20, "Nueces", "Nueces del Nalón",0, "nalón",7, "img/fotos_frutosSecos/nueces.jpg", "img/fotos_frutosSecos/nueces2.jpg"));


		/**
		 * Listado de productos QUESOS
		 */
		
		productoRepository.save(new Producto (52L,"FF5510",250, 12.2, "Afuega'l pitu", "La Casa",0, "occidente", 8, "img/Quesos/afuegal-pitu.jpg", "img/Quesos/afuegal-pitu.jpg")); 
		productoRepository.save(new Producto (53L, "FF5511",1, 25.0, "Gamoneu", "La Castañera",0, "oriente", 8, "img/Quesos/gamoneu.jpg", "img/Quesos/gamoneu2.jpg")); 
		productoRepository.save(new Producto (54L, "FF5512",1, 18.2, "Ovin", "Nueces del Nalón",0, "nalón",8, "img/Quesos/ovin.jpg", "img/Quesos/ovin2.jpg"));
		productoRepository.save(new Producto (55L,"FF5510",1, 21.2, "Cabrales", "La Casa",0, "occidente", 8, "img/Quesos/cabrales.jpg", "img/Quesos/cabrales2.jpg")); 
		productoRepository.save(new Producto (56L, "FF5511",1, 4.50, "Casin", "La Castañera",0, "oriente", 8, "img/Quesos/casin.jpg", "img/Quesos/casin2.jpg")); 
		productoRepository.save(new Producto (57L, "FF5512",1, 7.20, "Queso Azul la Peral", "Nueces del Nalón",0, "nalón",8, "img/Quesos/queso-azul-la-peral-estrella.jpg", "img/Quesos/queso-azul-la-peral-estrella2.jpg"));
		productoRepository.save(new Producto (58L, "FF5511",1, 9.50, "Los Beyos", "La Castañera",0, "oriente", 8, "img/Quesos/queso-los-beyos-oveja.jpg", "img/Quesos/queso-los-beyos-oveja2.jpg")); 
		productoRepository.save(new Producto (59L, "FF5511",1, 7.50, "Taramundi nueces y avellanas", "La Castañera",0, "oriente", 8, "img/Quesos/taramundi-nueces-y-avellanas.jpg", "img/Quesos/taramundi-nueces-y-avellanas2.jpg")); 
		
		
		
		
		reciclajeRepository.save(new Reciclaje (1L, "vidrio", 2L, 2, 1L));
		reciclajeRepository.save(new Reciclaje (3L, "plastico", 3L, 3, 1L ));
		reciclajeRepository.save(new Reciclaje (2L, "papel", 4L, 4, 1L));

		usuarioRepository.save(new Usuario(1L, "pepe", "726292","11-11-2000", "pepe@prueba.com", "1234"));
		
		usuarioRepository.save(new Usuario(2L, "juan", "7345435","12-12-2001", "juan@prueba.com", "1234"));
		
	}

}
