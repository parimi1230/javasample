package collections.map;

import java.util.HashMap;

public class HashMapSample {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("1", "Raju");
        map.put("2", "Naresh");
        map.put("3", "Pradeep");
        map.put("4", "Test1");
        map.put("5", "Test2");
        map.put("7", "Test5");
        map.put("3", "check");

        System.out.println(map.get("2"));

        System.out.println("Before removing"+map);
        map.remove("4");
        System.out.println("After Removing"+map);

    }

}
