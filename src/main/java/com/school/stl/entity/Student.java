package com.school.stl.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private long Id ;
	 private String Name;
	 private String Phonenumber;
	 private  String Message_for_teacher;
	 private int Leave;
	 private String ClassSection;
	 
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getMessage_for_teacher() {
		return Message_for_teacher;
	}
	public void setMessage_for_teacher(String message_for_teacher) {
		Message_for_teacher = message_for_teacher;
	}
	public int getLeave() {
		return Leave;
	}
	public void setLeave(int leave) {
		Leave = leave;
	}
	public String getClassSection() {
		return ClassSection;
	}
	public void setClassSection(String classSection) {
		ClassSection = classSection;
	}
	public Student(long id, String name, String phonenumber, String message_for_teacher, int leave,
			String classSection) {
		super();
		Id = id;
		Name = name;
		Phonenumber = phonenumber;
		Message_for_teacher = message_for_teacher;
		Leave = leave;
		ClassSection = classSection;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	
	
	

}
