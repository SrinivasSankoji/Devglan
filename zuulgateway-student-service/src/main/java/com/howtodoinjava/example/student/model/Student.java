package com.howtodoinjava.example.student.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String name;
    String address;
    String cls;
}
