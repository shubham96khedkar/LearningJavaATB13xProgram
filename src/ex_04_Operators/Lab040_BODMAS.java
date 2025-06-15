package ex_04_Operators;

public class Lab040_BODMAS {
    public static void main(String[] args) {
        System.out.println((9 * 3 / 9 + 1) * 3);
        //According to bodmas rule first it will solve the brackets
        //9 * 3 = 27
        //27 / 9= 3
        // 3 + 1 = 4
        // 4 * 3 = 12
    }
}
