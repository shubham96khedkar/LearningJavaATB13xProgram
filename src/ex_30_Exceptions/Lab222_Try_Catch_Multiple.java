package ex_30_Exceptions;

public class Lab222_Try_Catch_Multiple {

    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("ARE YOU FOOL");
//Multiple catch is also allowed
//But while using multiple catch first catch block should be of a smaller class ex.arithmetic exception
//and the 2nd catch block should be of a bigger class ex. Exception.
//Reverse is not possible.For ex. if first catch block is of bigger class i.e Exception and second catch block is of smaller class i.e arithmetic exception then it will throw error
//Here Exception is a bigger class and arithmetic exception is a smaller class
        }catch (Exception e){
            System.out.println("Are you Fool Too");
        }
//While running the program, it will execute println statement of first catch block only and not of 2nd catch block
        System.out.println("2");
    }
}
