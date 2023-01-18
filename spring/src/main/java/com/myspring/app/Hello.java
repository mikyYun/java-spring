package com.myspring.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	
	@RequestMapping("/hello")
	public void main(String[] args) {
		System.out.println("Hello");
		System.out.println(iv); // OK
		System.out.println(cv); // OK
		
	}
	
	public static void main2() {
		System.out.println(cv); // OK
//		System.out.println(iv); // ERROR : Cannot make a static reference to the non-static field iv
	}

}
