package com.cts.ecart;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {
	
	@Around("execution(* com.cts.ecart.service.**.*Transfer())")
	public void transactionManager(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Transferring funds "+pjp.getSignature());
		
		Object obj = pjp.proceed(); 
		
		if(obj==null) {
			// roll back transaction
		}
		
		System.out.println(obj);
		
	}

}
