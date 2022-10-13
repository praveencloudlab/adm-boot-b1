package com.cts.ecart;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PropertyChangeTracker {

	@Before("execution(void com.cts.ecart.**.set*(*))")
	public void trackChange(JoinPoint jp) {
		System.out.println("Property about to change for "+jp.getSignature());
	}
	
	@After("execution(void com.cts.ecart.**.set*(*))")
	public void trackChangeV1(JoinPoint jp) {
		System.out.println("Property changed for "+jp.getSignature());
	}
	
	
	
	
	
	
	

}
