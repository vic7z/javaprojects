package com.vi;

public class elements implements Comparable<elements> {
    private final String id;

    public elements(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(elements elements) {
        return this.id.compareToIgnoreCase(elements.id);
    }
}
