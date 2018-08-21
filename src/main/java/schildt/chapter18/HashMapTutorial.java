package schildt.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTutorial {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        //добавить пару в Map, если ее там нет
//        if (map.get("name") == null)
//            map.put("name", "Gus");
        //Java 8
//        map.putIfAbsent("name","Alexander");
        map.put("1","Alex");
        map.put("2","Tolik");
        map.put("3","Koly");
        map.put("4","Ivan");
        map.put("5","Kiril");
        map.put("6","Igor");
        map.put("7","Evgenie");
        // получить множество записей
        Set<Map.Entry<String,String>> set = map.entrySet();
        //вывести множество записей
        for (Map.Entry<String,String> me : set){
            System.out.println("key "+me.getKey());
            System.out.println("value"+me.getValue());
        }
    }
}
