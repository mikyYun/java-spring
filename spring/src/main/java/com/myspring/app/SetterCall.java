package com.myspring.app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

public class SetterCall {

	public static void main(String[] args) throws Exception {
		Map<String, String> map = new HashMap();
		
		map.put("year", "2023");
		map.put("month", "10");
		map.put("day", "1");
		
		Class<?> type = Class.forName("com.myspring.app.MyDate");
		
		Object obj = dataBind(map, type);
		System.out.println("obj : " + obj);
	}
	
	private static Object dataBind(Map<String, String> map, Class<?> clazz) throws Exception {
//		1. create MyDate Instance
		Object obj = clazz.getDeclaredConstructor(null).newInstance(new Object[0]);
				
//		2. call MyDate.setter and initialize MyDate with value from map
		Field[] myArr = clazz.getDeclaredFields();
		
		for (int i = 0; i < myArr.length; i ++) {
			String name = myArr[i].getName();
			Class<?> type = myArr[i].getType();
			
			Object value = map.get(name);
			Method method = null;
			
			try {
				if (value == null) continue;
				
				method = clazz.getDeclaredMethod(getSetterName(name),  type);
				System.out.println("method in try: "+ method);
				method.invoke(obj,  converTo(value, type));
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(Arrays.toString(myArr));
		
		return obj;
		
	}
	
	private static Object converTo(Object value, Class<?> type) {
		if (value == null || type == null || type.isInstance(value)) {
			return value;
		}
		
		if (String.class.isInstance(value) && type == int.class) {
			return Integer.valueOf("::" + value);
		}
		return value;
	}
	
	private static String getSetterName(String name) {
		return "set" + StringUtils.capitalize(name);
	}
}
