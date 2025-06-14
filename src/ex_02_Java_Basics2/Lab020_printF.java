package ex_02_Java_Basics2;

public class Lab020_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("print command will print in same line or without new line");
        System.out.println("Hello World");
        System.out.print("This will print in new line");

        //It will go in reverse way from line no.6

        System.out.println(a);
        System.out.printf("Your variable name is %d",a);
      //Here %d will be repla ed by a
        // %d ->if a is int, byte, long, short, - data type
        // %s ->if a is String
        // %f ->if a is float, double,
        // %b ->if a is boolean

        int b = 20;
        System.out.println("----------");
        System.out.printf("%d + %d",a,b);
       //1st %d will be replaced by a and 2nd %d will be replaced by b
        //It will show 10+20 in console as it is in double quotes



    }
}
