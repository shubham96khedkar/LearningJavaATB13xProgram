package ex_05_Type_Casting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
      //  byte b = val;//Implicit narrowing casting is not possible because here we
        //did not mention externally

      byte b1 = (byte)val;//Explicit narrowing is possible only when we externally mention that
        // the datatype of val should be byte and there will also be DATA LOSS.
        //here we have changed the data type of val from int to byte

        System.out.println(b1);

    }
}
