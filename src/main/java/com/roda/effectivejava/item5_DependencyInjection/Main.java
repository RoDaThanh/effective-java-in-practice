package com.roda.effectivejava.item5_DependencyInjection;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // the use of bad example
        // Stick or tie up with one dictionary only
        System.out.println(BadExample.isValid("thanh"));


        // enhance testability and flexibility of the class
        List<String> enDictionary = Arrays.asList("Hello", "world");
        GoodExample enChecking = new GoodExample(enDictionary);
        System.out.println(enChecking.isValid("thanh"));

        List<String> vnDictionary = Arrays.asList("Thanh", "dep", "trai");
        GoodExample vnChecking = new GoodExample(vnDictionary);
        System.out.println(vnChecking.isValid("thanh"));
    }
}
