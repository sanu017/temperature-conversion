package com.anubhav.mule.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "temperature")
public class Temperature implements Serializable{

	private static final long serialVersionUID = -4990528177547616887L;

	private Double value;

	private String unit;
	
	public Temperature(){}

	public Temperature(Double value, String unit) {
		super();
		this.value = value;
		this.unit = unit;
	}

	@XmlElement
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@XmlElement
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
