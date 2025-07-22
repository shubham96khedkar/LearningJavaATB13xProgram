package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab243_AL {

    public static void main(String[] args) {
//        List list = new ArrayList();
//From above line, if we don't mention the length(not size) of arraylist then by default the size is 10
        List list = new ArrayList(10);
    //From above line we can also mention the capacity of arraylist as 10 or 20 or any number
        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3");  //3
        list.add(4);  //4
        list.add(true);  //5
        list.add("3"); // 6


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));

        System.out.println(list.indexOf("3"));
        // From above line indexOf will return index of the first occurrence of the specified element in this list,

        System.out.println(list.lastIndexOf("3"));

        System.out.println(list);
        System.out.println(" -----------");

        for (int i = 0; i < list.size(); i++) {
    //Printing elements using for loop
            System.out.println(list.get(i));
        }

        System.out.println(" -----------");

        for (Object o: list){
        //Above line is for each loop
            System.out.println(o);
        }

        list.set(1,25);
    //from above line list.set will set the value as 25 at index 1
        System.out.println(list);

        list.remove(0);  // Remove element at index 0

        System.out.println(list);

        list.clear();
        System.out.println(list);


    }
}
