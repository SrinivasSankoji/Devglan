package com.howtodoinjava.example.student.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.example.student.model.Student;

@RestController
public class StudentController {

	@GetMapping("/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name) 
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
 
	@GetMapping("/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name) 
    {
        return new Student(name, "Pune", "MCA");
    }
}
