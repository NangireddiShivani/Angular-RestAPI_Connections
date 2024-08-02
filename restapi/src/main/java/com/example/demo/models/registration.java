package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

@NoArgsConstructor
//generate getters setters above the table
@Entity
//create table by giving entity


public class registration {
	@Id
//	creating starting point
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	@Email
	@Size(max =30, min=10)
   
	private String email;
	
	private String password;
//	creating columns names for table
//	model name we have to take small letters only

}
