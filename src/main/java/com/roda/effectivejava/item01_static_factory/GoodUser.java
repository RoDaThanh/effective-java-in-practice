package com.roda.effectivejava.item01_static_factory;

/**
 * Sometimes is bad when there is more than one constructor with so many params
 */
public class BadUser {
    private String name;
    private String first;
    private String last;
    private String old;

    public BadUser(String name, String first, String last, String old) {
        this.name = name;
        this.first = first;
        this.last = last;
        this.old = old;
    }

    public BadUser(String name, String first) {
        this.name = name;
        this.first = first;
    }
}
