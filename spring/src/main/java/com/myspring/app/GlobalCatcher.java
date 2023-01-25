package com.myspring.app;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// controllerAdvice to control global exception
@ControllerAdvice("com.myspring.add")
public class GlobalCatcher {
	@ExceptionHandler(NullPointerException.class)
	public String catcher2(Exception ex, Model m) {
		m.addAttribute("ex", ex);
		return "error2";
	}
	
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex) {
		return "error";
	}
	
}
