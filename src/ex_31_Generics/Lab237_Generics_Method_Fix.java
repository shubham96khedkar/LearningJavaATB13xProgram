package ex_31_Generics;

public class Lab237_Generics_Method_Fix {

    public static void main(String[] args) {
        display(3,4);
        display(3.14,4.45);
        display("pramod","dutta");

    }

    static <T> T display(T a,T b, T c) {
//In previous program we had to create separate methods for different datatypes of a and b variables
//But in this program,we have created a single method using generics which is independent of datatypes or which is suitable for all datatypes for variables a and b
//We just need to follow the syntax of line no.12 or line no.22.We can write any name in place of T.We can write Shubham also in place of T
//So a method can also be generic
        System.out.println(a);
        System.out.println(b);
        return null;
    }


    static <T> void display(T a,T b) {
        System.out.println(a);
        System.out.println(b);
    }
}
