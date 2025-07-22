package ex_32_Collection_Framework_DSA.Set;

import java.util.*;

public class Lab255_HS_LHS_TS {

    public static void main(String[] args) {
    //Hash Set,Linked Hash Set and Tree Set
        Set<String> hs = new HashSet();
        //Hash Set uses Hashing mechanism to store the element
        //In HashSet no order maintained
        // no duplicates are allowed in HashSet
        // Every element example e1 -> is given a hashcode (xyz), e2 -> hashcode -> abc


        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        // hs.add(123);
        hs.add(null);
//        hs.add(null);

        System.out.println(hs);

        for (String s : hs){
//Above line is Enhanced for loop
            System.out.println(s);
        }
        System.out.println(" ---------------------------");

        // Iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ---------------------------");


        Set lhs = new LinkedHashSet();
        //LinkedHashSet stores the element as LinkedList stores
        //In LinkedHashSet order will maintained,but duplicates are not allowed
//If we want to maintain the order of data which user is entering then we will use LinkedHashSet
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println(" ---------------------------");

        Set ts = new TreeSet();
        //In TreeSet Black and Red Tree mechanism to store the element.
        //In TreeSet order will maintain, Natural Sorting is done.
        //In TreeSet Natural Sorting is done based on ASCII values.
//TreeSet requires similar datatypes so that it can be sorted
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        //ts.add(123);
//TreeSet does not allow different datatypes because for sorting purpose the datatypes of elements must be similar
        // ts.add(null);
    //Null is not allowed in TreeSet because null cannot be sorted

        System.out.println(ts);

        System.out.println(" ----- For Each ---- ");

        for(Object o:ts){
    //Above line is For each loop
            System.out.println(o);
        }


    }
}
