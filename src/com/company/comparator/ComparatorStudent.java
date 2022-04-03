package com.company.comparator;

import com.company.comparable.Student;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
       int i = o2.getAge() - o1.getAge();
        System.out.println("i age= "+i);
       if(i!=0){
           return i;
       }
        i = o2.getName().compareTo(o1.getName());
        System.out.println("i name -----> "+i);
       return i;
    }
}
