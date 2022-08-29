package database.teachers;

import java.util.ArrayList;
import Users.Teacher;

public interface DataTeachers {

	ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	boolean search(String userName , String password);
	void add(String userName , String passwoed);
	void delete(String userName , String password);
}
