package com.kis.first.SpringDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControleer {
	
	@RequestMapping("/first")
	public String welcomeMassage(){
		return "ok";
		
	}
	@GetMapping("/second")
	public ResponseEntity<String> getStringname(@pathVariable String second){
	String name= "Kiran";
	if (String = Kiran){
	return new ResponseEntity<String>(name, HttpStatus.OK);
	}
	else{
	 return new ResponseEntity<String>(null, HttpStatus.NO_CONTENT);
	}

// changes
	@RequestMapping("/first")
	public String welcomeMassage(){
		return "ok";
		/// added
	}
	@RequestMapping("/second")
	public String welcomeMassage(){
		return "not ok";
		
	}

}

}
