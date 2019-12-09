package com.foodForRescue.spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.foodForRescue.spring.model.Producto;
import com.foodForRescue.spring.model.Reciclaje;
import com.foodForRescue.spring.model.Usuario;
import com.foodForRescue.spring.repository.ProductoRepository;
import com.foodForRescue.spring.repository.ReciclajeRepository;
import com.foodForRescue.spring.repository.UsuarioRepository;



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
		productoRepository.save(new Producto("cf456d", 500, 2, "panaderia", "ibias", 0, "oriente"));
		
		reciclajeRepository.save(new Reciclaje (1L, "vidrio", 2L, 2, 1L));
		reciclajeRepository.save(new Reciclaje (2L, "papel", 4L, 4, 1L));

		usuarioRepository.save(new Usuario(1L, "pepe", "726292","11-11-2000", "pepe@prueba.com", "1234"));
		
		usuarioRepository.save(new Usuario(2L, "juan", "7345435","12-12-2001", "juan@prueba.com", "1234"));
		
	}

}
