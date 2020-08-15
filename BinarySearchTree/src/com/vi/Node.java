package com.vi;

public interface Node {
    item getRoot();
    boolean addItem(item item);
    boolean removeItem(item item);
    void traverse(item root);
}
