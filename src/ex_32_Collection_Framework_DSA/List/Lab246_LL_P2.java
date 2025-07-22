package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL_P2 {

    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format -We have Continuous memory in ArrayList

        List mylist2 = new LinkedList(); //LinkedList is stored in Doubly Linked List.
//In LinkedList we have random memory
        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Dutta"));
        System.out.println(mylist2.indexOf("Dutta"));
        System.out.println(mylist2.get(0));

        System.out.println(" --- ");

//Below code is printing elements using Iterator
        Iterator iterator =  mylist2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
