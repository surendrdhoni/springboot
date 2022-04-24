package tnsif.c2tc.b09.Repo;



import org.springframework.data.jpa.repository.JpaRepository;


import tnsif.c2tc.b09.Entity.Student;

public interface StudentRepo extends
                             //CrudRepository<Student, Integer> {
                             JpaRepository<Student, Integer>{
	
	

}
