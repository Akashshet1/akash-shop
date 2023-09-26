package learn;
//import utill package [all classes}
import java.util.*;

public class StartCode {
	public static void main(String[] args) {
		System.out.println("welcome to java collecton framework");
		
		//creating collection
		//1)type safe collection - same type of objects are added to collection
      //  2)untype safe collection - different types of element can be added to collection
		
		//Type safe collection
		ArrayList<String> names = new ArrayList<String>();
		names.add("Durgesh");
		names.add("Sitara");
		names.add("vandana");
		names.add("roshni");
		names.add("roshni");
		
		System.out.println(names);

		System.out.println(names.get(1));
		System.out.println(names.get(2));
		//Untype safe collection
//		LinkedList list = new LinkedList();
		
//		list.add("sachin");
//		list.add("100");
//		list.add("625.33");
//		list.add(true);
		
//		System.out.println(list);
		
		//removes
		
		names.remove(2);
		
		System.out.println(names);
		
		//size
		
		System.out.println("SIZE = "+names.size());
		
		//contains
		//type ka equalsmethod call  karta hai 
		
		System.out.println(names.contains("Durgesh"));
		
		//CHECK FOR EMPTY
		System.out.println(names.isEmpty());
		
		//setting value
		names.set(1, "ram");
		System.out.println(names);
		
		names.add(1, "ram");
		
		System.out.println(names);
		
		//remove
		
		
//		names.clear();
//		System.out.println(names);
		
		
		
		Vector<String > vector = new Vector<>();
		vector.addAll(names);
		
		System.out.println("VECTOR" +vector);
		
		System.out.println("---------------------------------------------------");
		
		HashSet <Double> nms = new HashSet<>();
		
		nms.add(14.223);
		nms.add(14.223);
		nms.add(34.223);
		nms.add(5.3);
		
		System.out.println(nms);
		
		
		TreeSet<Double> tset = new TreeSet<>();
		
		tset.addAll(nms);
		System.out.println(tset);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
