package co.edu.javeriana.thymeleaf.prueba.plantillas;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/plantillas")
public class LosPipolPlantilla {

	 @GetMapping("/los-pipol-template-model-and-view")
     public ModelAndView losPipolTemplateModelAndView() {
         return new ModelAndView("los-pipol-template-model-and-view");
     }

	 @GetMapping("/los-pipol-solo-texto")
	 public String losPipolSoloTexto() {
		 return "los-pipol-solo-texto";
	 }
	 
	 
	 @GetMapping("/los-pipol-paso-parametro")
	 public ModelAndView losPipolPasoParametro() {
		 ModelAndView  modelAndView = new ModelAndView("/los-pipol-solo-parametros");
		 modelAndView.addObject("pipol1", "Pablo");
		 modelAndView.addObject("pipol2", "María");
		 modelAndView.addObject("pipol3", "Franciso");
		 modelAndView.addObject("pipol4", "Miguel");
		 modelAndView.addObject("pipol5", "Esther");
		 
		 return modelAndView;
	 }
	 
	 
	 @GetMapping("/lista-pipol")
	 public String laListaPipol( Model model ) {
		 Collection<String> pipols = new ArrayList<String>();
		 pipols.add("Pablo");
		 pipols.add("María");
		 pipols.add("Franciso");
		 pipols.add("Miguel");
		 pipols.add("Esther");
		 
		 model.addAttribute("pipols", pipols);
		 return "lista-pipol";
	 }

}
