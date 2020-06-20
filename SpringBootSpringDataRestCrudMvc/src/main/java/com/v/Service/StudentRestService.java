package com.v.Service;

import java.util.List;

import com.v.Domain.Link;
import com.v.Domain.Student;

public interface StudentRestService {
	public List<Student> getList(String Url);
	public Student getStudent(int StudentId,String Url);
	public void deleteStudent(int StudentId,String Url);
	public void save(Student student, String Url);
	public Link getPageLinks(String Url);
	
	
}
