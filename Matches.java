package from02_04;

public class Matches {
	
	public static void main(String[] args) {
		//Check if the given string consist of 8 character or not
		String s = "shashank";
		boolean s1 = s.matches("........");
		System.out.println(s1);
		
		//check if the string start with s
		boolean s2=s.matches("S(.*)");
		System.out.println(s2);

		//check if the string ends with k
		boolean s3=s.matches("(.*)k");
		System.out.println(s3);
		
		//check if it contens sha in it
		boolean s4 = s.matches("(.*)sha(.*)");
		System.out.println(s4);
		
	}

}
