package ex_06_Ternary_Operator;

public class Lab068_To_Three_Max {
    public static void main(String[] args) {

    // Find maximum between three numbers
     // Use logic building formula

        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1 > n3 :- n1 is max
        // n2 > n1 and n2 > n3 :- n2 is max
        // else n3 is max

        // Step 3

        int n1 = 15;
        int n2 = 9;
        int n3 = 11;

        int result = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3;
        System.out.println(result);
    }
}
