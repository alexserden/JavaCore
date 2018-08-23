package schildt.chapter18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTutorial {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        for (String s : list) {
            list.add("3");

            System.out.println(s);

        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("1");
        list2.add("1");
        for (String s : list2) {
            System.out.println(s);
            list2.add("3");
        }

    }
}
