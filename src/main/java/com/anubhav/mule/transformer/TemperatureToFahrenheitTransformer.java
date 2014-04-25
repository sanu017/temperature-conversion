package com.anubhav.mule.transformer;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

import com.anubhav.mule.model.Temperature;
import com.anubhav.mule.model.W3SchoolFtoCRequest;

public class TemperatureToFahrenheitTransformer extends AbstractTransformer{
	
	public TemperatureToFahrenheitTransformer() {
		registerSourceType(DataTypeFactory.create(Temperature.class));
		setReturnDataType(DataTypeFactory.create(W3SchoolFtoCRequest.class));
		setName("TemperatureToFahrenheitTransformer");
	}

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		Temperature temperature = (Temperature)src;
		
		W3SchoolFtoCRequest  req  = new W3SchoolFtoCRequest();
		req.setFahrenheit(temperature.getValue().toString());
		return req;
	}

}
