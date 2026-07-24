package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream_API {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("bharath");
        al.add("bittu");
        al.add("Kumar");

        al.stream()
                .filter(str -> str.startsWith("b"))
                .map(str -> str + "*")
                .collect(Collectors.toList());
    }
}
