package ex_02_Java_Basics2;

public class Lab022_Local_Variable {
    public static void main(String[] args) {
        int a = 10;
        byte b = 10;
        short s = 10;
        long l = 9876543210L;
        float f = 3.14F;
        double d = 67.8987654567;
        boolean b1 = true;
        char c = 'A';
     //Life or value of a local variable will be only within the brackets of that method

        //Below is an Interview Question
        int local;
       // System.out.println(local);
        //here we cannot print local because for local variable the jvm does not set any default value
        //We have to assign the value to the local variable

        //Default value is only assigned if it is not a local variable
    }
}
