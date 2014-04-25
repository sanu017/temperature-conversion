package com.anubhav.mule;

import javax.ws.rs.core.MediaType;

import junit.framework.Assert;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

import com.anubhav.mule.model.Temperature;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TemperatureConversion extends FunctionalTestCase{

	@Override
	protected String getConfigResources() {
		return "temperature-conversion.xml";
	}
	
	@Override
	protected void doSetUp() throws Exception
    {
        super.doSetUp();
    }
	
	@Test
	public void convertCelsiusToFahrenheitSuccess(){
		Temperature temp = new Temperature(13.4, "CELSIUS");
		Client client = Client.create();
		WebResource webResource = client
				.resource("http://localhost:8081/ts/convert");
		webResource.type(MediaType.APPLICATION_XML);
		ClientResponse response = webResource.accept(
				MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, temp);
		Assert.assertEquals("Error processing request", response.getStatus(), 200 );
	}
	
	@Test
	public void convertFahrenheitToCelsiusSuccess(){
		Temperature temp = new Temperature(90.0, "FAHRENHEIT");
		Client client = Client.create();
		WebResource webResource = client
				.resource("http://localhost:8081/ts/convert");
		webResource.type(MediaType.APPLICATION_XML);
		ClientResponse response = webResource.accept(
				MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, temp);
		Assert.assertEquals("Error processing request", response.getStatus(), 200 );
	}

}
