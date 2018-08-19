package schildt.chapter18;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTutorial {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println("Содержымое массива");
        list.stream().forEach(x -> System.out.println(x));
        Integer[] mas = new Integer[list.size()];
        mas = list.toArray(mas);
        System.out.println(mas);
        Arrays.stream(mas).forEach(x-> System.out.println(x));
    }
}
