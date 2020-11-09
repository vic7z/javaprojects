package com.vi;

public class Main {

    public static void main(String[] args) {
        ListSorter ln = new ListSorter();
        ln.add(12);
        ln.add(1);
        ln.add(213);
        ln.add(33);
        ln.add(34);
        ln.printList();
        System.out.println("=====================================");
        ln.sorList();
        ln.printList();
    }
}
