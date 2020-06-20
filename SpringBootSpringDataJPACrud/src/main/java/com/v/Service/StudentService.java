package com.v.Service;

import com.v.Domain.Student;

import java.util.List;

public interface StudentService {
    public List<Student> listAll();
    public Student get(int studentId);
    public Student save(Student student);
    public int delete(int studentId);
    public int getStudentCount();


}
