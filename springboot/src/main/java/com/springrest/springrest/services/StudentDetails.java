package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Student;

public interface StudentDetails {
	//This is for get all Student Details
	public List<Student> getAllStudentData();
	
	//This is for add Student Details
	public Student addStudentData(Student data);
	
	//This is for update Student Details
	public Student updateStudentData(Student data);
	
	//This is for delete Student Details
	public void deleteStudentData(int Id);
}
