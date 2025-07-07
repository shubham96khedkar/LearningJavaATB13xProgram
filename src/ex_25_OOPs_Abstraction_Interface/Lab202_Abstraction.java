package ex_25_OOPs_Abstraction_Interface;

public class Lab202_Abstraction {

}

abstract class Incomplete_Abstract{

    int a = 10;
//IN ABOVE LINE,IN ABSTRACT CLASS,IT IS NOT A FINAL VARIABLE.IT IS JUST A NORMAL VARIABLE.

    Incomplete_Abstract(){
 //In above line, WE CAN CREATE CONSTRUCTOR IN ABSTRACT CLASSES

    }

    abstract void display();
    void display2(){
        a=35;//value of a is changed to 35 which means in line no.9 , a is not a final variable
        System.out.println("print");
    }
}

interface Incomplete_Interface{
    int a = 10;
//In above line ,IT IS A FINAL VARIABLE.FINAL VARIABLE MEANS IT'S VALUE CANNOT BE CHANGED

 //   Incomplete_Interface(){
//IN ABOVE LINE WE CANNOT CREATE CONSTRUCTOR IN INTERFACE
   // }

    void display();

     default void display2(){
//         a = 23;
//IN INTERFACE WE CANNOT CHANGE THE VALUE OF A VARIABLE WHICH MEANS THAT VARIABLE IN INTERFACE IS FINAL IN NATURE.
//IF WE TRY TO CHANGE THE VALUE OF VARIABLE IN INTERFACE THEN IT WILL SHOE ERROR
         System.out.println("default is allowed ");
     }

     static void display3(){
         System.out.println("static is allowed");
     }

}