package student;

import core.Queue;
import core.Stack;
import teacher.informations.LectureInfos;

public class OperationsStudent implements LectureInfos {

	private LectureInfos lectureInfos;
	
	public OperationsStudent() {
		
		Stack lectures = new Stack(); //dersler(isimleri) burada tutuluyor
		Stack numericAnalysis = new Stack(); //this stack contains numeric's subjects
		Stack dataStructers = new Stack(); 
		Stack computersNetworks = new Stack();
		Stack dataScience = new Stack();
		Stack computerOrganization = new Stack();
		Queue yoklama = new Queue(); //derste bulunan öðrenciler için
		
	}
	
	
	public OperationsStudent(LectureInfos lectureInfos) {
		this.lectureInfos = lectureInfos;
	}
	
	public void showLecture() {
		this.lectureInfos.lectures.showData();
	}
	
	public void showSubjectDataScience() {
		this.lectureInfos.dataScience.showData();
	}
	
	public void showSubjectNumeric() {
		this.lectureInfos.numericAnalysis.showData();
	}
	
	public void showSubjectComputerNetworks() {
		this.lectureInfos.computersNetworks.showData();
	}
	
	public void showSubjectComputerOrganization() {
		this.lectureInfos.computerOrganization.showData();
	}
	
	public void showSubjectDataStructers() {
		this.lectureInfos.dataStructers.showData();
	}
	
}
