package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab241_List_I {

    public static void main(String[] args) {
       // List l = new ArrayList(); // Dynamic Dispatch
    // Because ArrayList implements List
        ArrayList l = new ArrayList();
        l.add("hello");
    // l.add will add the element at the end of the list
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
    //Advantages of List
    // 1. No need to mention the size
    // 2. We can use any datatype as in above lines
    }
}
