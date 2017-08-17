package com.chaocharliehuang.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chaocharliehuang.dojosandninjas.models.Dojo;
import com.chaocharliehuang.dojosandninjas.repositories.*;

@Service
public class DojoService {
	
	private DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public List<Dojo> getAllDojos() {
		return (List<Dojo>) dojoRepository.findAll();
	}
	
	public void addDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	public Dojo findDojoById(Long id) {
		return dojoRepository.findOne(id);
	}
}
