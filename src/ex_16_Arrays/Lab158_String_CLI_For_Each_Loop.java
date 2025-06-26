package ex_16_Arrays;

public class Lab158_String_CLI_For_Each_Loop {

    public static void main(String[] Shubham) {
//At the top go to class name dropdown and click on edit configuration and then give input as it is CLI Input

        for (int i = 0; i < Shubham.length; i++) {
            System.out.println(Shubham[i]);
//args in for loop came from main method as main method is also a array of String Arguments
        }

        System.out.println(" -- ");
//Below is For Each Loop
//In for each loop, Shubham will automatically take and print values one by one(No need of condition and increment)
//Here Shubham is from main method i.e  a variable name containing String elements in array
//Shubham contains--- >>>> 10, Shubham,true
        for(String arg:Shubham){
            System.out.println(arg);
        }
    }
}
