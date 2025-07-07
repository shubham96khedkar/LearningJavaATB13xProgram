package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {

        P c1 = new P();
        P c2 = new P();
        System.out.println(P.a);
//In above line we don't require reference of object i.e c1 dot a (c1.a) to access the variable
//We can access a static variable directly by writing class name dot static variable name i.e (P.a)

        c1.a = 12;
//THE VALUE WILL BE COMMON TO EVERYONE IF THE VALUE OF STATIC VARIABLE a IS CHANGED.Same changed value will be common to everyone
        System.out.println(P.a);
        System.out.println(c1.a);
        System.out.println(c2.a);

       // System.out.println(P.b);
         c1.b = 24;
         c2.b =34;
//The value of normal variable b will be different for different reference i.e c1 and c2 because it is not static variable
        System.out.println(c1.b);
        System.out.println(c2.b);
    }

}

class P{

    static int a = 10;
//In above line it is a static variable
//Static variables are loaded at class loader

    int b = 10;
}
