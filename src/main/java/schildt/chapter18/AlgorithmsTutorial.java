package schildt.chapter18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AlgorithmsTutorial {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-6);
        list.add(-7);
        list.add(9);
        //создать компаратор с обратным упоряд
        Comparator<Integer> r = Collections.reverseOrder();
        //отсортировать с помощью компаратора
        Collections.sort(list,r);
        for(int i : list){
            System.out.println(i);
        }
        //перетасовать список
        Collections.shuffle(list);
        for(int i : list){
            System.out.println(i);
        }
    }
}
