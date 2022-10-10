package com.cts.ecart;

import org.springframework.stereotype.Component;

@Component(value = "c1Obj")
public class C1 {
	
	public C1() {
		System.out.println(">>> C1 object created...");
	}
	
	public void f1() {
		System.out.println(">>>> C1 class f1 method");
	}

}
