package com.example.DBConnection2;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;




@org.springframework.stereotype.Service
@Transactional
public class Service {

	@PersistenceContext
	EntityManager em;

	public Student returneaza(String x, String y) {
		Student stud = new Student(x, y);
		em.persist(stud);
		return stud;
	}

	public Student cauta(String x, String y, Long z) {
		Student stud = em.find(Student.class, z);
		em.remove(stud);
		return stud;
	}
	
	public Student querry(Long z) {
		Student stud = em.find(Student.class, z); 
		return stud;
	}
	
	public Student eroare(String x,String y) {
		Student stud = new Student(x,y);
	return stud;		
	}
	
	@SuppressWarnings("unchecked")
	public Student quer (String x, String y) {
		
		List<Student> stud =  em.createNamedQuery("findByNume").setParameter("nu", y).getResultList();
		List<Student> st =  em.createNamedQuery("findByEmail").setParameter("nu", x).getResultList();
		Student ss=null;
		if(!stud.isEmpty() & !st.isEmpty()) {
			 ss = new Student(x,y);
				ss.setEmail(x+"  exista deja");
				ss.setNume(y+"  exista deja");
		}else {
			ss = new Student(x,y);
			em.persist(ss);
		}
		return ss;
	}

	
}
