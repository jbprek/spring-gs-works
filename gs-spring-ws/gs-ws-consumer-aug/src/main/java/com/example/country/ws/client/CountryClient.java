
package com.example.country.ws.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.country.ws.dto.GetCountryRequest;
import com.example.country.ws.dto.GetCountryResponse;

public class CountryClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(CountryClient.class);

	public GetCountryResponse getCountry(String country) {

		GetCountryRequest request = new GetCountryRequest();
		request.setName(country);

		log.info("Requesting location for " + country);

		GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		return response;
	}

}
