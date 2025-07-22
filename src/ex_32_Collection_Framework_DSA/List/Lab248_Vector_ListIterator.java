package ex_32_Collection_Framework_DSA.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        ListIterator listIterator  = vector.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
//From line no.17 to 23, ListIterator can go till there is next element and previous element both
//Till previous element means reverse
//Remember that ListIterator is only available for List
//List has ArrayList,LinkedList.Vector and Stack

        System.out.println(" --- ");

        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
// From line no.30 to 32, Iterator can go till there is next element.
//Iterator cannot go till there is previous element



    }
}
