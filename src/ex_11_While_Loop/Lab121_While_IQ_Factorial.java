package ex_11_While_Loop;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {

        // Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the number!");
        if(!scanner.hasNextInt()){
     //line no.11 means if the user enters input which is not an integer then go inside the curly  brackets
            System.out.println("Enter the int you fool!");
            return;
     //Here return will directly exit the program
     //We cannot use break here because break is used only with loops(for loop) and not with statement
        }

        int number = scanner.nextInt();

        long factorial = 1;



        if(number < 0){
            System.out.println("Negative Factorial is not allowed!");
            return;
        }


        if(number <=0){
            System.out.println(factorial);
        }else{
            // Calculate the factorial
            for (int i = 1; i <= number ; i++) {
                factorial = factorial*i;
            }
        }

        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial

    }
}
