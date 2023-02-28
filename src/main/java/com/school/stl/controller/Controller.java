package com.school.stl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.stl.entity.Student;
import com.school.stl.service.Studentservice;


@CrossOrigin("*")
@RestController
public class Controller {

	@Autowired
	private Studentservice studeservice;

	@GetMapping("/Getallstudent")
	public List<Student> getallstudent() {

		return studeservice.getallstudent();
	}

	@GetMapping("/GetstudentbyID/{Id}")
	public Student getallstudent(@PathVariable Long Id) {

		return studeservice.getallstudent(Id);
	}

	@PostMapping("/Student")
	public Student adddstudent(@RequestBody Student student) {

		Student p = studeservice.save(student);
		return p;
	}

	@PutMapping("/Student/{Id}")
	public void updatestudent(@PathVariable("Id") Long Id, @RequestBody Student student) {
		studeservice.updatestudent(Id, student);
	}
	
	@DeleteMapping("/student/{Id}")
	public void deletestudent(@PathVariable("Id") Long Id) {
		studeservice.deletestudent(Id);
	}

}
