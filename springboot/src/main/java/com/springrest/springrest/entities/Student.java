package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private String fathername;
	private long mobileno;
	private float marks;
	public long getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Student(int rollno, String name, String fathername, long mobileno, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fathername = fathername;
		this.mobileno = mobileno;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fathername=" + fathername + ", mobileno=" + mobileno
				+ ", marks=" + marks + "]";
	}
	
	
	
}
