package com.bolsadeideas.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bolsadeideas.springboot.form.app.domain.Usuario;

@Controller
public class FormController {

	
	@GetMapping("/form")
	public String form(Model model) {
	model.addAttribute("titulo","Formulario envío de usuarios");
		return "form";
	}

	
	@PostMapping("/form")
	public String procesar(Model model,
			@RequestParam(name="username") String username,
			@RequestParam(name="email")String email,
			@RequestParam(name="password")String password) {
			
	Usuario usuario1 = new Usuario();
	usuario1.setEmail(email);
	usuario1.setUsername(username);
	usuario1.setPassword(password);
	
	model.addAttribute("titulo", "Resultado del envío");
	
	model.addAttribute("usuario1", usuario1);

		return "resultado";
	}
}