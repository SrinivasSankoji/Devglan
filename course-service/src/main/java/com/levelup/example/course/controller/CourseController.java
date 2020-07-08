package com.levelup.example.course.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.levelup.example.course.model.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Course> getCourses(){
		
		Course course1 = new Course("1", "Introduction to REST");
		Course course2 = new Course("1", "Introduction to Microservices");
		
		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		
		return courses;
	}
}
