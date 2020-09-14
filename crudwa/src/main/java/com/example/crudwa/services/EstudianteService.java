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
		return repository.getOne(matricula);
	}

	@Override
	public void updateEstudiante(Estudiante estudiante) {
		repository.save(estudiante);
	}

	@Override
	public void deleteEstudiante(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Estudiante> findAll() {
		return repository.findAll();
	}
    
    
}
