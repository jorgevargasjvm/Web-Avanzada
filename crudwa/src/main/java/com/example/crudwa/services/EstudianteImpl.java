package com.example.crudwa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;

import com.example.crudwa.userestudiante.UserEstudiante;

public class EstudianteImpl implements Service{

	@Autowired
	private Repository Repository;
	@Override
	public UserEstudiante createEstudiante(UserEstudiante userEstudiante) {
		UserEstudiante user = Repository
		return null;
	}

	@Override
	public UserEstudiante getEstudiante(Long matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEstudiante(UserEstudiante userEstudiante) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteEstudiante(Long matricula) {
		// TODO Auto-generated method stub
		
	}

}
