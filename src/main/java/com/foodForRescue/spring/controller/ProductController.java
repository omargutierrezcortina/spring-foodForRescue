package com.foodForRescue.spring.controller;

import java.util.Optional;

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
import com.foodForRescue.spring.repository.ProductoRepository;


@Controller
public class ProductController {

	private final Logger log = LoggerFactory.getLogger(ProductController.class);


	@Autowired
	private ProductoRepository productoRepository;


	
	/**
	 * Punto de entrada a la aplicacion, con poner la URL donde escucha nuestra
	 * aplicacion entrará aquí y desde aquí redireccionamos al método para obtener
	 * todos los productos y cargar el listado
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String root() {
		return "redirect:/productos";
	}

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
	public ModelAndView getProducto(@PathVariable Long id) {
		log.debug("request to get Product : {}", id);
		Optional<Producto> producto = productoRepository.findById(id);

		ModelAndView mav = new ModelAndView();
		if (producto.isPresent()) {
			mav.setViewName("producto-edit");
			mav.addObject("producto", producto.get());
			mav.addObject("producto2", producto.get());
		} else {
			mav.setViewName("products-list");
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
	@PostMapping("/products")
	public String saveProduct(@ModelAttribute("product") Producto product) {
		log.debug("request to save Product : {}", product);

		// El producto no existe y tenemos que crearlo
		if (product.getId() == null) {
			productoRepository.save(product);
			return "redirect:/products";
		}

		// El producto ya existe y tenemos que actualizarlo
		Optional<Producto> existingProductWrap = productoRepository.findById(product.getId());
		if (existingProductWrap.isPresent()) {
			Producto existingProduct = existingProductWrap.get();
			existingProduct.setReferencia(product.getReferencia());
			existingProduct.setPrecio(product.getPrecio());
			existingProduct.setPeso(product.getPeso());
			existingProduct.setCategoria(product.getCategoria());
			existingProduct.setFabricante(product.getFabricante());
			existingProduct.setDescuento(product.getDescuento());
			existingProduct.setDenominacion(product.getDenominacion());

			/*approach 2: En caso de no utilizar cascade = {CascadeType.ALL} entre Product y ProductSize será necesario 
			 * descomentar la siguiente linea para guardar manualmente*/
//			productSizeRepository.save(existingProduct.getProductSize());
			productoRepository.save(existingProduct);
		}
		return "redirect:/products";
	}

	/**
	 * /products/:id/delete : delete the "id" product.
	 *
	 * @param id the id of the product to delete
	 * @return
	 */
	@GetMapping("/products/{id}/delete")
	public String deleteProduct(@PathVariable Long id) {
		log.debug("request to delete Product : {}", id);
		productoRepository.deleteById(id);
		return "redirect:/products" ;
	}
	

}
