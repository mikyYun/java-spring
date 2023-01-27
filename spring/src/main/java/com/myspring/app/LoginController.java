package com.myspring.app;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	
//	System.out.println("TEST@@@@@");
	
	@GetMapping("/login")
	public String loginForm() {
		System.out.println("TEST@@@");
		return "loginForm";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("TEST");
		session.invalidate();
		
		return "redirect:/";
	}
	
	
	@PostMapping("/login")
	public String login(@CookieValue("id") String cookieId, String id, String pwd, String toURL, boolean rememberId, HttpServletRequest req, HttpServletResponse res)  {
		System.out.println("TEST");
		if (!loginCheck(id, pwd)) {
			String msg;
			try {
				msg = URLEncoder.encode("id or password is invalid", "utf-8");
				return "redirect:/login/login?msg=" + msg;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
		HttpSession session = req.getSession();
		session.setAttribute("id", id);
		
		
		if (rememberId) {
//			Set Cookie
			Cookie cookie = new Cookie("id", id);
//			Cookie cookie = new Cookie("pwd", pwd);
			res.addCookie(cookie);
		} else {
//			Set Cookie
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(0);
//			Cookie cookie = new Cookie("pwd", pwd);
			res.addCookie(cookie);
		}
		
		toURL = toURL == null || toURL.equals("") ? "/" : toURL;
		
		return "redirect:" + toURL;
	}
	
	private boolean loginCheck(String id, String pwd) {
		System.out.println("LOGIN ATTEMPT" + id + pwd);
		return "asdf".equals(id) && "1234".equals(pwd);
	}
	
	
}
