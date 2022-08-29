package core;

import Users.Student;

public class Queue {
	
	NodeStudent head;
	NodeStudent tail;
	private int size;
	
	public Queue() {
		this.head =  this.tail = null;
		this.size = 0;
	}

	public void enQueue(Student student) {
		NodeStudent node = new NodeStudent(student);
		if(this.isEmpty()) {
			this.head = node;
			this.tail = node;
			node.next = null;
		}else {
			this.tail.next = node;
			this.tail = node;
 		}
		this.size++;
	}
	
	public void showStudentsInLecture() {
		if(this.isEmpty()) {
			System.out.println("there is not any students in the lecture...");
			return;
		}
		NodeStudent temp = this.head;
		while(temp != null) {
			System.out.println("Student number : " + temp.student.getStudentNumber());
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		}
		return false;
	}
	
	public int mevcut() {
		return this.size;
	}
}
