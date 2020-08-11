package com.vi;

public class Node extends  item {

    public Node(Object value) {
        super(value);
    }

    @Override
    item left() {
        return this.leftNode;
    }

    @Override
    item setLeft(item item) {
        this.leftNode=item;
        return this.leftNode;
    }

    @Override
    item right() {
        return this.rightNode;
    }

    @Override
    item setRight(item item) {
        return null;
    }

    @Override
    public void setValue(Object value) {
        super.setValue(value);
    }
}
