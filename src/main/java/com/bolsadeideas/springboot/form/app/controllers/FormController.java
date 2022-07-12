package com.bolsadeideas.springboot.form.app.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bolsadeideas.springboot.form.app.domain.Usuario;

@Controller
@SessionAttributes("usuario") //Para mantener los datos aunque no los envíe por el form (como el identificador)
public class FormController {

	
	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
	model.addAttribute("titulo","Formulario envío de usuarios");
	usuario.setNombre("Jose");
	usuario.setApellidos("Jemez");
	usuario.setIdentificador("45454654Y");
	model.addAttribute("usuario", usuario);
		return "form";
	}

	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario,BindingResult result,Model model) {
			
		model.addAttribute("titulo", "Resultado del envío");
	
		if(result.hasErrors()) {

			/*	NO HACE FALTA YA QUE TIMELEAF LO MANEJA DESDE LA VISTA	
		Map<String, String>errores = new HashMap<>();
		result.getFieldErrors().forEach(err->{ //obtenemos la lista de errores y la recorremos
			//personalizamos el error obteniendo el nombre de la fila que ha fallado y personalizamos el mensaje
			errores.put(err.getField(),"El campo ".concat(err.getField().concat(" ").concat(err.getDefaultMessage())));
		});
		
		//enviamos el error para mostrarlo por pantalla
		model.addAttribute("error", errores);   */

		return "form";
		}
	

	
	model.addAttribute("usuario", usuario);

		return "resultado";
	}}