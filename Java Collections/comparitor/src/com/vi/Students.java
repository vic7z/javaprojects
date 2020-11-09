package com.vi;

import java.util.Comparator;

public class Students {
    private String name;
    private int rollNo;

    static final Comparator<Students> nameOder;
    static final Comparator<Students> rollNoOder;

    static {
        rollNoOder = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if (o1.rollNo < o2.rollNo) {
                    return -1;
                } else if (o1.rollNo > o2.rollNo) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        nameOder = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.name.compareToIgnoreCase(o2.name);
            }
        };
    }

    public Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
