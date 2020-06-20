package com.v.Service;

import com.v.Dao.StudentDao;
import com.v.Domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    @Qualifier("JpaImpl")
    private StudentDao studentDao;

    @Transactional
    @Override
    public List<Student> listAll() {
        return studentDao.queryAll();
    }

    @Override
    public Student get(int studentId) {
        return studentDao.queryById(studentId);
    }
    @Transactional
    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }
    @Transactional
    @Override
    public int delete(int studentId) {
        return studentDao.delete(studentId);
    }
}
