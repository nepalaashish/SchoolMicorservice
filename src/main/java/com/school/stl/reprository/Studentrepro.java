package com.school.stl.reprository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.stl.entity.Student;


@Repository
public interface Studentrepro extends CrudRepository<Student, Long> 
{
	

}
