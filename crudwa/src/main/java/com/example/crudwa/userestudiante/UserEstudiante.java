package com.example.crudwa.userestudiante;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;


@Entity
@Table(name="Estudiante")
public class UserEstudiante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long matricula;
	
	@Column(name="Nombre")
	//@NotBlank(message = "Se requiere un nombre valido")
	private String nombre;
	
	@Column(name="Telefono")
	private String telefono;
	
	public Long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
