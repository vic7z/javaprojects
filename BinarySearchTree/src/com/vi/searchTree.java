package com.vi;

import org.jetbrains.annotations.NotNull;

public class searchTree implements Node {
    private item root = null;

    public searchTree(item root) {
        this.root = root;
    }

    @Override
    public item getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(item NewItem) {

        if (this.root == null) {
            this.root = NewItem;
            return true;
        } else {
            item currentItem = this.root;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(NewItem);
                if (comparison < 0) {
                    if (currentItem.rightChild() != null) {
                        currentItem = currentItem.rightChild();
                    } else {
                        currentItem.setRight(NewItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    if (currentItem.leftChild() != null) {
                        currentItem = currentItem.leftChild();
                    } else {
                        currentItem.setLeft(NewItem);
                        return true;
                    }
                } else {
                    System.out.println(((String) NewItem.getValue()) + " Item already exist");
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(item RemoveItem) {
        if (RemoveItem != null) {
            System.out.println("Removed item" + RemoveItem.getValue());
            item currentItem = this.root;
            item parentItem = currentItem;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(RemoveItem);
                if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.rightChild();
                } else if (comparison > 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.leftChild();
                } else {
                    Remove(currentItem, parentItem);
                    return true;
                }
            }
        }
        return false;

    }

    private void Remove(@NotNull item RemovingItem, item parentItem) {
        if (RemovingItem.rightChild() == null) {
            if (parentItem.rightChild() == RemovingItem) {
                parentItem.setRight(RemovingItem.leftChild());
            } else if (parentItem.leftChild() == RemovingItem) {
                parentItem.setLeft(RemovingItem.leftChild());
            } else {
                this.root = RemovingItem.leftChild();
            }
        } else if (RemovingItem.leftChild() == null) {
            if (parentItem.rightChild() == RemovingItem) {
                parentItem.setRight(RemovingItem.rightChild());
            } else if (parentItem.leftChild() == RemovingItem) {
                parentItem.setLeft(RemovingItem.rightChild());
            } else {
                this.root = RemovingItem.rightChild();
            }
        } else {
            item currentItem = RemovingItem.leftChild();
            item parent = RemovingItem;
            while (currentItem.leftChild() != null) {
                parent = currentItem;
                currentItem = currentItem.leftChild();
            }
            if (parent == RemovingItem) {
                RemovingItem.setValue(currentItem.getValue());
            } else {
                parent.setLeft(currentItem.rightChild());
            }
        }
    }

    @Override
    public void traverse(item root) {
        if (root != null) {
            traverse(root.leftChild());
            System.out.println(root.getValue());
            traverse(root.rightChild());
        }
    }
}
