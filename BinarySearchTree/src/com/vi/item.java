package com.vi;

public abstract class item {
    protected item leftNode = null;
    protected item rightNode = null;
    protected Object value;

    public item(Object value) {
        this.value = value;
    }

    abstract item leftChild();

    abstract item setLeft(item item);

    abstract item rightChild();

    abstract item setRight(item item);

    abstract int compareTo(item item);

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
