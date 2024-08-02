package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.registration;
import com.example.demo.repository.registration_repository;

@Service

public class registration_services {
	
	@Autowired
//	connection bw layers
	registration_repository repo;
	public registration addingsingledata(registration reg) {
		return repo.save(reg);
	}
//	creating method
//	save-to send single data
	public Iterable<registration> addingmultipledata(List<registration> reg ) {
		return repo.saveAll(reg);
	}
//	saveall-to send multipledata
//	list-take from java.utile package
//	iterable<modelname>-to say iterations
//	list used for inserting or fetching multiple data
	public List<registration> fetchalldata(){
		return (List<registration>) repo.findAll();
		
	}
	public Optional<registration> singledatafetch(int id) {
		return repo.findById(id);
	}
	public String delete(int id) {
		repo.deleteById(id);
		return "successfully deleted" + id ;
	}
	public registration fetchbyemail (String email) {
		return repo.findByEmail(email);
	}
	public registration updatedata(registration reg) {
		int id=reg.getId();
		registration regi=repo.findById(id).get();
//		fetching
		regi.setEmail(reg.getEmail());
		regi.setName(reg.getName());
		regi.setPassword(reg.getPassword());
//		update
		return repo.save(regi);
//		posting
		
	}
		
	
	
	
	}
