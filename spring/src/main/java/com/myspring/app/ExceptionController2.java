package com.myspring.app;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.BAD_REQUEST)
class MyException extends RuntimeException {
	MyException(String msg) {
		super(msg);
	}
	
	MyException() {
		this("");
	}
}

@Controller
public class ExceptionController2 {
//	@ExceptionHandler(NullPointerException.class)
//	public String catcher2(Exception ex, Model m) {
////		m.addAttribute("ex", ex);
//		return "error2";
//	}
//	
//	@ExceptionHandler(Exception.class)
//	public String catcher(Exception ex) {
//		return "error";
//	}
	
	@RequestMapping("/exx")
	public String main() throws Exception {
			throw new MyException("Exception");
	}
	
	@RequestMapping("/exx2")
	public String main2() throws Exception {
			throw new Exception("Exception");
	}
	
	@RequestMapping("/exx3")
	public String main3() throws Exception {
		throw new NullPointerException("Null");
		
	}
	
	@RequestMapping("/exx4")
	public String main4() throws Exception {
		throw new FileNotFoundException("Null");
		
	}
}
