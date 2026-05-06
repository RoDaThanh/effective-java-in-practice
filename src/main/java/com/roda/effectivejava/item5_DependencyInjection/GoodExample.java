package com.roda.effectivejava.item5_DependencyInjection;

import java.util.List;

public class GoodExample {
    private List<String> dictionary;

    // Constructor DI
    public GoodExample(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary; // example only bro
    }
}

