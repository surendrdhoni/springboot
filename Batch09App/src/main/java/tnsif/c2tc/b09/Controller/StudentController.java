package tnsif.c2tc.b09.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.b09.Entity.Student;
import tnsif.c2tc.b09.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	@RequestMapping("/addStudent")
	public void addStudent(@RequestBody Student s)
	{
		service.addStudent(s);
	}
	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable int id)
	{
		return service.getStudent(id);
	}
	@GetMapping("/getStudents")
	public List<Student> getStudents()
	{
		return service.getStudents();
	}
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student s)
	{
		return service.updateStudent(s);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public int deleteStudent(@PathVariable int id)
	{
		return service.deleteStudent(id);
	}

}
