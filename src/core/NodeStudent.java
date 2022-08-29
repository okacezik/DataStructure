package core;

import Users.Student;

public class NodeStudent {

	Student student;
	NodeStudent next;
	
	public NodeStudent(Student student) {
		this.student = student;
		this.next = null;
	}
}
