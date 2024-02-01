package student.repo;



import org.springframework.data.repository.CrudRepository;

import student.model.student;



public interface studrepo extends CrudRepository<student, Integer>
{

	
}
