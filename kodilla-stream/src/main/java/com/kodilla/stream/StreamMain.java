package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ambroży", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Ambroży", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Ambroży", text -> text.replaceFirst("A", "B"));
        poemBeautifier.beautify("Ambroży", text -> text.substring(3));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
