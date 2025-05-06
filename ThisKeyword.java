package from02_04;

public class ThisKeyword {
	
	String name;                                  //Global variable
	int mobNo;
	double salary;
	
	public void studentDetails(String name, int mobNo, double salary) {    //local variable
		
		this.name=name;
		
		System.out.println(name);
		System.out.println(mobNo);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		ThisKeyword a = new ThisKeyword();
		a.studentDetails("shashank", 703060, 45.3);
		System.out.println(a.salary);    //Accessing global varialbe
		System.out.println(a.name);
		System.out.println(a.mobNo);

		
	}

}
