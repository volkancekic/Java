package com.v.Dao;

import com.v.Domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import java.util.List;
@Repository("JpaImpl")
public class StudentDaoImplJpa implements StudentDao{

    @Autowired
    private EntityManager entityManager;
    // *** JPA KULLANDIK ***

    @Override
    public List<Student> queryAll() {
        return entityManager.createQuery("from Student",Student.class).getResultList();
    }

    @Override
    public Student queryById(int studentId) {
        return entityManager.find(Student.class,studentId);
    }

    @Override
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public int delete(int studentId) {
        Student student=queryById(studentId);
        entityManager.remove(student);
        return 1;
    }
}
