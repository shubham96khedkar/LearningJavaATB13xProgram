package ex_06_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {
        //args[0] means 18 will be stored in args in main method and its datatype is String[]
        //int age = args[0];//Not allowed because datatype of args is String[]
        String age_String = args[0];
        System.out.println(age_String);
        int age = Integer.parseInt(age_String);
        //Converted String to integer using Integer.parseInt(variable);
        //because we want age in int in line no.15
        System.out.println(age);

       // int age1= 45;
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
