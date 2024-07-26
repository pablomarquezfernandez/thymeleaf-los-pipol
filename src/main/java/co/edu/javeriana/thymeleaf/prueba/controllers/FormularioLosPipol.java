package co.edu.javeriana.thymeleaf.prueba.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

	@PostMapping("/imprimir-un-pipol/{numeroDocumento}")
	public String imprimirDatos( Model model, @RequestParam String nombreSextoPipol, @PathVariable String numeroDocumento ) {
		pipolRepositroy.save( new Pipol(null, nombreSextoPipol, "Apellido", numeroDocumento)  );
		Iterable<Pipol> pipols = pipolRepositroy.findAll();

		model.addAttribute("pipols", pipols);
		return "lista-pipol";
	}
}
