package co.edu.javeriana.thymeleaf.prueba.plantillas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.edu.javeriana.thymeleaf.prueba.modelo.Pipol;
import co.edu.javeriana.thymeleaf.prueba.modelo.PipolRepositroy;


@Controller
@RequestMapping("/plantillas")
public class LosPipolPlantilla {


	@Autowired
	private PipolRepositroy pipolRepositroy;

	@GetMapping("/lista-pipol")
	 public String laListaPipol( Model model ) {
		//  Iterable<Pipol> pipols = pipolRepositroy.findAll();
		List<Pipol> pipols = new ArrayList<Pipol>();
		pipols.add(new Pipol((long) 1, "Pablo", "Márquez", "80"));
		pipols.add(new Pipol((long) 2, "María", "Pacheco", "50"));
		pipols.add(new Pipol((long) 3, "Francisco", "Márquez", "1000"));
		pipols.add(new Pipol((long) 4, "Miguel", "Márquez", "1001"));
		model.addAttribute("pipols", pipols);
		return "lista-pipol";
	 }



	 @GetMapping("/los-pipol-template-model-and-view")
     public ModelAndView losPipolTemplateModelAndView() {
         return new ModelAndView("los-pipol-template-model-and-view");
     }

	 @GetMapping("/los-pipol-solo-texto")
	 public String losPipolSoloTexto() {
		 return "los-pipol-solo-texto";
	 }

	 @GetMapping("/los-pipol/{id}")
	 public String losPipolSoloTextoParametro( @PathVariable Long id ) {
		System.out.println( id );
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
	 
	 
	 

}
