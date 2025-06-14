package ex_02_Java_Basics2;

public class LabExample1 {

    int i;
    static int s;
   // Here i is instance variable and s is static variable as they are not local variable
    //and are declared in class .
    //So both i and s will have default value as zero

    public static void main(String[] args) {
        int a = 10;
        {
            int b = 10;
            System.out.println(b);
            //Value of b=10 will be limited only in {} these brackets.
            //Once we assign b=90 outside these brackets ,now the value of b will be the new one that is 90
        }
        int b = 90;
        System.out.println(b);
    }
}
