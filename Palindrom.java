package from02_04;

public class Palindrom {
	public static void main(String[] args) {
		
		String inp= "Madam";
		String out="";
		
		for(int i=inp.length()-1; i>=0;i--) {
			out+=inp.charAt(i);
			
		}
		System.out.println("given word = "+inp);
		System.out.println("reversed word = " +out);
		
		if(inp.equals(out)) {
			System.out.println("The given word is palindrom");
		}
		else {
			System.out.println("The given word is not palindrom");
		}
		
		String s= "hard";
		String t="";
		for(int i =s.length()-1; i>=0;i--) {
			 t+=s.charAt(i);
			
		}
		 System.out.println(t);
	}

}
