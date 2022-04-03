package com.company;

import com.company.comparator.ComparatorStudent;
import com.company.quese.MyLinkedListQueue;
import com.company.service.IStudentService;
import com.company.service.StudentServiceIMPL;
import com.company.stack.MyGenericStack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("List Student chua sắp xếp: ");
        IStudentService studentService = new StudentServiceIMPL();
        System.out.println(studentService.findAll());
        System.out.println("Sau khi sắp xếp: ");
        ComparatorStudent comparatorStudent = new ComparatorStudent();
        Collections.sort(StudentServiceIMPL.studentList,comparatorStudent);
//        Collections.sort(StudentServiceIMPL.studentList);
        System.out.println(StudentServiceIMPL.studentList);
        String str1 = "b";
        String str2 = "a";
        System.out.println("TEST COMPATO -----> "+ str1.compareTo(str2) );
    }


    private static void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

}
