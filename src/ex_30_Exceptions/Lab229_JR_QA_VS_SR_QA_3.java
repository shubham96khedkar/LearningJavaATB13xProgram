package ex_30_Exceptions;

public class Lab229_JR_QA_VS_SR_QA_3 {

    public static void main(String[] args) {

        // Sr. QA
        //this is how to handle exceptions using try catch block
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
