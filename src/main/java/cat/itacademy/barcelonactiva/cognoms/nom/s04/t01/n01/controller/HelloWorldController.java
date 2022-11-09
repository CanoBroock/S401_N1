package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	public String saluda(String nom) {
		String frase = "";

		return frase = "Hola, " + nom + ". Estàs executant un projecte Gradle";
	}

	public String saluda2(String nom) {
		String frase = "";

		return frase = "Hola, " + nom + ". Estàs executant un projecte Gradle";
	}

}
