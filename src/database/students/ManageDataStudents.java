package database.students;

import Users.Student;

public class ManageDataStudents implements DataStudents{
	
	private DataStudents datas;
	
	public ManageDataStudents(DataStudents datas) {
		this.datas = datas;
		Student student = new Student("200404007","1903Okan");
		Student student2 = new Student("200404028","1905Enes");
		Student student3 = new Student("210404806","1903Abdi");
		Student student4 = new Student("200404024","1905Ramazan");
		this.datas.students.add(student);
		this.datas.students.add(student2);
		this.datas.students.add(student3);
		this.datas.students.add(student4);
	}

	
	public ManageDataStudents() {
		this.datas = datas;
		Student student = new Student("200404007","1903Okan");
		Student student2 = new Student("200404028","1905Enes");
		Student student3 = new Student("210404806","1903Abdi");
		Student student4 = new Student("200404024","1905Ramazan");
		this.datas.students.add(student);
		this.datas.students.add(student2);
		this.datas.students.add(student3);
		this.datas.students.add(student4);
	}
	
	@Override	
	public boolean search(String studentNumber, String password) {
		for(Student student : datas.students) {
			if(student.getStudentNumber().equals(studentNumber) && student.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void add(String studentNumber, String password) {
		Student student = new Student(studentNumber, studentNumber);
		if(this.search(studentNumber, password) == false) {
			this.datas.students.add(student);
		}else {
			System.out.println("this student already is in the system...");
		}
	}
	
	@Override
	public void delete(String studentNumber, String password) {
		Student student = new Student(studentNumber, studentNumber);
		if(this.search(studentNumber, password) == true) {
			this.datas.students.remove(student);
		}else {
			System.out.println("there is not this student in the system...");
		}
	}
	
	public void showStudents() {
		if(datas.students.isEmpty()) {
			System.out.println("not found student in the system...");
			return;
		}
		for(Student student : datas.students) {
			System.out.println("Student's number : "+student.getStudentNumber());
		}
	}
}
