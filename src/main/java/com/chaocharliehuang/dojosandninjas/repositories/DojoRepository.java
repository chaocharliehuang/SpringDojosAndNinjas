package com.chaocharliehuang.dojosandninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chaocharliehuang.dojosandninjas.models.*;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
	
}
