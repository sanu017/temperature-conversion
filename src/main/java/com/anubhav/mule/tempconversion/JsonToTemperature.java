package com.anubhav.mule.tempconversion;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.anubhav.mule.model.Temperature;

public class JsonToTemperature {

	public Temperature convert(String payload){
		System.out.println("IN  JsonToMap : " + payload);
		try {
			Temperature result =
			        new ObjectMapper().readValue(payload, Temperature.class);
			return result;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Temperature();
	}
}
