package com.example.crudwa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable("id") Long id) {
		service.deleteEstudiante(id);
		return "redirect:/";
	}
	
}
