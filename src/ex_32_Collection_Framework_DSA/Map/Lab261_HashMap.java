package ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab261_HashMap {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id6",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,102);
        map.put(null,103);

        System.out.println(map);
        System.out.println(map.size());
//For 2 duplicate keys it will count as one key only and that also it will consider the latest one
//null values are allowed and for key only 1 null key is allowed.If we enter another null key then it will take the latest one
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());
//map.keySet() will give all the keys in HashMap
        System.out.println(map.values());
//map.values() will give all the values in HashMap

        System.out.println(map.get("id3"));
//map.get("id3") will give value corresponding to that key in HashMap
        System.out.println(map.remove("id3"));
//map.remove("id3") will remove that specific key and also remove value corresponding to that key
        System.out.println(map);


    }
}
