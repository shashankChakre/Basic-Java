+package from02_04;

import java.util.Arrays;

public class Anagrams {
	 public static void main(String[] args) {
		String a= "arted";
		String b= "heart";
		
		if(a.length()!=b.length()) {
			System.out.println("They are not Anagrams");
		}
		else {
			char a1 [] =a.toCharArray();    //[l,i,s,t,e,n]
	    	char b1 [] = b.toCharArray();   //[s,i,l,e,n,t]
	    	
	    	Arrays.sort(a1);    //sort method converts accending of alphabets 
	    	Arrays.sort(b1);
	    	
	    	boolean y = Arrays.equals(a1, b1);
	    	if(y==true) {
	    		System.out.println("They are Anagrams");
	    	}
	    	else {
	    		System.out.println("They are not Anagram");
	    	}
			
		}
		
	}
	

}
