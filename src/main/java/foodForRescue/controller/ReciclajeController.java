package foodForRescue.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import foodForRescue.model.Reciclaje;
import foodForRescue.model.TipoReciclaje;
import foodForRescue.model.Usuario;
import foodForRescue.repository.ReciclajeRepository;

@Controller
public class ReciclajeController {

	private final Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ReciclajeRepository reciclajeRepository;	
	
	public String root() {
		return "redirect:/reciclajes";
	}

	@GetMapping("/reciclajes")
	public ModelAndView getAllreciclajes(HttpSession session) {
		log.debug("request to get reciclajes");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("reciclaje-list");
		Usuario usuario = (Usuario)session.getAttribute("user");
		mav.addObject("reciclajes", reciclajeRepository.findByUsuario(usuario.getId()));
		return mav;
	}

	@GetMapping("/reciclajes/empty")
	public ModelAndView createreciclaje() {
		log.debug("request to empty reciclaje form");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("reciclaje-edit");		
        mav.addObject("tipos", TipoReciclaje.values());
		mav.addObject("reciclaje", new Reciclaje());
		return mav;
	}
	
	
	@PostMapping("/crearReciclaje")
	public String crearReciclaje(@ModelAttribute("reciclaje") Reciclaje reciclaje, HttpSession session) {	
	
		Usuario usuario = (Usuario) session.getAttribute("user");
		reciclaje.setId_usuario(usuario.getId());
		reciclaje.setDescuento(Long.valueOf(reciclaje.getPeso()));
		reciclajeRepository.save(reciclaje);
		
		return "redirect:/reciclajes";
	}
	
}
