package com.vi;

public class NodeList extends item {

    public NodeList(Object value) {
        super(value);
    }

    @Override
    item leftChild() {
        return this.leftNode;
    }

    @Override
    int compareTo(item item) {
        if (item != null) {
            return (((String) this.getValue()).compareTo((String) item.getValue()));
        } else {
            return -1;
        }
    }

    @Override
    item setLeft(item item) {
        this.leftNode = item;
        return this.leftNode;
    }

    @Override
    item rightChild() {
        return this.rightNode;
    }

    @Override
    item setRight(item item) {
        this.rightNode = item;
        return this.rightNode;
    }


}
