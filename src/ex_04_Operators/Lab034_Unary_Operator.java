package ex_04_Operators;

public class Lab034_Unary_Operator {
    public static void main(String[] args) {
        //Unary Operator
        int a = +10;
        // Here + is Unary Operator
        // + is optional
        System.out.println(a);

        int a1 = -110;
        //Here - is Unary Operator
        // -(minus) is not optional
        int result = a+a1;

        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);

        int b = -1;
        b = b+1;
        System.out.println(b);

    }
}
