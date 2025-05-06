package from02_04;

public class AverageOfValues {
	
	public static void main(String[] args) {
		int sum=0;
		
		int n[] = new int[4];
		n[0]=10;
		n[1]=20;
		n[2]=30;
		n[3]=40;
		
		for(int i=0;i<4;i++) {
			sum=sum+n[i];
			
		}
		System.out.println("Addition of all the nos is = " +sum);
		double average= sum/n.length;
		System.out.println("Average of all the nos is " +average);
	}

}
