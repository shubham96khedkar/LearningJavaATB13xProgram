package ex_05_Type_Casting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
      //USE OF TYPE CASTING
       //int a = 8408896545;// here max. value of int is crossing the limit of int
        //so we can store this in long

        long a1 = 8408896545L;
        //Now I need to convert this phone no. into short data type
        //short b = a;// Implicit narrowing is not possible
        short b1 = (short)a1;//Explicit narrowing casting is possible
        //So we have converted the phone no.from long to short datatype
    }
}
