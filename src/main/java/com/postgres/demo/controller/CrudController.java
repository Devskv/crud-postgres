package com.postgres.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/find/{id}")
	private Optional<Student> getById(@PathVariable("id")  Integer id) {
	return   studentRepository.findById(id);
	}
	
	
	@GetMapping("/r")
	private String test() {
	return   "test...";
	}

}
