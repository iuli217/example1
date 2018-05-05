package com.example.DBConnection2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "login")
@NamedQueries({
@NamedQuery(name="findByNume",query="SELECT c FROM Student c WHERE c.nume LIKE :nu" ),
@NamedQuery(name="findByEmail",query="SELECT c FROM Student c WHERE c.email LIKE :nu" )
})

public class Student implements Serializable {

	public Student() {
		super();
	}
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String email;
	private String nume;

	@Column(name = "nume")
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String email, String nume, Long id) {
		super();
		this.email = email;
		this.nume = nume;
		this.id = id;
	}

	public Student(String email, String nume) {
		super();
		this.email = email;
		this.nume = nume;

	}
	
	public Student(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [email=" + email + ", nume=" + nume + "]";
	}

}
