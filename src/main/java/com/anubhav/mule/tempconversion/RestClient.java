package com.anubhav.mule.tempconversion;

import javax.ws.rs.core.MediaType;

import com.anubhav.mule.model.Temperature;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClient {
	public static void main(String[] args) {
		try {
			System.out.println("Making Celsius to Fahrenheit Request ------------------------ ");
			Temperature temp = new Temperature(13.4, "CELSIUS");
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8081/ts/convert");
			webResource.type(MediaType.APPLICATION_XML);
			ClientResponse response = webResource.accept(
					MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, temp);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}
			String output = response.getEntity(String.class);
			System.out.println("Server response : \n");
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Making Fahrenheit to Celsius Request ------------------------ ");
			Temperature temp = new Temperature(56.12, "FAHRENHEIT");
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8081/ts/convert");
			webResource.type(MediaType.APPLICATION_XML);
			ClientResponse response = webResource.accept(
					MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, temp);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}
			String output = response.getEntity(String.class);
			System.out.println("Server response : \n");
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}