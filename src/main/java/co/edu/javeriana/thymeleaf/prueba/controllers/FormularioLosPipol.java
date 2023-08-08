package co.edu.javeriana.thymeleaf.prueba.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controllers")
public class FormularioLosPipol {

	@PostMapping("/imprimir-un-pipol")
	public String imprimirDatos( Model model, @RequestParam String nombreSextoPipol ) {
		 Collection<String> pipols = new ArrayList<String>();
		 pipols.add("Pablo");
		 pipols.add("María");
		 pipols.add("Franciso");
		 pipols.add("Miguel");
		 pipols.add("Esther");
		 pipols.add(nombreSextoPipol);
		 
		 model.addAttribute("pipols", pipols);
		 return "lista-pipol";
	}
}
