package com.myspring.app;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
//		return User.class.equals(clazz); // clazz type check User
		return User.class.isAssignableFrom(clazz); // check clazz inherits of User
	}

	@Override
	public void validate(Object target, Errors errors) { 
		System.out.println("UserValidator.validate() is called");

		User user = (User)target;
		
		String id = user.getId();
		
//		if(id==null || "".equals(id.trim())) {
//			errors.rejectValue("id", "required");
//		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id",  "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pwd", "required");
		
		if(id==null || id.length() <  5 || id.length() > 12) {
			errors.rejectValue("id", "invalidLength");
		}
	}
}	