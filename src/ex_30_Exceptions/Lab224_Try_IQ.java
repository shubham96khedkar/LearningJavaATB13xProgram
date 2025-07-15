package ex_30_Exceptions;

public class Lab224_Try_IQ {

    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arth Error");
//only single line pipe character will be used as OR
// In above code,we can also combine 2 try catch blocks into a single one
        }catch (Exception e){
            System.out.println("Yes");
        }
        System.out.println("End");
    }
}
