package pages;

import java.util.Scanner;

import database.students.ManageDataStudents;
import database.teachers.ManageDataTeachers;
import teacher.informations.ManageLectureInfos;

public class TeacherEntry extends EntryPage{
	
	ManageDataTeachers manager;
	ManageDataStudents managerStudents;
	ManageLectureInfos managerInfos;
	Scanner scanner;
	
	public TeacherEntry(ManageDataTeachers manager , ManageDataStudents managerStudents
			, ManageLectureInfos manageInfos) {
		this.manager = manager;
		this.managerStudents = managerStudents;
		this.scanner = new Scanner(System.in);
		this.managerInfos = manageInfos;
	}
	
	public void entry() {
		String userName;
		String password;
		System.out.println("enter your username : ");
		userName = scanner.nextLine();
		System.out.println("enter your password : ");
		password = scanner.nextLine();
		
		if(this.manager.search(userName, password) == true) {
			int operation;
			System.out.println("entry succesfully...");
			System.out.println("press number 1 class student list...");
			System.out.println("press number 2 student list in the lecture...");
			System.out.println("press number 3 add subject...");
			operation = scanner.nextInt();
			if(operation == 1) {
				this.managerStudents.showStudents();
			}if(operation == 2) {
				this.managerInfos.showStudentsInLecture();
			}if(operation == 3) {
				this.managerInfos.showLectures();
				String lecture;
				System.out.println("choose lecture : ");
				lecture = scanner.nextLine();
				
				if(lecture.equals("Data Science")) {
					String subject;
					System.out.println("subject : ");
					subject = scanner.nextLine(); 
					this.managerInfos.addSubjectDataScience(subject);
				}else if(lecture.equals("Computer Organization")) {
					String subject;
					System.out.println("subject : ");
					subject = scanner.nextLine(); 
					this.managerInfos.addSubjectComputerOrganization(subject);
				}else if(lecture.equals("Computer Networks")) {
					String subject;
					System.out.println("subject : ");
					subject = scanner.nextLine(); 
					this.managerInfos.addSubjectComputerNetworks(subject);
				}else if(lecture.equals("Data Structures")) {
					String subject;
					System.out.println("subject : ");
					subject = scanner.nextLine(); 
					this.managerInfos.addSubjectDataStructers(subject);
				}else {
					String subject;
					System.out.println("subject : ");
					subject = scanner.nextLine(); 
					this.managerInfos.addSubjectNumeric(subject);
				}
			}
		}else {
			System.out.println("invalid username or password...");
			this.entry();
		}
		
	}

}
