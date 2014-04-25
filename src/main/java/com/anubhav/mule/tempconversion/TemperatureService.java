package com.anubhav.mule.tempconversion;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.anubhav.mule.model.Temperature;

@Path("/ts")
public class TemperatureService {
	
	@POST
	@Path("/convert")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_XML)
	public Temperature convert(Temperature temperature){
		System.out.println("Temperature  object is  : " + temperature.getUnit());
		return temperature;
	}

}
