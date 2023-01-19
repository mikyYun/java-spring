package com.myspring.app;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MethodCall {

	public static void main(String[] args) throws Exception {
		HashMap map = new HashMap();
		System.out.println("before: " + map);
		
		ModelController mc = new ModelController();
		String viewName = mc.main(map);
		
		System.out.println("after : " + map);
		
		render(map, viewName);
		
	}
	
	static void render(HashMap map, String viewName) throws IOException {
		String result = "";
		
//		1. read contents line by line in View, and make it as String
		Scanner sc = new Scanner(new File(viewName + ".txt"));
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			result += sc.nextLine() + System.lineSeparator();
		}
		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println("THIS" + key + ", " + (String)map.get(key));
//			3. replace key into value with replace()
			result = result.replace("${" + key + "}", (String)map.get(key));
		}
		
//		Print rendering result
		System.out.println(result);
			
	}

}

class ModelController {
	public String main(HashMap map) {
		map.put("id",  "asdf");
		map.put("pwd", "1111");
		
		return "txtView1"; // return view name
	}
}
