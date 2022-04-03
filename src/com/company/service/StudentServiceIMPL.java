package com.company.service;

import com.company.comparable.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"Long",27));
        studentList.add(new Student(2,"Tây",21));
        studentList.add(new Student(4,"Kiên",28));
        studentList.add(new Student(3,"Huệ",28));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {

    }
}
