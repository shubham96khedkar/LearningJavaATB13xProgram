package ex_29_Wrapper_Class;

public class Lab214_Wrapper_Conversion {

    public static void main(String[] args) {
    //This is how to convert primitive datatype to wrapper class
        int a= 10;
        Integer b = a; // This is caleed as Boxing which means automatically JVM will store the value
        // Primitive datatype to wrapper class conversion is called as -> AutoBoxing
//After converting into wrapper class, now variable b has attribute and behaviours
        System.out.println(b.intValue()); // Behav
        System.out.println(Integer.MIN_VALUE); // Behav

//Below is how to convert wrapper class to primitive datatype
        Integer a2 = 42;
        int v = a2; //converting wrapper class to primitive datatype is called as Unboxing -> wrapper is removed, attribute, behaviour is lost.
        //variable b does not have any attribute and behaviour
        System.out.println(v);
    }
}
