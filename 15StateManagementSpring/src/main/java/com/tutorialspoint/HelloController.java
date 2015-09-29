package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/hello")
public class HelloController{
 
   @RequestMapping(value="print", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!. Try adding ?name=something in the url printname.");
      System.out.println("In the controller....");
      return "abc";
   }
   
   /*
    * enter url localhost:8080/printname/?name=yourName
    */
   @RequestMapping(value="printname", method = RequestMethod.GET)
   public String printName(@RequestParam("name") String name, ModelMap model) {
      model.addAttribute("message", "The name passed in the url is : " + name);
      System.out.println("Inside printName method of controller ---");
      return "abc";
   }
   
   /*
    * enter url localhost:8080/printcolors/?color=red&color=green&color=blue
    */
   @RequestMapping(value="printcolors", method = RequestMethod.GET)
   public String printColors(@RequestParam("color") String[] colors, ModelMap model) {
      model.addAttribute("message", "The number of colors passed in the url is " + colors.length);
      
      for(String color: colors){
    	  System.out.println(color);
      }
      
      return "abc";
   }

}
