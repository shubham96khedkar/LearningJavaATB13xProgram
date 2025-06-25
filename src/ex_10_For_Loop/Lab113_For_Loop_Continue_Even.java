package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even {
    public static void main(String[] args) {
        //Print odd numbers from 1 to 50
        for (int i = 0; i <= 50; i++) { // 0 to 50, 51 Times
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd ->" + i);
        }
    }
}
