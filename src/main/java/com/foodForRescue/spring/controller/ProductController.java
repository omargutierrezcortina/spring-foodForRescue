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

import com.foodForRescue.spring.model.Categoria;
import com.foodForRescue.spring.model.Compra;
import com.foodForRescue.spring.model.Producto;
import com.foodForRescue.spring.model.Reciclaje;
import com.foodForRescue.spring.model.Usuario;
import com.foodForRescue.spring.repository.ProductoRepository;
import com.foodForRescue.spring.repository.ReciclajeRepository;
import com.foodForRescue.spring.util.UserUtil;

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
	public ModelAndView getAllProductos(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Productos");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("producto-list");
		mav.addObject("productos", productoRepository.findAll());
		return mav;
	}

	@GetMapping("/principal")
	public ModelAndView getPrincipal(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Productos");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("principal");
		return mav;
	}

	@GetMapping("/principal/finCompra")
	public ModelAndView getPrincipalFinCompra(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Productos");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("principal");
		mav.addObject("mensaje", "Su compra ha finalizado con éxito");
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
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Product : {}", id);
		Optional<Producto> producto = productoRepository.findById(id);

		List<Producto> cesta = (List<Producto>) session.getAttribute("cesta");
		if (cesta == null) {
			cesta = new ArrayList<>();
		}
		ModelAndView mav = new ModelAndView();
		if (producto.isPresent()) {
			mav.setViewName("producto-list");
			anadirProductoACesta(producto.get(), cesta);
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param session
	 * @return
	 */
	
	
	@GetMapping("/bebidas")
	public ModelAndView getByIdBebidas(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Bebidas");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("bebidas");
		mav.addObject("bebidas", productoRepository.findByCategoria(String.valueOf(Categoria.BEBIDAS.getId())));
		return mav;
	}
	
	@GetMapping("/legumbres")
	public ModelAndView getByIdLegumbres(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Legumbres");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("legumbres");
		mav.addObject("legumbres", productoRepository.findByCategoria(String.valueOf(Categoria.LEGUMBRES.getId())));
		return mav;
	}
	
	@GetMapping("/panaderia")
	public ModelAndView getByIdPanaderia(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Panaderia");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("panaderia");
		mav.addObject("panaderia", productoRepository.findByCategoria(String.valueOf(Categoria.PANADERIA.getId())));
		return mav;
	}
	
	@GetMapping("/conservas")
	public ModelAndView getByIdConservas(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Conservas");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("conservas");
	//	mav.addObject("conservas", productoRepository.findByCategoria());
		return mav;
	}
	
	
	@GetMapping("/postres")
	public ModelAndView getByIdPostres(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Postres");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("postres");
		//mav.addObject("postres", productoRepository.findByCategoria());
		return mav;
	}
	

	@GetMapping("/quesos")
	public ModelAndView getByIdQuesos(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Quesos");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("quesos");
		//mav.addObject("quesos", productoRepository.findByCategoria());
		return mav;
	}
	
	@GetMapping("/embutidos")
	public ModelAndView getByIdEmbutidos(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get Embutidos");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("embutidos");
		//mav.addObject("embutidos", productoRepository.findByCategoria());
		return mav;
	}
	
	@GetMapping("/frutosSecos")
	public ModelAndView getByIdFrutosSecos(HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;
		}
		log.debug("request to get FrutosSecos");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("frutosSecos");
		//mav.addObject("frutosSecos", productoRepository.findByCategoria());
		return mav;
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	/**
	 * Busca el rpoducto en la cesta y si existe suma una unidad, en caso contrario
	 * introduce el producto en la cesta
	 * 
	 * @param producto
	 * @param cesta
	 */
	private void anadirProductoACesta(Producto producto, List<Producto> cesta) {

		boolean existeEnCEsta = false;
		for (Producto produCesta : cesta) {

			if (produCesta.getId().equals(producto.getId())) {
				existeEnCEsta = true;
				produCesta.setCantidad(produCesta.getCantidad() + 1);
			}
		}

		if (!existeEnCEsta) {
			producto.setCantidad(1);
			cesta.add(producto);
		}

	}

	/**
	 * GET /products/:id : get the "id" product.
	 *
	 * @param id the id of the product to retrieve
	 * @return
	 */
	@PostMapping("/productos")
	public String saveProduct(@ModelAttribute("producto") Producto producto,HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			return "redirect:/login";
		}
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

		Compra compra = new Compra();
		compra.setProductos(cesta);
		mav.addObject("compra", compra);
		mav.addObject("productos", cesta);
		Usuario usuario = (Usuario) session.getAttribute("user");
		mav.addObject("reciclajes", reciclajeRepository.findByUsuario(usuario.getId()));

		return mav;
	}

	@PostMapping("/aplicarDescuento")
	public ModelAndView aplicarDescuento(@ModelAttribute("compra") Compra compra, HttpSession session) {
		Reciclaje reciclaje = compra.getReciclaje();

		List<Producto> cesta = (List<Producto>) session.getAttribute("cesta");
		if (cesta == null) {
			cesta = new ArrayList<>();
		}

		ModelAndView mav = new ModelAndView();
		if (reciclaje != null) {
			mav.setViewName("descuento");
			
			// Calcular el descuento a la compra
			calcularPrecioCompra(reciclaje, cesta,compra);
			mav.addObject("productos", cesta);
			mav.addObject("compra", compra);
		} else {
			mav.setViewName("descuento");
			
			// No se aplicaria descuento
			calcularPrecioCompra(null, cesta, compra);
			mav.addObject("productos", cesta);
			mav.addObject("compra", compra);
		}

		return mav;

	}

	private double calcularPrecioCompra(Reciclaje reciclaje, List<Producto> cesta, Compra compra) {
		double precio = 0L;

		for (Producto productoEncesta : cesta) {
			precio += (productoEncesta.getPrecio() * productoEncesta.getCantidad());
		}

		compra.setPrecio(precio);
		
		// Si existe reciclaje aplicamos el descuento
		if (reciclaje != null) {
			double descuento = (precio * reciclaje.getDescuento()) / 100L;
			compra.setPrecioConDescuento(precio - descuento);
		}

		return precio;
	}
	
	
	private int calcularNumeroProductos(List<Producto> cesta, Compra compra) {
		int numero = 0;

		for (Producto productoEncesta : cesta) {
			numero = numero +  productoEncesta.getCantidad();
		}

		return numero;
	}
	
	

}
