package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {

        int[] marks = {51, 100, 91, 87, 90};
        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
//        System.out.println(marks); //This will print the Reference Address

        Arrays.sort(marks);
//After writing above statement,it will sort the array in ascending order
//and then using a for loop we can print the elements of already sorted array
      //  System.out.println(marks[1]);

       for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
    }
}
