package com.springrest.springrest.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Student;


@Service
public class StudentDetailsImplementation implements StudentDetails{
	
	@Autowired
	StudentDao studentDao;
	
	List<Student> list;

	// get all course
	@Override
	public List<Student> getAllStudentData(){
		return studentDao.findAll();
	}


	//add course
	@Override
	public Student addStudentData(Student data) {
		studentDao.save(data);
		return data;
	}

	//update course
	@Override
	public Student updateStudentData(Student data) {
		studentDao.save(data);
		return data;
	}

	//delete course by id
	@Override
	public void deleteStudentData(int Id) {
		Student entity = studentDao.getOne(Id);
		studentDao.delete(entity);
		
	}
	
	
}
