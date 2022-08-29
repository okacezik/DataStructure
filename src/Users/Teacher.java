package Users;

public class Teacher extends User{

	private String userName;
	private String password;
	
	public Teacher(String userName , String password) {
		this.password = password;
		this.userName = userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getUserName() {
		return this.userName;
	}
}

