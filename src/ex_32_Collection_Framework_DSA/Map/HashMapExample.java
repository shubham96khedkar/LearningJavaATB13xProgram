package ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap();
//From above line Key will be String and value will be Integer
        vehicles.put("MG Astor",1);
//put is used to add values in HashMap
//From above line MG Astor is key and 1 is the value
        vehicles.put("i10",2);
        vehicles.put("Honda ACTIVA",1);
        vehicles.put("BMW",2);
        vehicles.put("TESLA",5);
        vehicles.put("TESLA",10);
//From above line if there is duplicate key in HashMap then it will show only the repeated key one time(not twice) and the value corresponding to that key will be the updated or latest one
//        vehicles.put(234,"dasda");
        System.out.println("Total Vehicles : "+ vehicles.size());
//From above line vehicles.size() will give no.of keys(as keys are unique) and not no.of values

        //Below is how to Iterate over the Map
        //Using for loop

        for(String key : vehicles.keySet()){
//From above line vehicles.keySet() will give a set of all keys in HashMap
            System.out.println(key + " -> "+vehicles.get(key));
//From above line,key will give the key and vehicles.get(key) will give the value corresponding to that key
        }


        // Checking if key exists using containsKey("name of key")
        if(vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        // Clearing the map using .clear()
        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());



    }
}
