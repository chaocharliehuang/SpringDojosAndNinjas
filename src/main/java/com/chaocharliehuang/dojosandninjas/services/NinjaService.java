package com.chaocharliehuang.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chaocharliehuang.dojosandninjas.models.*;
import com.chaocharliehuang.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	private NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	public List<Ninja> getNinjasAtDojo(Dojo dojo) {
		return ninjaRepository.findByDojo(dojo);
	}
}
