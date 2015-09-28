package com.gontuseries.university;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/university")
public class UniversityRESTWS {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityInfo(){
		return "<html> <head> <title> University Information </title></head>" +
				"<body><h1>Name - Maharishi University </h1></body></html>";
	}
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String getXMLUniversityInfo(){
		return "Name - Indian University";
	}
	
	@PUT
	@Path("{studentRollNo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUniversityInfo(@PathParam("studentRollNo") String studentRollNo){
		// update the student record using student roll no
		return "Done successfully";
	}
	
	
}
