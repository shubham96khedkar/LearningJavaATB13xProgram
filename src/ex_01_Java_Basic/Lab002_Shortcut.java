package ex_01_Java_Basic;

public class Lab002_Shortcut {
    public static void main(String[] args) {
        System.out.println("Hello Test");
        main(new int[] {});
    }


    //public static void main(String[] args) {
    //}
    //we cannot have 2 main methods with same datatype


    public static void main(int[] args) {
        System.out.println("code done");
    }
}