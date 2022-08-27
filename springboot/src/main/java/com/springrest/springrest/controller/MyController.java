package com.springrest.springrest.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Student;
import com.springrest.springrest.services.StudentDetails;


@RestController
public class MyController {

	@Autowired
	private StudentDetails studentDetails;
	

	//get the student details
	@GetMapping("/studentdata")
	public List<Student>getAllStudentData(){
		return this.studentDetails.getAllStudentData();
		
	}
	
	// add student details
	@PostMapping("/studentdata")
	public Student addStudentData(@RequestBody Student data) {
		return this.studentDetails.addStudentData(data);
	}
	
	//Update student details
	@PutMapping("/studentdata")
	public Student updateStudentData(@RequestBody Student data) {
		return this.studentDetails.updateStudentData(data);
	}
	
	//delete student details
	@DeleteMapping("/studentdata/{Id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String Id){
		try {
			this.studentDetails.deleteStudentData(Integer.parseInt(Id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
