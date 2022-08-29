package database.students;

import java.util.ArrayList;
import Users.Student;

public interface DataStudents {

	ArrayList<Student> students = new ArrayList<Student>();
	boolean search(String studentNumber , String password);
	void add(String studentNumber , String password);
	void delete(String userNumber , String password);
}
