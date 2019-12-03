package com.foodForRescue.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.foodForRescue.spring.model.Producto;
import com.foodForRescue.spring.repository.ProductoRepository;



@SpringBootApplication
public class SpringFoodForRescueApplication implements CommandLineRunner {

	
	@Autowired
	private ProductoRepository repository; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringFoodForRescueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Producto("cf456d", 500, 2, "panaderia", "ibias", 0, "oriente")); 

	}

}
