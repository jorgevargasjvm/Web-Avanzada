package com.example.crudwa.services;

import com.example.crudwa.userestudiante.UserEstudiante;

public interface Service {
	
	public UserEstudiante createEstudiante(UserEstudiante userEstudiante);
	
	public UserEstudiante getEstudiante(Long matricula);
	
	public int updateEstudiante(UserEstudiante userEstudiante);
	
	public void deleteEstudiante(Long matricula);
	
}
