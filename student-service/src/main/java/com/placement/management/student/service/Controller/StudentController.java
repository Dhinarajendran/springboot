package com.placement.management.student.service.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.placement.management.student.service.Entity.Student;
import com.placement.management.student.service.Repository.StudentRepository;



@RestController
public class StudentController {
@Autowired
StudentRepository repo;
@PostMapping ("/student")
public Student addStudent(@RequestBody Student r) {
	return repo.save(r);
}
@GetMapping("/student")
public List<Student> getStudent(){
	return repo.findAll();
}
@GetMapping("/student/{id}")
public Student getstd(@PathVariable long id) {
	return repo.findById(id).get();
}
@DeleteMapping("/student/{id}")
public void delete(@PathVariable long id) {
	repo.deleteById(id);
}
@PutMapping("/student/{id}")
 public Student updateStudent(@PathVariable long id, @RequestBody Student r)
	{
		r.setId(id);
		return repo.save(r);
	}  
}

