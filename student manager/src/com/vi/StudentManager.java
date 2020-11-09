package com.vi;

import java.util.*;

public abstract class StudentManager {
    private List<Student> studentList;
    private Map<Student, Accounts> AccountDetails;
    private Accounts accounts;

    public StudentManager() {
        studentList = new ArrayList<>();
        AccountDetails = new HashMap<>();
    }

    public boolean addStudent(Student student) {
        if (findStudent(student) != null) {
            return false;
        } else {
            studentList.add(student);
            AccountDetails.put(student, new Accounts());
            return true;
        }
    }

    private Student findStudent(Student student) {
        Student std = null;
        for (Student sn : this.studentList) {
            if (sn.equals(student)) {
                std = sn;
                break;
            }
        }
        return std;
    }

    public boolean removeStudent(Student student) {
        if (findStudent(student) != null) {
            this.AccountDetails.remove(student);
            this.studentList.remove(student);
            return true;
        }
        return false;
    }

    public boolean updateFee(Student student, double tutionFee, double specialFee) {
        if (findStudent(student) != null) {
            Accounts accounts = AccountDetails.get(student);
            accounts.setSpecialFee(specialFee);
            accounts.setTutionFee(tutionFee);
            return true;
        } else {
            return false;
        }

    }


    public void printList() {
        System.out.println("Name\t|Student id |\tCourse\t|    Address\t|Contact no\t| pending fees");
        Collections.sort(this.studentList, Student.nameOder);
        for (Student sn : this.studentList) {
            System.out.println(sn.getName() + " |\t" + sn.getId() + "\t    |    " + sn.getCourse() + "\t|" + sn.getAddress() + "\t|" + sn.getPhone() + "\t| " + (AccountDetails.get(sn).getTutionFee() + AccountDetails.get(sn).getSpecialFee()));
        }
    }

    public ArrayList<Student> getStudentList() {
        return (ArrayList<Student>) Collections.unmodifiableList(this.studentList);
    }


}
