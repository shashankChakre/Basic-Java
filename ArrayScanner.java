package from02_04;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayScanner {
	
	public static void main(String[] args) {
		try {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		String []name = new String[s1.nextInt()];  //String of array name is equals new  String of size 		
		//name[0]="shashank";
		
		for(int i=0; i<name.length;i++) {
			System.out.println("enter the name " +i);
	         name[i]=s1.next();
	}
		System.out.println(Arrays.toString(name));
		s1.close();
		}
		catch(NegativeArraySizeException a) {
			System.out.println("You cannot enter the negative value");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the size of Array");
			String []name = new String[s1.nextInt()];  //String of array name is equals new  String of size 		
			//name[0]="shashank";
			
			for(int i=0; i<name.length;i++) {
				System.out.println("enter the name " +i);
		         name[i]=s1.next();
		}
			System.out.println(Arrays.toString(name));
			s1.close();
			
		}
		catch(InputMismatchException a) {
			System.out.println("You have to enter only numeric values in numeric section");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the size of Array");
			String []name = new String[s1.nextInt()];  //String of array name is equals new  String of size 		
			//name[0]="shashank";
			
			for(int i=0; i<name.length;i++) {
				System.out.println("enter the name " +i);
		         name[i]=s1.next();
		}
			System.out.println(Arrays.toString(name));
			s1.close();
			
		}
	}
	
}
