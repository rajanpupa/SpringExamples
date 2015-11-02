package com.tutorialspoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {

	@RequestMapping("/g")
	public Greeting getGreet(@RequestParam("name") String name){
		
		System.out.println(" name = " + name + " received");
		return new Greeting(name);
	}
}
