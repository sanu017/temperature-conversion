package com.anubhav.mule.model;

import java.io.Serializable;

public class W3SchoolFtoCRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String fahrenheit;

	public String getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(String fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public String toString(){
		return "Fahrenheit=" + this.fahrenheit;
	}
	
}
