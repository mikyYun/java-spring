package com.myspring.app;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

public class MethodCall3 {
	public static void main(String[] args) throws Exception{
		Map map = new HashMap();
		map.put("year", "2021");
		map.put("month", "10");
		map.put("day", "1");

		Model model = null;
		Class clazz = Class.forName("com.myspring.app.DayTellerMVC");
		Object obj  = clazz.newInstance();
		
		// YoilTellerMVC.main(int year, int month, int day, Model model)
		Method main = clazz.getDeclaredMethod("main", int.class, int.class, int.class, Model.class);
				
		Parameter[] paramArr = main.getParameters();
		Object[] argArr = new Object[main.getParameterCount()];
		
		for(int i=0;i<paramArr.length;i++) {
			String paramName = paramArr[i].getName();
			Class  paramType = paramArr[i].getType();
			Object value = map.get(paramName); // map에서 못찾으면 value는 null

//			if Model exist in paramType, generate and store
			if(paramType==Model.class) {
				argArr[i] = model = new BindingAwareModelMap(); 
			} else if(value != null) {  // if map has paramName
				// check type of value and parameter, save after convert if different
				argArr[i] = convertTo(value, paramType);				
			} 
		}
		System.out.println("paramArr="+Arrays.toString(paramArr));
		System.out.println("argArr="+Arrays.toString(argArr));
		
		
		// DayTellerMVC.main(int year, int month, int day, Model model)
		String viewName = (String)main.invoke(obj, argArr); 	
		System.out.println("viewName="+viewName);	
		
		System.out.println("[after] model="+model);
				
//		render with text file
		render(model, viewName);			
	} // main
	
	private static Object convertTo(Object value, Class type) {
		if(type==null || value==null || type.isInstance(value)) // 타입이 같으면 그대로 반환 
			return value;

		// 타입이 다르면, 변환해서 반환
		if(String.class.isInstance(value) && type==int.class) { // String -> int
			return Integer.valueOf((String)value);
		} else if(String.class.isInstance(value) && type==double.class) { // String -> double
			return Double.valueOf((String)value);
		}
			
		return value;
	}
	
	private static void render(Model model, String viewName) throws IOException {
		String result = "";
		
		// 1. read contents from view and To text
		Scanner sc = new Scanner(new File("src/main/webapp/WEB-INF/views/"+viewName+".jsp"), "utf-8");
		
		while(sc.hasNextLine())
			result += sc.nextLine()+ System.lineSeparator();
		
		// 2. model to map
		Map map = model.asMap();
		
		// 3.${key} in template to value
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();

			// 4. replace() (target, newValue)
			result = result.replace("${"+key+"}", ""+map.get(key));
		}
		
		// 5.print.
		System.out.println("@@@@@@@@@@@@@@@@RENDERING@@@@@@@@@@@@@@@@\n" + result);
	}
}