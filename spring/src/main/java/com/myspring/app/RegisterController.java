package com.myspring.app;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	@RequestMapping(value="/register/add", method={RequestMethod.GET, RequestMethod.POST})
	public String register() {
		return "registerForm";
	}
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST)
	@PostMapping("/register/save")
//	public String save() {
//		return "registerInfo";
//	}
	public String save(User user, Model model) {
		if (!isValid(user)) {
			String msg = URLEncoder.encode("Invalid ID");
			
			model.addAttribute("msg", msg);
//			return "redirect:/register/add";
			return "forward:/register/add";
//			return "redirect:/register/add?msg=" + msg; // URL rewriting
		}
		
		return "registerInfo";
	}

private boolean isValid(User user) {

	return false;
}
}
