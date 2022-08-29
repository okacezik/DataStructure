package pages;

import java.util.Scanner;

import database.students.ManageDataStudents;
import student.OperationsStudent;
import teacher.informations.ManageLectureInfos;

public class StudentEntry extends EntryPage{
	
	ManageDataStudents manager;
	ManageLectureInfos managerLecture;
	OperationsStudent managerStudents;
	Scanner scanner;
	
	public StudentEntry(ManageDataStudents manager , ManageLectureInfos managerLecture
			,OperationsStudent managerStudents) {
		this.manager = manager;
		this.managerLecture = managerLecture;
		this.managerStudents = managerStudents;
		scanner = new Scanner(System.in);
	}
	
	public void entry() {
		String studentNumber;
		String password;
		System.out.println("enter student number : ");
		studentNumber = scanner.nextLine();
		System.out.println("enter password : ");
		password = scanner.nextLine();
		
		if(this.manager.search(studentNumber, password)) {
			int operation;
			System.out.println("entry succesfully...");		
			this.managerLecture.showLectures();
			System.out.println("press number 1 for subjects of numeric analysis...");
			System.out.println("press number 2 for subjects of data structures...");
			System.out.println("press number 3 for subjects of computer networks...");
			System.out.println("press number 4 for subjects of computer organization...");
			System.out.println("press number 5 for subjects of data science...");
			System.out.println("choose operation number...");
			operation = scanner.nextInt();
			
			switch(operation) {
				case 1 : this.managerStudents.showSubjectNumeric();
				break;
				case 2 : this.managerStudents.showSubjectDataStructers();
				break;
				case 3 : this.managerStudents.showSubjectComputerNetworks();
				break;
				case 4 : this.managerStudents.showSubjectComputerOrganization();
				break;
				case 5 : this.managerStudents.showSubjectDataScience();
				break;
			}
			
		}else {
			System.out.println("invalid student number or password...");
			this.entry();
		}
		
	}
}
