package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/hello")
public class HelloController{
	
	@RequestMapping(value="/")
	public @ResponseBody String defaultMethod(){
		return "Hello there";
	}
	
	@RequestMapping(value="/greet", method=RequestMethod.GET)
	public @ResponseBody Greeting greet(@RequestParam("name")String name){
		System.out.println("inside greet method " + name);
		Greeting g = new Greeting();
		g.setName(name);
		return g;
	}
 
   @RequestMapping(value="print", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      System.out.println("In the controller....");
      return "abc";
   }

}
