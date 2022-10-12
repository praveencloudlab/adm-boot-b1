package com.cts.ecart.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CollectionConfig {

    @Bean
    //@Primary
    public List<String> personNamesList() {
    	List<String> names=new ArrayList<>();
    	names.add("John");
    	names.add("Adam");
    	names.add("Hary");
    	
        //return Arrays.asList("John", "Adam", "Harry");
    	return names;
    }
    
    
    @Bean
    public List<String> citiesNameList() {
    	List<String> names=new ArrayList<>();
    	names.add("HYD");
    	names.add("CHN");
    	names.add("PUNE");
        //return Arrays.asList("John", "Adam", "Harry");
    	return names;
    }
    

}
