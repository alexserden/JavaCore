package schildt.chapter18;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //добавить пару в Map, если ее там нет
        if (map.get("name") == null)
            map.put("name", "Gus");
        //Java 8
        map.putIfAbsent("name","Alexander");
    }
}
