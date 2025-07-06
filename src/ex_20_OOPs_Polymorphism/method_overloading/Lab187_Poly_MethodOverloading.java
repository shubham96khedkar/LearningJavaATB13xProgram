package ex_20_OOPs_Polymorphism.method_overloading;

public class Lab187_Poly_MethodOverloading {

    public static void main(String[] args) {

        MathOperations m1 = new MathOperations();
        int r1  = m1.add(3,4);
        int r2  = m1.add(3,4,6);
        double r3  = m1.add(3.14,4.56);
        String r4  = m1.add("pramod","dutta");



    }
}

class MathOperations{
    //This is method overloading
    // In the same class, When you have a method wit same name
    // Same name methods but different arguments and different return type.
//In the compile time only we will see that which method we are going to use based on the parameters
//This is why method overloading is also called as compile time polymorphism
    int add(int a, int b){
        return a+b;
    }

    int add(int a,int b, int c){
        return a+b+c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

}
