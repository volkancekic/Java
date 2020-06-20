package com.v.Service;

import com.v.Domain.Student;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    //database yok localde kullanıyoruz
    List<Student> studentList;

    @PostConstruct
    public void fillStudentList(){
        studentList=new ArrayList<Student>();
        studentList.add(new Student(1,"Ali","CAN"));
        studentList.add(new Student(2,"Veli","YILMAZ"));
        studentList.add(new Student(3,"Murat","YILDIZ"));
        studentList.add(new Student(4,"Selim","YILDIRIM"));
        studentList.add(new Student(5,"Ayşe","BAYRAK"));
        studentList.add(new Student(6,"Aylin","YILMAZ"));
    }

    @Override
    public List<Student> listAll() {
        return studentList;
    }

    @Override
    public Student get(int studentId) {

        for (Student std:studentList){
            if(std.getId()==studentId){
                return std;
            }
        }
        return null;
    }

    @Override
    public void saveOrUpdate(Student student) {
        delete(student.getId()); //Update ise eskisi silinir.
        studentList.add(student);
    }

    @Override
    public int delete(int studentId) {
        for (Student std:studentList){
            if(std.getId()==studentId){
                studentList.remove(std);
                return 1;
            }
        }
        return 0;
    }
}
