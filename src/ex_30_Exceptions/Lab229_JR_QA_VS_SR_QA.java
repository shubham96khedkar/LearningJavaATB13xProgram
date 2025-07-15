package ex_30_Exceptions;

public class Lab229_JR_QA_VS_SR_QA {

    public static void main(String[] args) {

        //This is how a junior QA will write code
        String ip = null; // java.lang.ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        int b = 0; // ArithmeticException
        try {
            b = 100 / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
