package com.myspring.app;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception {

		Class helloClass = Class.forName("com.myspring.app.Hello");
		Hello hello = (Hello)helloClass.newInstance();
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); // accessible private main method
		
		main.invoke(hello, args); // = hello.main()
	}

}
