package com.example.test1db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service
@Transactional
public class Service {
	
	@Autowired
	Students stud;
	
	@PersistenceContext
	EntityManager em;
	
	public Students scrie(String x) {
	
		return null;
	}
	
public Students sterge(String x) {
		em.remove(stud);
		return null;
	}

}
