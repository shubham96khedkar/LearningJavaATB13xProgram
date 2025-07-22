package ex_32_Collection_Framework_DSA.List;

import java.util.LinkedList;

public class Lab245_LL {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        //From above line, first element will be Lion as it is addFirst
        animals.addLast("Elephant");
    //From above line, last element will be Lion as it is addLast
        animals.addLast("Elephant");
    //From above line List or LinkedList allows duplicates
        System.out.println("LinkedList: " + animals);

        // Accessing elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        // Removing elements
        animals.removeFirst();
        animals.removeLast();
//addFirst(),addLast(),removeFirst(),removeLast() all these are predefined methods in linkedList which we are using
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());


    }
}
