package ex_04_Operators;

public class Lab047_Instance_Of_Operator {
    public static void main(String[] args) {
        String s1 = new String("Rohit");
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object); // Because Object is parent of all the classes
       // System.out.println(s1 instanceof Integer);
    }
}
