package com.myspring.app;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
//	@ExceptionHandler(NullPointerException.class)
////	public String catcher2(Exception ex) {
////		return "error2";
////	}
//	public String catcher2(Exception ex, Model m) {
//		m.addAttribute("ex", ex);
//		return "error2";
//	}
//	
//	@ExceptionHandler(Exception.class)
//	public String catcher(Exception ex) {
//		return "error";
//	}
//	
	@RequestMapping("/ex")
	public String main() throws Exception {
//		try {
			throw new Exception("Exception");
//		} catch (Exception e) {
//			return "error";
//		}
	}
	
	@RequestMapping("/ex2")
	public String main2() throws Exception {
//		try {
			throw new Exception("Exception");
//		} catch (Exception e) {
//			return "error2";
//		}
	}
	
	@RequestMapping("/ex3")
	public String main3() throws Exception {
		throw new NullPointerException("Null");
		
	}
	
	@RequestMapping("/ex4")
	public String main4() throws Exception {
		// this will be handled by Exception becuase no handler for FileNotFound
		throw new FileNotFoundException("Null");
		
	}
}
