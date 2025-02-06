package co.edu.javeriana.thymeleaf.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.javeriana.thymeleaf.prueba.modelo.Pipol;
import co.edu.javeriana.thymeleaf.prueba.modelo.PipolRepositroy;

@Controller
@RequestMapping("/controllers")
public class FormularioLosPipol {


	@Autowired
	private PipolRepositroy pipolRepositroy;

	@PostMapping("/imprimir-un-pipol")
	public String imprimirDatos( Model model, @RequestParam String nombreSextoPipol, @RequestParam String apellidoSextoPipol, @RequestParam String documentoSextoPipol ) {
		System.out.println(  nombreSextoPipol );


		pipolRepositroy.save( new Pipol(null, nombreSextoPipol, apellidoSextoPipol, documentoSextoPipol)  );
		Iterable<Pipol> pipols = pipolRepositroy.findAll();


		model.addAttribute("pipols", pipols);
		return "lista-pipol";
	}
}
