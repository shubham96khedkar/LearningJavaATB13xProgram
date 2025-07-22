package ex_32_Collection_Framework_DSA.List;

import java.util.Stack;

public class Lab252_Stack {

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("python");
        s1.add("c#");
        s1.add("Java");



        System.out.println(s1);
        System.out.println(s1.peek());
//From above line peek means to see from top.So Peek will give the last element added in stack(Here Java)
//ex. Stack means stack of books or String or Integer
        System.out.println(s1.pop());
//From above line,pop will remove the last element from the stack
        System.out.println(s1);

        // Create Integer type stack
        Stack<Integer> intStack = new Stack<>();
//From above line,if we mention the datatype then Stack will store the elements of that particular datatype only

        // Create String type stack
        Stack<String> stringStack = new Stack<>();


        intStack.push(23);
//From above line, push will add the element at the top of stack
//Just as in List we had add,same way in Stack we have push
        intStack.push(43);
        intStack.push(53);
        intStack.add(3);
        System.out.println(intStack);

    }
}
