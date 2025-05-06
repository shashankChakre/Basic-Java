package from02_04;

import java.util.Arrays;

public class Anagram {
	
	//Silent and listen
	
	public static void main(String[] args) {
		
		String a= "silent";
		String b="shashank";
		
		if(a.length()!=b.length()) {
			System.out.println("This cant be anagram ");
		}
		else {
		char[] a1=	a.toCharArray()	;
		char[] b1=b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		if(Arrays.equals(a1, b1)==true) {
			System.out.println("This is anagram");
		}
		
		}
		
		
		

	}

}
