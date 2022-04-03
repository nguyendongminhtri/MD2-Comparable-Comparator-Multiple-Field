package com.company.comparable;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
//    @Override
//    public int compareTo(Student o) {
//        if(this.name == o.name){
//            return 0;
//        } else if(this.name>o.name){
//            return 1;
//        }else {
//            return -1;
//        }




    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
