package schildt.chapter18;

import java.util.LinkedList;

public class SafeObjectsTutorial {

    static class Address{
        private String name ;
        private String street;
        private String city ;
        private String state;
        private String code ;

        public Address(String name, String street, String city, String state, String code) {
            this.name = name;
            this.street = street;
            this.city = city;
            this.state = state;
            this.code = code;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "name='" + name + '\'' +
                    ", street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", code='" + code + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<Address>();
        addresses.add(new Address ( "J.W.West" , "11OakAve " ,
                " Urbana" , "IL" , "б1801" ) ) ;
    for (Address a : addresses){
        System.out.println(a+"\n");
        System.out.println();
    }
    }

}
