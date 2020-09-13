package com.example.crudwa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudwa.services.Service;



@RestController
@RequestMapping("/matricula")
public class Controller {
	
	@Autowired
	Service Service;
	
	@PostMapping
	public ResponseEntity<?> createUser(){
		return null;
	}
	
	@GetMapping("/{matricula}")
	public void getUser(@RequestParam(required=true) String matricula) {
		
	}
}
