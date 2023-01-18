package com.myspring.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DayTeller {

//	public static void main(String[] args) {
//
//		String year = args[0];
//		String month = args[1];
//		String day = args[2];
//		
//		int yyyy = Integer.parseInt(year);
//		int mm = Integer.parseInt(month);
//		int dd = Integer.parseInt(day);
//		
//		Calendar cal = Calendar.getInstance();
//		cal.set(yyyy,  mm - 1, dd);
//		
//		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//		String[] dateArr = {"", "", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
//		String date = dateArr[dayOfWeek];
//		
//		System.out.println(year + "yr " + month + "m " + day + "d");
//		System.out.println("Today is " + date);
//	}
	@RequestMapping("/getDay")
	public void main(HttpServletRequest req, HttpServletResponse res) throws IOException {

		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy,  mm - 1, dd);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String[] dateArr = {"", "", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		String date = dateArr[dayOfWeek];
		
//		System.out.println(year + "yr " + month + "m " + day + "d");
//		System.out.println("Today is " + date);
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");
		
		PrintWriter out = res.getWriter();
		out.println(year + "yr " + month + "m " + day + "d");
		out.println("Today is " + date);
	}

}
// run on console in /classes // java packageName yy mm dd