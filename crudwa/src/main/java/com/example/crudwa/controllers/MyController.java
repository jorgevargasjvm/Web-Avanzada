package com.example.crudwa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.crudwa.models.Estudiante;
import com.example.crudwa.services.EstudianteService;

@Controller
public class MyController {
	
	@Autowired
	EstudianteService service;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("estudiantes", service.findAll());
		return "index";
	}
	
	@PostMapping("/create")
	public String create(Model model, @ModelAttribute("estudiante") Estudiante estudiante) {
		service.createEstudiante(estudiante);
		return "redirect:/";
	}
	
}
