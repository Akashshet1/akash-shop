package learn;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		
		HashMap<String,Integer> courses = new HashMap<>();
		
		courses.put("core jav", 4000);
		courses.put("basiic python",3500);
		courses.put("Spring", 8000);
		courses.put("android", 6000);
		courses.put("android", 6000);
		courses.put("PHP", 5252);
		
		System.out.println(courses);
		
		
	   courses.forEach((e1,e2)->{
		   System.out.println(e1+"=>"+e2);
	   });
	}
	

}
