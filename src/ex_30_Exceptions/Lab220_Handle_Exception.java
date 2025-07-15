package ex_30_Exceptions;

public class Lab220_Handle_Exception {

    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;// java.lang.ArithmeticException
//For applying try catch block in intellij first select the line which has problem.(Even if there is commented part in the line of problem then select that commented part also while selecting the line of problem)
//For example select line no. 8 as line of problem(select commented part also)
//Then click on surround.Then click on try catch.
//Below line no.13, we can write our own println statement also
        } catch (Exception e) {
//Catch block will be executed only if there is problem in try block.
//If try block does not have any problem then catch block will not be executed
            System.out.println("Divide by zero is not allowed");
        }
        System.out.println(a);

        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.
    }
}
