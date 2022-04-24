package tnsif.c2tc.b09.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.b09.Entity.Student;
import tnsif.c2tc.b09.Repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo sr;

	@Override
	public void addStudent(Student s) {
		sr.save(s);
		
	}

	@Override
	public int deleteStudent(int id) {
		Student s=sr.findById(id).get();
		sr.delete(s);
		return 1;
	}

	@Override
	public Student updateStudent(Student s) {
		Student student=sr.save(s);
		return student;
	}

	@Override
	public Student getStudent(int id) {
		Student s=sr.findById(id).get();
		return s;
	}

	@Override
	public List<Student> getStudents() {
		 List<Student> list=sr.findAll();
		
		return list;
		
	}

}
