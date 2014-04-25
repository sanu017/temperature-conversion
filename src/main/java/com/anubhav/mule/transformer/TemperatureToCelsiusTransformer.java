package com.anubhav.mule.transformer;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

import com.anubhav.mule.model.Temperature;
import com.anubhav.mule.model.W3SchoolCtoFRequest;

public class TemperatureToCelsiusTransformer extends AbstractTransformer {

	public TemperatureToCelsiusTransformer() {
		registerSourceType(DataTypeFactory.create(Temperature.class));
		setReturnDataType(DataTypeFactory.create(W3SchoolCtoFRequest.class));
		setName("TemperatureToCelsiusTransformer");
	}

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		Temperature temperature = (Temperature) src;
		return new W3SchoolCtoFRequest(temperature.getValue().toString());
	}

}
