package com.v.Dao;

import com.v.Domain.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> queryAll();
    public Student queryById(int studentId);
    public Student save(Student student);
    public int delete(int studentId);
}
