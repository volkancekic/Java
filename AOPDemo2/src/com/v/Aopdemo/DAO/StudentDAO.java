package com.v.Aopdemo.DAO;

import org.springframework.stereotype.Repository;

import com.v.Aopdemo.Entity.Student;

@Repository
public class StudentDAO {
	public void addStudent(Student s) {
		System.out.println("addStudent called.");
	}
	public void deleteStudent(Student s) {
		System.out.println("deleteStudent called.");
	}
	public Student queryStudent(Student s) {
		System.out.println("queryStudent called.");
		return new Student();
	}
}
