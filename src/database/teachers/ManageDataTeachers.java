package database.teachers;

import Users.Teacher;

public class ManageDataTeachers implements DataTeachers{
	
	DataTeachers dataTeachers;
	
	public ManageDataTeachers(DataTeachers dataTeachers) {
		this.dataTeachers = dataTeachers;
	}
	
	@Override
	public void add(String userName , String password) {
		if(this.search(userName, password) == false) {
			Teacher teacher = new Teacher(userName, password);
			this.dataTeachers.teachers.add(teacher);
		}else {
			System.out.println("this teacher is in the system already...");
		}
	}
	
	@Override
	public boolean search(String userName , String password) {
		for(Teacher teacher : dataTeachers.teachers) {
			if(teacher.getUserName().equals(userName) && teacher.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}
	
	public void showTeacher() {
		for(Teacher teacher : dataTeachers.teachers) {
			System.out.println("username : " + teacher.getUserName());
		}
	}
	
	@Override
	public void delete(String userName , String password) {
		Teacher teacher = new Teacher(userName , password);
		if(this.search(userName, password) == true) {
			this.dataTeachers.teachers.remove(teacher);
		}else {
			System.out.println("this teacher is not in the system...");
		}
	}
	
	
	public ManageDataTeachers() {
		Teacher teacher = new Teacher("Mustafa Bayram" , "1234mustafa");
		Teacher teacher2 = new Teacher("Perihan Pehlivanoðlu" , "1923pep");
		Teacher teacher3 = new Teacher("Mehmet Ali Serttaþ" , "2022mehmet");
		this.dataTeachers.teachers.add(teacher);
		this.dataTeachers.teachers.add(teacher2);
		this.dataTeachers.teachers.add(teacher3);
	}
	

}
