package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scanner.next();
        System.out.println(s);
        //Here if we enter any number then also it is ok

        System.out.println("Enter the integer");
        int i = scanner.nextInt();
        System.out.println(i);
        //But here if we enter String then it will throw error because it is expecting integer as input

        System.out.println("Enter the double");
        double d = scanner.nextDouble();
        System.out.println(d);

    }
}
