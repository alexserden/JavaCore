package schildt.chapter18;

import java.util.LinkedList;

public class LinkedListTutorial {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1,"A2");
        linkedList.stream().forEach(x-> System.out.println(x));
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("Содержимое списка после удаления ");
        linkedList.stream().forEach(x-> System.out.println(x));
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Содержимое списка после удаления ");
        linkedList.stream().forEach(x-> System.out.println(x));
        String value = linkedList.get(2);
        linkedList.set(Integer.valueOf(2),value+" change");
        linkedList.stream().forEach(x-> System.out.println(x));
    }
}
