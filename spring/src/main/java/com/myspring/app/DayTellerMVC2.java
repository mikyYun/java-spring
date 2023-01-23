package com.myspring.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DayTellerMVC2 {
	public String catcher(Exception ex) {
		ex.printStackTrace();
		return "dayError";
	}
	
	@RequestMapping("/getDayMVC2")
//	public void main(HttpServletRequest req, HttpServletResponse res) throws IOException {
//	public String main(int year, int month, int day, Model model) throws IOException {
	public String main(@RequestParam(required=true) int year,
			@RequestParam(required=true) int month,
			@RequestParam(required=true) int day,
			Model model
			) throws IOException {

		if (!isValid(year, month, day)) {
			return "dayError";
		}
		
		String date = getDate(year, month, day);
		
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		model.addAttribute("date", date);
		
		
		return "day";	
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