package tnsif.c2tc.b09.Service;

import java.util.List;

import tnsif.c2tc.b09.Entity.Student;

public interface StudentService {

	public void addStudent(Student s);
	public int deleteStudent(int uid);
	public Student updateStudent(Student s);
	public Student getStudent(int id);
	public List<Student> getStudents();
	

}
