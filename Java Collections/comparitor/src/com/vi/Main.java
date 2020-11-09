package com.vi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Students> studentsList = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            studentsList.add(new Students(NameGenerator.generateName(), i));
        }
        printList(studentsList);
        Collections.sort(studentsList, Students.nameOder);
        printList(studentsList);
        Collections.sort(studentsList, Students.rollNoOder);
        printList(studentsList);

    }

    private static void printList(List<? extends Students> list) {
        for (Students student : list) {
            System.out.println(student.getName() + " : " + student.getRollNo());
        }
        System.out.println("=============================================");
    }
}
