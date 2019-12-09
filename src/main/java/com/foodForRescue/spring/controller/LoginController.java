package com.foodForRescue.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodForRescue.spring.model.Producto;
import com.foodForRescue.spring.model.Usuario;
import com.foodForRescue.spring.repository.UsuarioRepository;

@Controller
public class LoginController {

	private final Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/")
	public ModelAndView entrada() {
		log.debug("request to empty login form");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Login");
		mav.addObject("usuario", new Usuario());
		return mav;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		log.debug("request to empty login form");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Login");
		mav.addObject("usuario", new Usuario());
		return mav;
	}

	@GetMapping("/loginError")
	public ModelAndView loginError() {
		log.debug("request to empty login form");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Login");
		mav.addObject("usuario", new Usuario());
		mav.addObject("aviso", "Datos no válidos");
		return mav;
	}
	
	@PostMapping("/login")
	public String doLogin(@ModelAttribute("usuario") Usuario usuario, HttpSession session) {

		// Comprobamos si debemos navegar a la vista principal
		return getLogin(usuario, session);
	}

	private String getLogin(Usuario usuario, HttpSession session) {

		Usuario user = null;
		// Buscamos el usuario en la sesion por si ya estabamos logados
		user = (Usuario) session.getAttribute("user");

		// Buscamos con los datos del formulario
		if (usuario.getEmail() != null || usuario.getPassword() != null && user == null) {
			user = usuarioRepository.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
		}
		// Estamos logados
		if (user != null) {

			// Falta buscar datos iniciales
			// UserUtil.cargarDatosIniciales(request);
			session.setAttribute("user", user);
			return "redirect:/principal";
		} else {
			
			return "redirect:/loginError";

		}

	}

	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		session.removeAttribute("user");
		session.invalidate();
		log.debug("request to empty login form");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Login");
		mav.addObject("usuario", new Usuario());
		return mav;
	}
}
