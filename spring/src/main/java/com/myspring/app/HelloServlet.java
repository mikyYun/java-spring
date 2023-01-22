package com.myspring.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// initialize servlet(when servlet generated or reloaded(only once)
		System.out.println("[HelloServlet] init()");
		
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		1. input
//		2. process
//		3. print
		System.out.println("[HelloServlet] service() is running");
	}
	
	@Override
	public void destroy() {
//		when servlet unloaded
		
		System.out.println("[HelloServlet] destroy()");
	}

}
