package schildt.chapter18;

import java.util.ArrayDeque;

public class ArrayDequeTutorial {
    public static void main(String[] args) {
        ArrayDeque<String> adg = new ArrayDeque<>();
        adg.push("A");
        adg.push("B");
        adg.push("D");
        adg.push("E");
        adg.push("F");
        System.out.println("извлечение из стека: ");
        while (adg.peek() != null) System.out.println(adg.pop()+" ");


    }
}
