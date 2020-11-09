package com.vi;

public class Main {

    public static void main(String[] args) {
        Admin vi = new Admin("vic", "312");
        Student student = new Student("vic", "435", "CSE", new Address("gg", "test", 238719));
        vi.addStudent(student);
        vi.updateFee(student, 1200, 100);
        vi.printList();


    }
}
