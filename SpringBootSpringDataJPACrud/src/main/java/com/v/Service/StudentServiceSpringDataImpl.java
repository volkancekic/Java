package com.v.Service;

import com.v.Dao.StudentRepository;
import com.v.Domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceSpringDataImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> listAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student get(int studentId) {
        //null durumunda vs önlem gibi
        Optional<Student> std=studentRepository.findById(studentId);
        if(std.isPresent()) {
            return std.get();
        }else{
            throw new RuntimeException("böyle id yoktur.");
        }
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public int delete(int studentId) {
        studentRepository.deleteById(studentId);
        return 1;
    }

    @Override
    public int getStudentCount() {
        return studentRepository.getStudentCount();
    }
}
