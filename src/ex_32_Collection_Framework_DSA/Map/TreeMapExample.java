package ex_32_Collection_Framework_DSA.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Creating TreeMap
        Map<String, Integer> values = new TreeMap();
        // Insert elements (note the order)
        values.put("Second", 2);
        values.put("First", 1);
        values.put("Third", 3);
//In output TreeMap will sort the keys in ascending order
        System.out.println("TreeMap (sorted by keys): " + values);

        // Replacing values
        values.replace("First", 11);
//From above line we can also replace the values in TreeMap
        values.replace("Second", 22);


        System.out.println("After replacement: " + values);

        // Remove element
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
//From above 2 lines we can also remove any key and its value using its key name
        System.out.println("Final map: " + values);


    }
}
