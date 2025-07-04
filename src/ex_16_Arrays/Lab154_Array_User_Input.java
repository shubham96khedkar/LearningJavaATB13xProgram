package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Input {
    public static void main(String[] args) {
//HOW TO TAKE USER INPUT AS ARRAY
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size =  sc.nextInt();
//We have taken size because while creating array we require size of that array
//Below line is 2nd way of creating an array

        int[] numbers_marks =  new int[size];

        //        float[] numbers_marks =  new float[size];
        // String[] numbers_marks =  new String[size];

//Here first we have set the marks as  one by one user input at SPECIFIED INDEX NO.i.e numbers_marks[i]
        for (int i = 0; i < numbers_marks.length ; i++) {
            System.out.println("Enter the numbers");
            numbers_marks[i] = sc.nextInt();
        }

        System.out.println(" ---- Below Code is printing the elements! ");
//Below for loop will print the array elements
        for (int i = 0; i < numbers_marks.length ; i++) {
            System.out.println(numbers_marks[i]);
        }
    }
}
