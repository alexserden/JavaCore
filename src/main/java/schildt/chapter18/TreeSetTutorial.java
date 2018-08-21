package schildt.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTutorial {
    public static void main(String[] args) {
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("C");
//        treeSet.add("A");
//        treeSet.add("B");
//        treeSet.add("E");
//        treeSet.add("F");
//        treeSet.add("D");
//        treeSet.subSet("C","F").stream().forEach(x-> System.out.println(x));
        PersonComparator comparator = new PersonComparator();
        TreeSet<Person> people = new TreeSet<Person>(comparator); //передаем компоратор в конструктор по которому будет реализована новая логика сравнения
        people.add(new Person("B"));
        people.add(new Person("A"));
        people.add(new Person("C"));
        people.stream().forEach(x-> System.out.println(x.getName()));

        Comparator<Human> humanComparator = new HumanNameComparator().thenComparing(new HumanAgeComparator());
        TreeSet<Human> set = new TreeSet<>(humanComparator);
        set.add(new Human("Alexander",27));
        set.add(new Human("Evgenie",35));
        set.add(new Human("Alexander",32));
        set.add(new Human("Danil",23));
        set.stream().forEach(x-> System.out.println(x.getName()+" --- "+x.getAge()));

    }
    static class Person implements Comparable<Person>{
        private String name;


        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Person o) {

            return getName().length()-o.getName().length(); // сравнивание по длинне строки
            //return getName().compareTo(o.getName()) ;     // использование compareTo for String
        }

    }
    static class PersonComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    static class Human{
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    static class HumanNameComparator implements Comparator<Human>{
        @Override
        public int compare(Human o1, Human o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    static class HumanAgeComparator implements Comparator<Human> {
        @Override
        public int compare(Human o1, Human o2) {
              if(o1.getAge()>o2.getAge()) return 1;
              if(o1.getAge()<o2.getAge()) return -1;
              return 0;
        }


    }
}
