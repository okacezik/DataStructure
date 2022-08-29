package teacher.operations;

import database.students.ManageDataStudents;
import teacher.informations.ManageLectureInfos;

public class Operations {
	private ManageDataStudents manager;
	private ManageLectureInfos managerLecture;
	
	public Operations(ManageDataStudents manager , ManageLectureInfos managerLecture) {
		this.manager = manager;
		this.managerLecture = managerLecture; 
	}
	
	public void showStudents() {
		this.manager.showStudents();
	}
	
	public void showLecture() {
		this.managerLecture.showLectures();
	}
	
	public void showStudentsInLecture() {
		this.managerLecture.showStudentsInLecture();
	}
}
