package from02_04;

public class StringFunction {
	public static void main(String[] args) {
		String s = "Shashank";
		String q="";
		int h=s.length();
		System.out.println(h);
		String u=s.toUpperCase();
		System.out.println(u);
		String e=s.toLowerCase();
		System.out.println(e);
		System.out.println(s.trim());
		System.out.println(s.equals("shashank"));
		System.out.println(s.equalsIgnoreCase("shashank"));
		System.out.println(s.concat(" Vijay Chakre"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(0, 5));
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf("s"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(q.isEmpty());

	}

}
