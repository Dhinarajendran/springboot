package com.placement.management.student.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.management.student.service.Entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{

	;

}
