package com.anubhav.mule.tempconversion;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/test")
public class PostTestService {
	
	/*@Context private HttpServletRequest request = null;*/
	
	@POST
	@Path("/m")
	public String test(@FormParam("Celsius") String celsius, @FormParam("unit") String unit, @FormParam("celsius") String lCelsius){
		System.out.println("FORM Param Celsius : " + celsius);
		System.out.println("FORM Param unit : " + unit);
		System.out.println("FORM Param celsius : " + lCelsius);
		/*System.out.println("Request Param : " + request.getAttribute("Celsius"));*/
		
		return celsius;
	}

	/*public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}*/

	
}
