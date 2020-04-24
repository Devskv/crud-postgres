package com.postgres.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.demo.entity.Student;
import com.postgres.demo.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class CrudController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/all")
	private List<Student> getrecords() {
	return   studentRepository.findAll();
	}

}
