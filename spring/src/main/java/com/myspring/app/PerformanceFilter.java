package com.myspring.app;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns="/*")
public class PerformanceFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
//		init
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {//		1. pre-process
		long startTime = System.currentTimeMillis();
		
//		2. call servlet or next filter
		chain.doFilter(request, response);
		
//		3. post-process
		HttpServletRequest req = (HttpServletRequest)request;
		String referer = req.getHeader("referer");
		String method = req.getMethod();
		System.out.println("[" + referer + "] => " + method + "[" + req.getRequestURI() + "]");
		System.out.print("RequestURL FROM Servlet Request: " + ((HttpServletRequest)req).getRequestURL());
		System.out.println("    Time : " + (System.currentTimeMillis() - startTime) + "ms");

	}

	@Override
	public void destroy() {
//		destroy process
	}
	
}
