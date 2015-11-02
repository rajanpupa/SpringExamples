package com.tutorialspoint;

import java.io.Serializable;

public class Greeting implements Serializable{
	String name;
	
	public Greeting(){}
	
	public Greeting(String name){
		this.name = name;
	}

	public String getName() {
		return "Hello " + name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
