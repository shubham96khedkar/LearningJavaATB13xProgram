package ex_32_Collection_Framework_DSA.Map;

import java.util.*;

public class Lab262_Real_Example {

    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("name","Diwakar");
        student1.put("phone",9876543210l);
        student1.put("address1","Bangalore");
        student1.put("address2",560021);

        Map<String,Object> student2 = new HashMap();
        student2.put("name","Lukcy");
        student2.put("phone","96789876");
        student2.put("address1","Delhi");
        student2.put("address2",345);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
//From above Code we have stored student1 HashMap and student2 HasshMap in a List(ArrayList)


        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");



    }
}
