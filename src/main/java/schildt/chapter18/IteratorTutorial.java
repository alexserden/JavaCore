package schildt.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class IteratorTutorial {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasPrevious()){
            String element = listIterator.next();
            System.out.println(element);
        }
         ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        //вызвать метод tryAdvance() для вывода содержимого
        //писочного массива vals
        System.out.println("Содержимое массива "+"\n");
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance(n-> System.out.println()));
        System.out.println();

    }
}
