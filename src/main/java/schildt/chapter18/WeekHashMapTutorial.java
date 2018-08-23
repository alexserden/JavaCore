package schildt.chapter18;


import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMapTutorial {
    public static void main(String[] args) {
//        Map<Date,String> map = new WeakHashMap<>();
//        Date data = new Date();
//        map.put(data,"information");
//        data = null;
//        System.gc();
//        for (int i = 0; i < 10000 ; i++) {
//            if(map.isEmpty()){
//                System.out.println(i);
//                System.out.println("Empty!");
//                break;
//            }
//        }
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        for (String s : list) {
            System.out.println(s);
            list.add("3");
        }

    }
}
