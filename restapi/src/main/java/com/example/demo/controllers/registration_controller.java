package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.registration;
import com.example.demo.services.registration_services;
//@RestController
//send data into postman
@Controller("/")
@CrossOrigin("http://localhost:4200")
//send to angular-fronend and backend connection
@RequestMapping("/api/v1")


public class registration_controller {
	@Autowired
	
	registration_services ser;
	@PostMapping("/add")
  public registration addingsingledata( @RequestBody registration reg) {
		return ser.addingsingledata(reg);
	}
	@PostMapping("/addmul")
	public Iterable<registration> addingmultipledata( @RequestBody List<registration> reg) {
		return ser.addingmultipledata(reg);
	}
	@GetMapping("/findall")
	public List<registration> fetchalldata(){
		return ser.fetchalldata();
	}
	@GetMapping("findbyid/{id}")

	public Optional<registration> multipledaatfetch( @PathVariable int id) {
		return ser.singledatafetch(id);
	}
	@DeleteMapping("/deletebyid/{id}")
	public  String registration ( @PathVariable int id) {
		return ser.delete(id);
		
	}
	@GetMapping("/findbyemail/{email}")
	public registration fetchbyemail( @PathVariable String email) {
		return ser.fetchbyemail(email);
//		data does not contains duplicate  email values if it have we use getallbyemail
		
		
	}
	@PutMapping("/update")
	public registration update( @RequestBody registration reg) {
		return ser.updatedata(reg);
		
	}
		

	
	

}
