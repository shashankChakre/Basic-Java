package from02_04;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
	
	public static void main(String[] args) {
		
		ArrayList <String> a= new ArrayList<String>();
		a.add("Shashank");
		a.add("Ram");
		a.add("shyam");
			System.out.println(a);
			
			Iterator<String> b=a.iterator();
			while(b.hasNext()) {
				System.out.println(b.next());
			}
		
	}
	
	

	

}
