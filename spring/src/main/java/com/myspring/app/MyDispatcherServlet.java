package com.myspring.app;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

@WebServlet("/myDispatcherServlet")  // http://localhost/app/myDispatcherServlet?year=2021&month=10&day=1
public class MyDispatcherServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map    map = request.getParameterMap();
		Model  model = null;
		String viewName = "";
		
		try {
			Class clazz = Class.forName("com.myspring.app.DayTellerMVC");
			Object obj = clazz.newInstance();
			
      			// 1. get methods from main
			Method main = clazz.getDeclaredMethod("main", int.class, int.class, int.class, Model.class);
			
//			2. read paramArr of main method and set in argArr
			Parameter[] paramArr = main.getParameters();
			Object[] argArr = new Object[main.getParameterCount()];

			for(int i=0;i<paramArr.length;i++) {
				String paramName = paramArr[i].getName();
				Class  paramType = paramArr[i].getType();
				Object value = map.get(paramName);

				// if paramType has Model, generate & store
				if(paramType==Model.class) {
					argArr[i] = model = new BindingAwareModelMap();
				} else if(paramType==HttpServletRequest.class) {
					argArr[i] = request;
				} else if(paramType==HttpServletResponse.class) {
					argArr[i] = response;					
				} else if(value != null) {  // if map has paramName,
					String strValue = ((String[])value)[0];	// type of value from getParameterMap() is String.
					argArr[i] = convertTo(strValue, paramType);				
				} 
			}
			
			// 3. call main() from Controller
			viewName = (String)main.invoke(obj, argArr); 	
		} catch(Exception e) {
			e.printStackTrace();
		}
				
		// 4. rendering with text file
		render(model, viewName, response);			
	} // main
	
	private Object convertTo(Object value, Class type) {
		if(type==null || value==null || type.isInstance(value)) // if same type,
			return value;
		
		// if different type,
		if(String.class.isInstance(value) && type==int.class) { // String -> int
			return Integer.valueOf((String)value);
		} else if(String.class.isInstance(value) && type==double.class) { // String -> double
			return Double.valueOf((String)value);
		}
			
		return value;
	}
		
	private String getResolvedViewName(String viewName) {
		return getServletContext().getRealPath("/WEB-INF/views") +"/"+viewName+".jsp";
	}
	
	private void render(Model model, String viewName, HttpServletResponse response) throws IOException {
		String result = "";
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		// 1. make text line by line after reading contents of VIEW.
		Scanner sc = new Scanner(new File(getResolvedViewName(viewName)), "utf-8");
		
		while(sc.hasNextLine())
			result += sc.nextLine()+ System.lineSeparator();
		
		// 2. model to map
		Map map = model.asMap();
		
		// 3. key to value of key
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();

			// 4. replace()
			result = result.replace("${"+key+"}", map.get(key)+"");
		}
		
		// 5.printing rendering
		out.println(result);
	}
}