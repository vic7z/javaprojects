package com.vi;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListSorter {
    private LinkedList<Integer> linkedList;


    public ListSorter() {

        linkedList = new LinkedList<>();
    }

    public void add(int number) {
        linkedList.add(number);
    }

    public void printList() {
        Iterator<Integer> i = linkedList.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }
    }

    public void sorList() {
        linkedList.sort(Comparator.naturalOrder());
    }
}
