package com.cts.ecart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
@Repository
public class DBUtils {

	    @Autowired
	    @Qualifier(value = "personNamesList")
	    private List<String> nameList;
	    
	    @Autowired
	    @Qualifier(value = "citiesNameList")
	    private List<String> cityList;


	    public void printNameList() {
	        System.out.println(nameList);
	    }
	    
	    public void printCityList() {
	        System.out.println(cityList);
	    }
	    
	    
	
	

}
