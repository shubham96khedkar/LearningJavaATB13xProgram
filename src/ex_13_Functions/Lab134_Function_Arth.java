package ex_13_Functions;


import java.util.Scanner;

public class Lab134_Function_Arth {

    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num 1");
//Now if user types a String instead of number then this is how to handle
        int a = 0;
        if (scanner.hasNextInt()) {
//line 28 and 30 means if this is an integer then only go inside curly brackets and assign the value of a
            a = scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
//            return;
            System.exit(0);
        }

        System.out.println("Enter the num 2");
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
//            return;
            System.exit(0);
        }

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


}

/**
 * Adds two integers.
 *
 * @param a the first integer
 * @param b the second integer
 * @return the sum of a and b
 */
static int sum(int a, int b) {
    return a + b;
}

/**
 * Subtracts the second integer from the first.
 *
 * @param a the first integer
 * @param b the second integer
 * @return the difference of a and b
 */
static int sub(int a, int b) {
    return a - b;
}

/**
 * Divides the first integer by the second.
 *
 * @param a the dividend
 * @param b the divisor
 * @return the quotient of a and b
 */
static int div(int a, int b) {
    //In division, b cannot be zero
    if (b == 0) {
            System.out.println("b can't be zero");
//        throw new ArithmeticException("b can't be zero");
          System.exit(0);

//Line no. 95 and 96 cannot be used together otherwise it will show error
    }
    return a / b;
}

/**
 * Multiplies two integers.
 *
 * @param a the first integer
 * @param b the second integer
 * @return the product of a and b
 */
static int mul(int a, int b) {
    return a * b;
}

// Mod
static int mod(int a, int b) {
    return a % b;
}

}
