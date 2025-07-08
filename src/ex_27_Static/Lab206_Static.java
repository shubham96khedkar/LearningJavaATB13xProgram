package ex_27_Static;

public class Lab206_Static {

    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(11);
        System.out.println(ref1.a);
        System.out.println(A.b);
        System.out.println(ref2.a);

        System.out.println(ref1.b);
        System.out.println(ref2.b);
//In above 2 lines the value of static variable for both the references(ref1,ref2) will be same i.e 20

        ref1.displayValue();
        ref2.displayValue();

        A.staticMethod();


    }

}

class A{
    int a; //a is  non static(non static means if static is not written) - instance variable
    static int b = 20; //b is static which means b is commonly shared between objects

    A(int a){
//Above line is a parametric constructor
        this.a = a;
    }

    void displayValue(){
//Above line is a non Static method or a normal method
        System.out.println(this.a);
        System.out.println(b); // static variable b is already set when class A is loaded.Therefore b can be accessed
    }

    static void staticMethod(){
//Above line is a static method.It will be called when class is loaded
        System.out.println("I will be called when class is loaded");
//        System.out.println(this.a); //Static Methods cannot access non-static variables in a static method
//because as soon as the class A is loaded then first of all static variable b value will be set and static method will be called but non static variable 'a' or normal variable 'a' is not set till now, variable 'a' value will be set after creating object in line no. 6 & 7 and
//this is why non-static variable will not be accessed by static method
    }

}
