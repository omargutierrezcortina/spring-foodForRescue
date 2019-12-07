package com.foodForRescue.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodForRescue.spring.model.Producto;
import com.foodForRescue.spring.model.Usuario;
import com.foodForRescue.spring.repository.ProductoRepository;
import com.foodForRescue.spring.repository.ReciclajeRepository;

@Controller
public class ProductController {

	private final Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductoRepository productoRepository;

	@Autowired
	private ReciclajeRepository reciclajeRepository;

	/**
	 * Punto de entrada a la aplicacion, con poner la URL donde escucha nuestra
	 * aplicacion entrará aquí y desde aquí redireccionamos al método para obtener
	 * todos los productos y cargar el listado
	 * 
	 * @return
	 */

	@GetMapping("/productos")
	public ModelAndView getAllProductos() {
		log.debug("request to get Productos");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("producto-list");
		mav.addObject("productos", productoRepository.findAll());
		return mav;
	}

	@GetMapping("/productos/empty")
	public ModelAndView createProducto() {
		log.debug("request to empty producto form");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("producto-edit");
		mav.addObject("producto", new Producto());
		return mav;
	}

	/**
	 * GET /products/:id : get the "id" product.
	 *
	 * @param id the id of the product to retrieve
	 * @return
	 */
	@GetMapping("/productos/{id}")
	public ModelAndView getProducto(@PathVariable Long id, HttpSession session) {
		log.debug("request to get Product : {}", id);
		Optional<Producto> producto = productoRepository.findById(id);

		List<Producto> cesta = (List<Producto>) session.getAttribute("cesta");
		if (cesta == null) {
			cesta = new ArrayList<>();
		}
		ModelAndView mav = new ModelAndView();
		if (producto.isPresent()) {
			//cesta = cesta.get();
			
			mav.setViewName("producto-list");
			//cesta.add((Producto)producto);
			session.setAttribute("cesta", cesta);
			mav.addObject("numProductos", cesta.size());
			mav.addObject("productos", productoRepository.findAll());
			Usuario usuario = (Usuario) session.getAttribute("user");
			mav.addObject("reciclajes", reciclajeRepository.findByUsuario(usuario.getId()));
		} else {
			mav.setViewName("producto-list");
			mav.addObject("message", "Producto no encontrado");
		}

		return mav;
	}

	/**
	 * GET /products/:id : get the "id" product.
	 *
	 * @param id the id of the product to retrieve
	 * @return
	 */
	@PostMapping("/productos")
	public String saveProduct(@ModelAttribute("producto") Producto producto) {
		log.debug("request to save Product : {}", producto);

		// El producto no existe y tenemos que crearlo
		if (producto.getId() == null) {
			productoRepository.save(producto);
			return "redirect:/productos";
		}

		// El producto ya existe y tenemos que actualizarlo
		Optional<Producto> existingProductoWrap = productoRepository.findById(producto.getId());
		if (existingProductoWrap.isPresent()) {
			Producto existingProducto = existingProductoWrap.get();
			existingProducto.setReferencia(producto.getReferencia());
			existingProducto.setPrecio(producto.getPrecio());
			existingProducto.setPeso(producto.getPeso());
			existingProducto.setCategoria(producto.getCategoria());
			existingProducto.setFabricante(producto.getFabricante());
			existingProducto.setDescuento(producto.getDescuento());
			existingProducto.setDenominacion(producto.getDenominacion());

			/*
			 * approach 2: En caso de no utilizar cascade = {CascadeType.ALL} entre Product
			 * y ProductSize será necesario descomentar la siguiente linea para guardar
			 * manualmente
			 */
//			productSizeRepository.save(existingProducto.getProductoSize());
			productoRepository.save(existingProducto);
		}
		return "redirect:/productos";
	}

	/**
	 * /products/:id/delete : delete the "id" product.
	 *
	 * @param id the id of the product to delete
	 * @return
	 */
	@GetMapping("/productos/{id}/delete")
	public String deleteProducto(@PathVariable Long id) {
		log.debug("request to delete Producto : {}", id);
		productoRepository.deleteById(id);
		return "redirect:/productos";
	}

	@GetMapping("/compra")
	public ModelAndView compra(HttpSession session) {
	
		List<Producto> cesta = (List<Producto>) session.getAttribute("cesta");
		if (cesta == null) {
			cesta = new ArrayList<>();
		}
		ModelAndView mav = new ModelAndView();
		
			mav.setViewName("compra");
		
			session.setAttribute("cesta", cesta);
			mav.addObject("numProductos", cesta.size());
			mav.addObject("productos", cesta);
			Usuario usuario = (Usuario) session.getAttribute("user");
			mav.addObject("reciclajes", reciclajeRepository.findByUsuario(usuario.getId()));

		   return mav; 
	}
	
	
}
