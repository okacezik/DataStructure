package pages;

import java.util.Scanner;

import database.students.ManageDataStudents;
import database.teachers.ManageDataTeachers;
import student.OperationsStudent;
import teacher.informations.ManageLectureInfos;

public class EntryPage {

	public static void main(String[] args) {
		
		
		ManageDataStudents manageDataStudents = new ManageDataStudents();
		ManageDataTeachers manageDataTeachers = new ManageDataTeachers();
		ManageLectureInfos managerInfos = new ManageLectureInfos();
		OperationsStudent operationsStudents = new OperationsStudent();
		StudentEntry entryStudent = new StudentEntry(manageDataStudents , managerInfos , operationsStudents);
		TeacherEntry entryTeacher = new TeacherEntry(manageDataTeachers , manageDataStudents , managerInfos);  
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��RENC� B�LG� S�STEM�NE HO�GELD�N�Z");
		System.out.println("��renci giri�i i�in --> 1");
		System.out.println("akademisyen giri�i i�in --> 2");
		int secim = scanner.nextInt();
		
		if(secim == 1) {
			entryStudent.entry();
		}else if(secim == 2) {
			entryTeacher.entry();
		}else {
			System.out.println("hatal� i�lem numaras� girdiniz...");
		}
		
		
		
	}

}
