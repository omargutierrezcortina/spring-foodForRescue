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
import com.foodForRescue.spring.model.TiposCategoria;
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
	 * 
	 * @param session
	 * @return
	 */
	@GetMapping("/categoria/{id}")
	public ModelAndView irACategoria(@PathVariable int id, HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			ModelAndView login = new ModelAndView();
			login.setViewName("Login");
			return login;

		} 
		// Buscamos la categoria
		TiposCategoria tipo = null;
		for (TiposCategoria tc : TiposCategoria.values()) {
			if (tc.getId() == id) {
				tipo = tc;
			}
		}  
		ModelAndView mav = new ModelAndView();
		if (tipo != null) {
			log.debug("request to get Bebidas");

			mav.setViewName("categoria");
			Categoria categoria = new Categoria();
			categoria.setTitulo(tipo.getValue());
			categoria.setImagen(tipo.getImagen());
			categoria.setProductos(productoRepository.findByCategoria(tipo.getId()));
			mav.addObject("categoria", categoria);
		} else {
			mav.setViewName("principal");
		}
		return mav;

	}

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
	@GetMapping("/carrito/{id}")
	public String saveProduct(@PathVariable Long id, HttpSession session) {
		if (!UserUtil.usuarioEnSesion(session)) {
			return "redirect:/login";
		} 
		log.debug("request to save Product : {}", id);
		Optional<Producto> productoOpt = productoRepository.findById(id);
		Producto producto = productoOpt.get();
		List<Producto> cesta = (List<Producto>) session.getAttribute("cesta");
		if (cesta == null) {
			cesta = new ArrayList<>();
		}
		// El producto ya existe y tenemos que actualizarlo
		Optional<Producto> existingProductoWrap = productoRepository.findById(producto.getId());
		if (existingProductoWrap.isPresent()) {
			anadirProductoACesta(producto, cesta);
			session.setAttribute("cesta", cesta);
		}
 
		// Buscamos la ruta del producto
		int idCategoria = 0;
		for (TiposCategoria e : TiposCategoria.values()) {
			if (e.getId() == producto.getIdCategoria()) {
				idCategoria = e.getId();
			}
		}

		return "redirect:/categoria/" + idCategoria;
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
			calcularPrecioCompra(reciclaje, cesta, compra);
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

}
