package com.anubhav.mule.model;

import java.io.Serializable;

public class W3SchoolCtoFRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String celsius;
	
	public W3SchoolCtoFRequest(){
		
	}

	public W3SchoolCtoFRequest(String celsius) {
		super();
		this.celsius = celsius;
	}

	public String getCelsius() {
		return celsius;
	}

	public void setCelsius(String celsius) {
		this.celsius = celsius;
	}
	
	public String toString(){
		return "Celsius=" + this.celsius;
	}
}
