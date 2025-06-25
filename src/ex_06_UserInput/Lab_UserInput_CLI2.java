package ex_06_UserInput;

public class Lab_UserInput_CLI2 {
    public static void main(String[] args) {

        //System.out.println(args[0]);//java.lang.arrayIndexOutOfBoundsException
        //Because we have not set any value first
        System.out.println(args[0]);//This is after setting the value from dropdown then edit configurations
        System.out.println(args[1]);
        //We can pass multiple parameters also using spacebar
        System.out.println(args[2]);
       // System.out.println(args[3]);//java.lang.arrayIndexOutOfBoundsException
    }
}
