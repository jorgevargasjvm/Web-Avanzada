package com.example.crudwa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudwa.services.Service;
import com.example.crudwa.userestudiante.UserEstudiante;
import javax.Validation.Valid;

@RestController
@RequestMapping("/matricula")
public class Controller {
	
	@Autowired
	Service Service;
	
	@PostMapping
	public ResponseEntity<?> createEstudiante(@Valid @RequestBody UserEstudiante UserEstudiante){
		UserEstudiante estudianteDetails = Service.createEstudiante(UserEstudiante);
		return new ResponseEntity<>(estudianteDetails,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{matricula}")
	public ResponseEntity<?> getUser(@PathVariable(required=true) Long matricula) {
		
		UserEstudiante estudianteDetails = Service.getEstudiante(matricula);
		return new ResponseEntity<>(estudianteDetails,HttpStatus.OK);
	}
}
