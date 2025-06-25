package ex_05_Type_Casting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Implicit Widening Casting

        int a1 = (int)b;// Explicit Widening Casting(We have mentioned externally that the data type of b should be int)
        //We have changed the data type of b from byte to int

    }
}
