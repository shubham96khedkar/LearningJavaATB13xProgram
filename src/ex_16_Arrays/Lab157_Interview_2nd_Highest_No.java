package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_2nd_Highest_No {
    public static void main(String[] args) {

        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);
        // You find it without using the sort function.
    }
}
