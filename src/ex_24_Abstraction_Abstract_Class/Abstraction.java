package ex_24_Abstraction_Abstract_Class;

public class Abstraction {
    public static void main(String[] args) {

        Car c1 = new Car();
     //   Father f1 = new Father();
//In above line we cannot create object of class Father because class Father is an abstract class
//We cannot create object of abstract class
        Child child = new Child();
        Father f2 = new Child();
//Above line is valid because of dynamic dispatch

         child.loan50k();
    }

}

class Car {

    void done() {

    }
//This Car class is a concrete class as this class does not contain any abstract method
  }
 abstract class Father{

   abstract void loan50k();
//In above line there is abstract function or method as it does not have any method body i.e curly brackets{}
//In a class even if there is a single abstract method then that class must be abstract class
   void loan25k(){
       System.out.println("Given 35k");
   }
 }

 class Child extends Father{

    @Override
     void loan50k() {
        System.out.println("Child has to give 50k loan");
//If any concrete  class or normal class extends any abstract class then the abstract method from thet abstract class must be completed or implemented by giving curly brackets as method body
     }
 }