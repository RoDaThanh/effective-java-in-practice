package com.roda.effectivejava.item5_DependencyInjection;

import java.util.Arrays;
import java.util.List;

public class BadExample {
    private static final List<String> dictionary = Arrays.asList("Hello", "world");

    private BadExample() {
    }

    public static boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        return dictionary; // example only bro
    }
}

