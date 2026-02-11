package com.roda.effectivejava.item02_builder;

public class Main {
    public static void main(String[] args) {
        BadExample badExample = new BadExample(10, 12, 13, 0, 15, 0);

        //This client code is easy to write and, more importantly, easy to read
        GoodExample goodExample = new GoodExample.Builder(1, 3)
                .sodium(15).build();
    }
}
