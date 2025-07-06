package ex_20_OOPs_Polymorphism.method_overriding;

public class Lab189_MOverriding {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();
//Method overriding example.It is also called as run time polymorphism
//At run time when object is getting created,we are deciding which method we are going to call
//The class of which thw object is made that class method will be called.
//If sound() method is not present is Dog class only then the sound() method of Animal class will be called otherwise not
    }
}

class Animal{
//Overriding will take place only when there are 2 different classes and method name is same
//and METHOD OVERLOADING will take place in same class
    void sound(){
        System.out.println("Default Sound!");
    }

    void A(){}
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark!!");
//line no.19 and 29 is method overriding
    }

    void methodOverLoad(){
//line no.34 and 38 is method overloading
    }

    void methodOverLoad(int a){

    }

}

