package schildt.chapter18;

import java.util.TreeSet;

public class TreeSetTutorial {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");
        treeSet.subSet("C","F").stream().forEach(x-> System.out.println(x));
    }
}
