package com.myspring.app;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@InitBinder
	public void toDate(WebDataBinder binder) {
		ConversionService conversionService = binder.getConversionService();
		System.out.println("CONVERSION SERVICE = " + conversionService);
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
//		binder.registerCustomEditor(Date.class,  new CustomDateEditor(df, false));
		binder.registerCustomEditor(String[].class, new StringArrayPropertyEditor("#"));
	
		// register UserValidator to local validator of WebDataBinder
//		binder.setValidator(new UserValidator()); // local
		binder.addValidators(new UserValidator()); // addValidator => use global validator
		List<Validator> validatorList = binder.getValidators();
		System.out.println("validatorList = " + validatorList);
	}
	
	@RequestMapping(value="/add", method={RequestMethod.GET})
	public String register() {
		return "registerForm";
	}
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST)
	@PostMapping("/add")
	public String save(@Valid User user, BindingResult result, Model model) throws Exception {
		System.out.println("RESULT@@" + result);
		
//		manual validator
//		UserValidator userValidator = new UserValidator();
//		userValidator.validate(user, result);
		
		if (result.hasErrors()) {
			return "registerForm";
		}
		
//		if (!isValid(user)) {
//			String msg = URLEncoder.encode("Invalid ID");
//			
//			model.addAttribute("msg", msg);
////			return "redirect:/register/add";
//			return "forward:/register/add";
////			return "redirect:/register/add?msg=" + msg; // URL rewriting
//		}
		
		return "registerInfo";
	}

	private boolean isValid(User user) {
	
		return true;
	}
}
