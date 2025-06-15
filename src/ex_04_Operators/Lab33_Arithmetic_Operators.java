package ex_04_Operators;

public class Lab33_Arithmetic_Operators {
    public static void main(String[] args) {
        // Arithmetic Operators are
        // + (Addition)
        // - (Subtraction)
        // * (Multiplication)
        // / (Division)
        // % (Modulus) returns remainder

        int a = 20;
        int b = 3;
        float c = 3.0f;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // As a and b are int so this will return integer
        System.out.println(a / c);
       //Here a is int but c is float so this will return float or decimal value as float is bigger than integer

        System.out.println("a + b");
        System.out.println(a + b);
    }
}
