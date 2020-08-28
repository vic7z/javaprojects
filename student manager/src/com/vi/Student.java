package com.vi;


import java.util.Comparator;

public class Student {
    private String name;
    private final String id;
    private final String course;
    private Address address;

    public static final Comparator<Student> nameOder=new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };

    public Student(String name, String id, String classNo, Address address) {
        this.name = name;
        this.id = id;
        this.course = classNo;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equal called");
      if(obj instanceof Student){
          if(this.id==((Student) obj).id){
              return true;
          }
      }
          return false;

    }

    public String getAddress() {
        return address.toString();
    }
    public double getPhone(){
        return address.getContactNo();
    }


}
