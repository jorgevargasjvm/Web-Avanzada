package com.example.crudwa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudwa.userestudiante.UserEstudiante;

public interface Repository extends JpaRepository<UserEstudiante, Long> {
	
	

}
