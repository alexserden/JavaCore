package schildt.chapter18;

import java.util.LinkedHashSet;

public class LinkedHashSetTutorial {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Gamma");
        hs.add("Omega");
        hs.add("Epsilon");
        hs.add("Eta");
        System.out.println(hs);
        hs.stream().forEach(x-> System.out.println(x));
    }
}
