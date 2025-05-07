package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionConcept {
	
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("123");//Properties of COllection class can only access
		c.add("SHashank");
		System.out.println(c);
	//boolean g=	c.contains("SHashank");
	//	System.out.println(g);
		
		Iterator<String> y=c.iterator();
		while(y.hasNext()) {        //two methods of iterator hasNext() and next()
			System.out.println(y.next());
		}
		
		List <String>a=new <String> ArrayList();     // we doing this upcasting to acces List properties
		a.add(789, "shashank");                 //because ListIterator concepts only applicable to list
		a.add(200, "mayuri");
		a.add("shashank");
		a.add("Mahima");
		System.out.println(a);
		
		ListIterator e =a.listIterator();
		while(e.hasNext()) {
			System.out.println(e.next());
			
		}
		while (e.hasPrevious()) {
			System.out.println(e.previous());
		}
		
		
		
	//	ArrayList j = new ArrayList();  //this is the object of array list class
		//j.add(j); //Properties of ArrayList class can only be acceseble
		
		
	}

}
