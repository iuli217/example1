package com.example.test1db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/Pagina")
public class Control {

	@Autowired
	Service srv;
	
	@RequestMapping(value="prima",method=RequestMethod.GET)
	public ResponseEntity<Students> clasaA(@RequestParam String x){
		Students stud = srv.scrie(x);
		return new ResponseEntity<Students>(stud, HttpStatus.OK);
	}
	
	@RequestMapping(value="doua",method=RequestMethod.DELETE)
	public ResponseEntity<Students> clasaB(@RequestParam String x){
		Students stud = srv.sterge(x);
		return new ResponseEntity<Students>(stud, HttpStatus.OK);
	}
	
}
