package Users;

public class Student extends User{
	
	private String studentNumber;
	private String password;
	
	public Student(String studentNumber , String password) {
		this.password = password;
		this.studentNumber = studentNumber;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getStudentNumber() {
		return this.studentNumber;
	}
}
