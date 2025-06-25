package ex_06_Ternary_Operator;

public class Lab065_TO {
    public static void main(String[] args) {
        //Find max.no.between two numbers
        int x = 10;
        int y = 20;
        // System.out.println(Math.max(x,y));

        int maximum = x > y ? x : y;
        System.out.println(maximum);
    }
}
