package com.bolsadeideas.springboot.form.app.domain;

import javax.validation.constraints.NotEmpty;

public class Usuario {

	private String identificador;
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellidos;
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	private String email;
	
	

	//CONSTRUCTORES
	
	public Usuario() {
	
	}

	public Usuario(@NotEmpty String nombre, @NotEmpty String apellidos, @NotEmpty String username,
			@NotEmpty String password, @NotEmpty String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	//GETTERS Y SETTERS
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	
	
	
}
