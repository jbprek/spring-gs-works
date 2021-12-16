
package com.example.country.ws.client;

import com.example.country.ws.dto.GetCountryRequest;
import com.example.country.ws.dto.GetCountryResponse;
import com.example.country.ws.dto.MetaInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringWriter;

public class CountryClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(CountryClient.class);

	@Autowired
	Jaxb2Marshaller jaxb2Marshaller;


	public GetCountryResponse getCountry(String country) throws IOException {

		GetCountryRequest request = new GetCountryRequest();

		jaxb2Marshaller.



//		MetaInfo metaInfo = new MetaInfo();
//		StringWriter sw = new StringWriter();
//
//		Result result = new StreamResult(sw);
//		getMarshaller().marshal(metaInfo,result);
//		String metaInfoXml = sw.toString();
		request.setName(country);

		log.info("Requesting location for " + country);

		GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		return response;
	}

}
