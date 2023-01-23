package com.myspring.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DayTellerMVC6 {
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex) {
//		System.out.println("result="+result);
		ex.printStackTrace();
		return "dayError";
	}
	
	@RequestMapping("/getDayMVC6")
	public String main(MyDate date, BindingResult result) {
		System.out.println("RESULT : \n" + result);
		
		if (!isValid(date)) {
			return "dayError";
		}
		

		
		return "day";	
	}
	
	private boolean isValid(MyDate date) {

		return isValid(date.getYear(), date.getMonth(), date.getDay());
	}

	private @ModelAttribute("day") String getDate(MyDate date) {
		return getDate(date.getYear(), date.getMonth(), date.getDay());
	}
	
	private boolean isValid(int year, int month, int day) {
		if ((year < 1 || month < 1 || day < 1)) {
			return false;			
		}
		return true;
	}
	
	private String getDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year,  month - 1, day);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String[] dateArr = {"", "", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		return dateArr[dayOfWeek];
	}
	

}
// run on console in /classes // java packageName yy mm dd