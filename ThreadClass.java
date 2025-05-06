package from02_04;

public class ThreadClass {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<10;i++) {
			System.out.println(i);
			Thread.sleep(3000);
		}
	}

}
