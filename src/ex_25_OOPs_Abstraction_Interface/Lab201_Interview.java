package ex_25_OOPs_Abstraction_Interface;

public class Lab201_Interview {


}

interface I11{
 //Above name of interface is valid

}

interface I12{


}

class A1{

}
class B1{

}

abstract class Pramod{

    abstract void pp();
}

class Test1 extends A1{

}
//class Test1 extends A1,B1 {
  //Above line is not valid because multiple inheritance is not possible in java through classes
//}

class Test3 implements I11{
    //above line is valid
}

class Test4 implements I11,I12{
    //Above line is possible
}

class Test5 extends A1 implements I11,I12{
    //NOTE THAT ABOVE LONE IS ALSO POSSIBLE
}

// class Test6 implements I11 extends A1{
//ABOVE LINE IS NOT POSSIBLE BECAUSE FIRST THERE SHOULD BE EXTENDS AND THEN IMPLEMENTS
// }

//interface I8 extends A1{
    //ABOVE LINE IS NOT POSSIBLE BECAUSE INTERFACE CANNOT EXTEND ANYTHING
// }

interface I4{
   // void concrete(){
 //In above line concrete or normal function is not possible in interface
    //}

    default void m2(){
 //default void method in interface is possible
 //Multiple default void method in interface is also possible
    }

    static void m1(){
//static void method in interface is possible
    }
}