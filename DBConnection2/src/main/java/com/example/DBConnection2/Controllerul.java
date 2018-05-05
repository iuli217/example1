package com.example.DBConnection2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Controller>>Mapare (/inregistrare)>>Service (apeleaza o entitate>a unui tabel,id,column)>>entityManager si introduce datele
@RestController
@RequestMapping(value = "/Pagina")
public class Controllerul {

	@Autowired
	Service srv;

	@Autowired
	DataSource datasource;

	Connection con;
	Statement stmt = null;
	ResultSet rs = null;

	
	@RequestMapping(value = "quer", method = RequestMethod.GET)
	public ResponseEntity<Student> quer(@RequestParam String x,@RequestParam String y){
		Student rez =srv.quer(x,y);
		return new ResponseEntity<Student>(rez, HttpStatus.OK);
	}
	
	@RequestMapping(value = "switch", method = RequestMethod.GET)
	public ResponseEntity<Student> switchul(@RequestParam String a){
		Student rez = null;
		try {
			int x = Integer.parseInt(a);
			switch(x) {
			case 2000:
				rez = srv.cauta( "martie", "carnsdasaet@gmail.com",2L);
				break;
			case 3000:
				rez = srv.returneaza("martie", "carnsdasaet@gmail.com");
				break;
			default:
				rez= srv.querry(Long.valueOf(x));
				break;
			}
			return new ResponseEntity<Student>(rez, HttpStatus.OK);
		}catch(Exception e) {
			if(a.contains("@") & a.contains(".com")) {
			rez = srv.returneaza("daniel",a);
			return new ResponseEntity<Student>(rez, HttpStatus.OK);
			}else {
			rez = srv.eroare("", a);
			rez.setEmail("probleme cu email-ul");
			rez.setNume("numele");
				return new ResponseEntity<Student>(rez, HttpStatus.BAD_REQUEST);
			}
		}	
	}
	
	@RequestMapping(value = "stergere", method = RequestMethod.DELETE)
	public ResponseEntity<Student> logare(@RequestParam String x, @RequestParam String y, @RequestParam Long z) {
		Student rez = srv.cauta(x, y, z);
		return new ResponseEntity<Student>(rez, HttpStatus.OK);
	}

	@RequestMapping(value = "inregistrare", method = RequestMethod.GET)
	public ResponseEntity<Student> inregistrare(@RequestParam String x, @RequestParam String y) {
		Student rezultat = srv.returneaza(x, y);
		return new ResponseEntity<Student>(rezultat, HttpStatus.OK);

	}
	
	
	@RequestMapping(value = "query", method = RequestMethod.GET)
	public ResponseEntity<Student> querry(@RequestParam Long z) {
		Student rezultat = srv.querry(z);
		return new ResponseEntity<Student>(rezultat, HttpStatus.OK);

	}

	@RequestMapping(value = "sterge", method = RequestMethod.GET)
	public ResponseEntity<Student> stergere(@RequestParam String x, @RequestParam String y) {
		srv.returneaza(x, y);
		Student stud = new Student(x, y);
		try {
			con = datasource.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM login WHERE nume='" + x + "' and email='" + y + "';");
			stmt = null;
			if (rs.next()) {
				stmt = con.createStatement();
				stmt.executeUpdate("DELETE  FROM login WHERE nume='" + x + "' and email='" + y + "';");
				System.out.println(" " + x + "  " + y + "      suntem pe stergere");
				return new ResponseEntity<Student>(stud, HttpStatus.OK);
			} else {
				stud.setEmail("ai gresit emailul baiatul meu");
				stud.setNume("ai gresit numele baiatul meu");
				return new ResponseEntity<Student>(stud, HttpStatus.BAD_REQUEST);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			stud.setEmail("ai gresit emailul baiatul meu");
			stud.setNume("ai gresit numele baiatul meu");
			return new ResponseEntity<Student>(stud, HttpStatus.BAD_REQUEST);
		}
	}

}
