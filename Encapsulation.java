package from02_04;

public class Encapsulation { //Parent class
	
	private String username="anshuchakre305@gmail.com";   //global variable
	
	public void setUsername(String newUserName) { //local variable
		this.username=newUserName;
		
	}
	public String getUsername() {
		return username;
	}
	
	private int code=321;

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}
