

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		
		names.add("John");
		names.add("Peter");
		names.add("Rahul");
		names.add("Chetan");
		names.add("Kirti");
		names.add("Srinivas");
		System.out.println(names);
		
		names.add(3,"Raju");
		
		System.out.println(names.get(5));
				names.remove(2);
		System.out.println(names);
		System.out.println(names.contains("Srinivas"));
		
		Iterator<String> itr=names.iterator();
		
		System.out.println(itr);
		
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println("Hello "+name);
		}
		
		for(String name:names) {
			System.out.println("Hi "+name);
		}

	}

}
