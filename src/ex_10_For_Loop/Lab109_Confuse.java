package ex_10_For_Loop;

public class Lab109_Confuse {
    public static void main(String[] args) {
        //When to start from i=0 and i=1
        //        for(int i=0;i<=10;i++) { // 0 to 10, 11 times
        for (int i = 0; i < 10; i++) { // 0 to 9, 10 times
            System.out.println(i);
            //Generally 1st case is preferred
        }

        for (int i = 1; i <= 10; i++) { // 1 to 10, 10 times
            System.out.println(i);
        }
    }
}
