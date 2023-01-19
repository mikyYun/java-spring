package com.myspring.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dice {
	@RequestMapping("/rollDice")
	public void main(HttpServletResponse res) throws IOException {
		int num1 = (int)(Math.random() * 6) + 1;
		int num2 = (int)(Math.random() * 6) + 1;
		
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src='resources/img/dice" + num1 + ".jpg'>");
		out.println("<img src='resources/img/dice" + num2 + ".jpg'>");
		out.println("</body>");
		
		out.println("</html>");
	}
	
}
