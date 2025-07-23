package ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab260_Map_P1 {

    public static void main(String[] args) {
//        Map m1 = new Map();
//From above line since Map is an interface and therefore we cannot create object of interface
        Map m1 = new HashMap(20);
        // Map is key and value pair
        // name -> pramod
        m1.put("name","pramod");
        m1.put("rollno",1);
        m1.put("phone",987654321);
//In HashMap there is unordered collection of data
//        m1.put(34,90);
        System.out.println(m1);



        Map m2 = new LinkedHashMap();
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);
//In LinkedHashMap there is ordered collection of data in output

        Map m3 = new TreeMap();
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno",1);
        m3.put("phone",987654321);
//After printing output of TreeMap we can see that it will sort the keys in ascending order in output
        System.out.println(m3);




    }
}
