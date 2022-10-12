package com.cts.ecart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource(value = {"abc.properties"})
public class PersonServiceImpl {
	
	@Value("${name}")
	private String personName;
	
	@Value("${company}")
	private String companyName;
	
	@Autowired
	private Environment env;
	
	@Autowired
    @Qualifier(value = "personNamesList")
	private List<String> persons;

	public List<String> getPersons() {
		System.out.println("person name is "+personName);
		System.out.println("Company Name: "+companyName);
		System.out.println("Age is "+env.getProperty("age"));
		System.out.println("Company: "+env.getProperty("company"));
		
		return persons;
	}

}
