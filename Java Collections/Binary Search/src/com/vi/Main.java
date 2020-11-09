package com.vi;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<elements> list = new LinkedList<>();
        elements id = new elements(Integer.toString(6));
        for (int i = 0; i <= 10; i++) {
            list.add(new elements(Integer.toString(i)));
        }
        int found = Collections.binarySearch(list, id, null);
        System.out.println(found);
    }
}
