package ex_26_IIB;

public class Lab203_IIB {
    // ```
    //IIB
    //Instance initialization Block == IIB
    //IIB will be executed whenever Object is created.
    //```
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
//If we create 2 objects as in above lines then IIB block will also be called twice
//First the static block will be called then IIB block will be called and then the constructor will be called
//Static block will not be called 2 times even if we create 2 objects because class will be loaded one time only when the object is created
    }
}

class A{
    A(){
//This is a default constructor
        System.out.println("DC");
    }
    {
     //This is called as the IIB block which is just curly brackets{} without anything
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection can be called using IIB
        // reading a csv, xlsx file can be called using IIB
        // reading json, xml. can be called using IIB
        // reading a text file or env file can be called using IIB

    }

    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }
    static {
        System.out.println("Static");
    }
}