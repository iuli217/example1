package com.example.test1db;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "login")
@Component
public class Student implements Students,Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name= "nume")
	private String nume;
	
	@Column(name= "email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nume=" + nume + ", email=" + email + "]";
	}

	public Student(int id, String nume, String email) {
		super();
		this.id = id;
		this.nume = nume;
		this.email = email;
	}
	
	public Student() {
		super();
	}
	
	public Student(String nume) {
		super();
		this.nume=nume;
	}
}
