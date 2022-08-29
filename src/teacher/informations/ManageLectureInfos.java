package teacher.informations;

import Users.Student;
import core.Stack;

public class ManageLectureInfos implements LectureInfos {

	private LectureInfos lectureInfos;
	
	public ManageLectureInfos(LectureInfos lectureInfos) {
		this.lectureInfos = lectureInfos; 
		//dersler listesi dönem baþýnda eklendiði için burada ekledik
		this.lectureInfos.lectures.add("*Data Science");
		this.lectureInfos.lectures.add("*Computer Organization");
		this.lectureInfos.lectures.add("*Computer Networks");
		this.lectureInfos.lectures.add("*Data Structures");
		this.lectureInfos.lectures.add("*Numeric Analysis");
	}
	
	public void addLecture(String lecture) {
		lectureInfos.lectures.add(lecture);
	}
	
	public void showLectures() {
		lectureInfos.lectures.showData();
	}
	
	public void addSubjectNumeric(String data) {
		this.lectureInfos.numericAnalysis.add(data);
	}
	
	public void addSubjectDataStructers(String data) {
		this.lectureInfos.dataStructers.add(data);
	}
	
	public void addSubjectDataScience(String data) {
		this.lectureInfos.dataScience.add(data);
	}
	
	public void addSubjectComputerNetworks(String data) {
		this.lectureInfos.computersNetworks.add(data);
	}
	
	public void addSubjectComputerOrganization(String data) {
		this.lectureInfos.computerOrganization.add(data);
	}
	
	public void addStudentList(Student student) {
		this.lectureInfos.yoklama.enQueue(student);
	}
	
	public void showStudentsInLecture() {
		this.lectureInfos.yoklama.showStudentsInLecture();
	}
	
	public void addStudentToLecture(String numberStudent , String password) {
		Student student = new Student(numberStudent , password);
		this.lectureInfos.yoklama.enQueue(student);
	}

	public ManageLectureInfos() {
		this.lectureInfos.lectures.add("*Data Science");
		this.lectureInfos.lectures.add("*Computer Organization");
		this.lectureInfos.lectures.add("*Computer Networks");
		this.lectureInfos.lectures.add("*Data Structures");
		this.lectureInfos.lectures.add("*Numeric Analysis");
	}
	
}
