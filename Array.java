package from02_04;

import java.util.Arrays;
        
public class Array {
	public static void main(String[] args) {
		
		String []name= new String[4];
		name[0]="shashank";
		name[1]="mayuri";
		name[2]="vaibhav";
		name[3]="jatin";
		
		
		for(int i=0; i<4;i++) {
			System.out.println(name[i]);
		}
		System.out.println(Arrays.toString(name));
	}
}
