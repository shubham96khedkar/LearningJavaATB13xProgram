package ex_30_Exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab234_Throw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    static void validateAge(int age) throws Exception {
//We can add multiple exceptions besides throws in method name
        if(age < 18){
            throw new Exception("You are a minor, Can't go to GOA!");
//We cannot add multiple exceptions besides throw
        }
    }

}
