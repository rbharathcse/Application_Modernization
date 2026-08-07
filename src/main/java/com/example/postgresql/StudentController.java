package com.example.postgresql;

import java.awt.List;
import java.lang.reflect.Constructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
private StudentRepository studentRepo;
  public StudentController(StudentRepository studentRepo) {
	  this.studentRepo = studentRepo;
  }
  
  @GetMapping("/get")
  public java.util.List<Student> getAll(){
	  return studentRepo.findAll();
  }
}
