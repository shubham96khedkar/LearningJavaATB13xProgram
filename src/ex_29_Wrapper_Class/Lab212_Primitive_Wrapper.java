package ex_29_Wrapper_Class;

public class Lab212_Primitive_Wrapper {

    public static void main(String[] args) {
        int a = 10; // Here int is primitive datatype

        // This is not Object
        // It will not have attribute or Behaviour

        // char, short, byte, long, float, double, - we will avoid them now


        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float

        Integer age = 65;
//In above line Integer is a wrapper class
//Advantage of using wrapper class is that we can use different functions using wrapper class as listed below

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());

    }
}
