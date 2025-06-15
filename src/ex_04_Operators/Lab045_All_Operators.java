package ex_04_Operators;

public class Lab045_All_Operators {
    public static void main(String[] args) {
        boolean b1 = true;
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Arithmetic Operators
        // +,-,%,/,*

        // Relational Operators
        // > , < , >= <=, !, != , == (compare two value)

        // Logical Operators
        //  OR or and , || , && , !

        // Optional to learn - Digital Electronics
        // Bitwise Operator - Not important for Automation
        //
        // ~ - Bitwise Not,
        // >> - Right shift,
        // << Left Shift,
        // ^ - XOR

        // Compound assignment Operator
        //  // +=, -=, /=, *=
        int age = 10;
        age /= 10; // age = age / 10 >>>>>>1(10/10)
        age += 10; // age = age + 10 >>>>>11(1+10)
        age -= 10; // age = age - 10>>>>>>1(11-10)
        // Updated value or latest value of age will be taken
        System.out.println(age);

        // ++,-- - Increment and Decrement Operator
        // Ternary Operator
    }
}
