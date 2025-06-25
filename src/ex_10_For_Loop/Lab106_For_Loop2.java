package ex_10_For_Loop;

public class Lab106_For_Loop2 {
    public static void main(String[] args) {

        //Can we use long and float
        for (long i = 1L; i < 10; i++) {
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
   //We can use long and float also but it is not advisable to use long and float
        }//Here increment will be by 1 only

    }
}
