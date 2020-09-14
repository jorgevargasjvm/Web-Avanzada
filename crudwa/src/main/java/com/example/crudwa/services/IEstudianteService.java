package com.example.crudwa.services;

import com.example.crudwa.models.Estudiante;

import java.util.List;

public interface IEstudianteService {
	
	public void createEstudiante(Estudiante estudiante);
	
	public Estudiante getEstudiante(Long matricula);
	
	public int updateEstudiante(Estudiante estudiante);
	
	public void deleteEstudiante(Long matricula);

	public List<Estudiante> findAll();
	
}
