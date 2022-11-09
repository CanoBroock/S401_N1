package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class HelloWorldController {

	@GetMapping("/saluda")
	public String saluda(String nom) {
		String frase = "";

		return frase = "Hola, " + nom + ". Estàs executant un projecte Gradle";
	}

	@GetMapping("/saluda2")
	public String saluda2(String nom) {
		String frase = "";

		return frase = "Hola, " + nom + ". Estàs executant un projecte Maven";
	}

}
