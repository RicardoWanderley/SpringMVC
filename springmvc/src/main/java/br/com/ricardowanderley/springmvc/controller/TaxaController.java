package br.com.ricardowanderley.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//encontrar o Taxa.jsp
@Controller
public class TaxaController {

	@GetMapping(value = "/")
	public ModelAndView exibirHome() {
		return new ModelAndView("Taxa");
	}

}
