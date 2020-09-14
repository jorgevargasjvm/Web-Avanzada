package com.example.crudwa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudwa.models.Estudiante;
import com.example.crudwa.repositories.EstudianteRepository;

@Service
public class EstudianteService implements IEstudianteService {
	
    @Autowired
    EstudianteRepository repository;

	@Override
	public void createEstudiante(Estudiante estudiante) {
		repository.save(estudiante);
	}

	@Override
	public Estudiante getEstudiante(Long matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteEstudiante(Long matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Estudiante> findAll() {
		return repository.findAll();
	}
    
    
}
