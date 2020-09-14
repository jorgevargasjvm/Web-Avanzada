package com.example.crudwa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudwa.models.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
