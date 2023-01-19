package com.myspring.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DayTellerMVC {
	@RequestMapping("/getDayMVC")
//	public void main(HttpServletRequest req, HttpServletResponse res) throws IOException {
	public void main(int year, int month, int day, HttpServletResponse res) throws IOException {

//		String year = req.getParameter("year");
//		String month = req.getParameter("month");
//		String day = req.getParameter("day");
		
//		int yyyy = Integer.parseInt(year);
//		int mm = Integer.parseInt(month);
//		int dd = Integer.parseInt(day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year,  month - 1, day);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String[] dateArr = {"", "", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		String date = dateArr[dayOfWeek];
		
//		System.out.println(year + "yr " + month + "m " + day + "d");
//		System.out.println("Today is " + date);
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");
		
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("DayTeller");
		out.println("</h1>");
		out.println("<p>");
		out.println(year + "yr " + month + "m " + day + "d");
		out.println("Today is " + date);	
		out.println("</p>");
		
		
		out.println("<body>");
		
		out.println("</html>");
	}

}
// run on console in /classes // java packageName yy mm dd