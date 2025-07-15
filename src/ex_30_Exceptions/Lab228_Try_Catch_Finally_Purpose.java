package ex_30_Exceptions;

import java.util.Scanner;

public class Lab228_Try_Catch_Finally_Purpose {

    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter the v");
        int v = sc.nextInt();
        try {
            int b= 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("end of program , sc closed!");
//For closing the scanner at the end of program,we will put sc.close() in finally block which will always be executed
        }

    }
}
