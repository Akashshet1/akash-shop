package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Durgesh");
		names.add("Sitara");
		names.add("vandana");
		names.add("roshni");
		names.add("roshni");
		names.add("ABC");
		
		//for each loop
		for(String str:names)
		{
			System.out.println(str +"\t" +str.length()+"\t");
			//for reversing elements
			StringBuffer br= new StringBuffer(str);
			System.out.println(br.reverse());
			
		}
		System.out.println("------------------------------------------------");
		
		
		//traversing using iteerator:Forward traversing
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
		{
			String next = itr.next();
			System.out.println(next);
		}
		
		//backward traversal of collection LISTITERATOR
		
//		ListIterator<String> litr = names.listIterator(names.size());
		
//		while(litr.hasPrevious()) {
			
//			String previous = litr.previous();
//			System.out.println(litr);
//		}
		
		
		
		
		
		
		//ENUMERTION IN JAVA
		System.out.println("+++++++++++++++++====+=========");
		
		//for eaach method
		names.forEach(e->{
			System.out.println(e);
			
		});
		
		TreeSet<String> set = new TreeSet<>();
		set.addAll(names);
		set.forEach(e->{
			System.out.println(e);
		});
		
		//comparable
		//comparator read by own
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
