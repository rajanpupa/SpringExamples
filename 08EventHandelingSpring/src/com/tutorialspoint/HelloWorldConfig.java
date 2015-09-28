package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig {

	@Bean //(initMethod = "init", destroyMethod = "cleanup" )
	@Scope("prototype")
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}