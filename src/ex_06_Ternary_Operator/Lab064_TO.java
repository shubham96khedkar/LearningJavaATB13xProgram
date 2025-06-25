package ex_06_Ternary_Operator;

public class Lab064_TO {
    public static void main(String[] args) {

        //Find min.no.between two numbers
        int x = 10;
        int y = 20;
       // System.out.println(Math.min(x,y));

        int minimum = x < y ? x : y;
        System.out.println(minimum);
    }
}
