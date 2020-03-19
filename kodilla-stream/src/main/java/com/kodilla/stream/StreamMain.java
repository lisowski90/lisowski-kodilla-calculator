package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ambroży", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Ambroży", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Ambroży", text -> text.replaceFirst("A", "B"));
        poemBeautifier.beautify("Ambroży", text -> text.substring(3));
    }
}
