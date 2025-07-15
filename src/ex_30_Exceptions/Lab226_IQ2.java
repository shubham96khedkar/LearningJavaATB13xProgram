package ex_30_Exceptions;

public class Lab226_IQ2 {

    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c; //Only Vulnerable Code that should be inside try block
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
//Always first catch block should be of specific exception or smaller class(ArithmeticException) and 2nd catch block should be of larger class (Exception)
//But if we don't know that exactly which specific exception will come then we can directly go with larger class in first catch block
        }
    }
}
