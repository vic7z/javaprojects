package com.vi;

public class Main {

    public static void main(String[] args) {

        searchTree tree = new searchTree(null);
        //tree.traverse(tree.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";


        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new NodeList(s));
            tree.traverse(tree.getRoot());
        }
    }
}
