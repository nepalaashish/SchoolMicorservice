package com.school.stl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.stl.entity.Student;
import com.school.stl.reprository.Studentrepro;

@Service
public class Studentservice {

	@Autowired
	public Studentrepro studentrepo;

	public Student getallstudent(Long Id) {

		return studentrepo.findById(Id).get();
	}

	public List<Student> getallstudent() {
		List<Student> list = (List<Student>) this.studentrepo.findAll();
		return list;
	}

	public void updatestudent(Long Id, Student student) {
		studentrepo.save(student);

	}

	public void deletestudent(Long Id) {
		studentrepo.deleteById(Id);

	}

	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

}
