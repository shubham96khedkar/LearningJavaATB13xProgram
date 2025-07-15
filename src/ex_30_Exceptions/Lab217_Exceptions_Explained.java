package ex_30_Exceptions;

public class Lab217_Exceptions_Explained {

    public static void main(String[] args) {
        System.out.println("Starting the program!");
        String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
// if we don't pass any input in line no.7,then it will show ArrayIndexOutOfBoundsException in above line

        Integer a = Integer.parseInt(input_user);// java.lang.NumberFormatException
// if we put String in line no.7,then it will show number format exception in above line

        Integer output = 100/a; // java.lang.ArithmeticException: / by zero
// if we put 0 as input in line no.7,then it will show ArithmeticException in above line
        System.out.println(output);
        System.out.println("End of the program!");

        // divide by zero -> ?

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
    }
}
