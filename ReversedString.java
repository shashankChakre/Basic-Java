package from02_04;

public class ReversedString {
	
	public static void main(String[] args) {
		

	String a= "shashank";
	String b="";
	 for(int i=a.length()-1; i>=0; i--) {
		b+= a.charAt(i);
		 
	 }
	 System.out.println(b);
	  //It will reversed string value
	
	/*if(s.equals(t)) {
		System.out.println("this is palindrom");
	}
	else {
	System.out.println("This is not palindrom");
}*/
	}
	
	

}
