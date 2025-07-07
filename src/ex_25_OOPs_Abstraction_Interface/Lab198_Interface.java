package ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.getArea(10, 10);

        Square s1 = new Square();
        s1.getArea(5,5);
//here in the current class we cannot see Polygon(it is hidden) but we can see essential details i.e getArea() to calculate area of square and rectangle
//In this way interface is used to achieve abstraction
    }
}

class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of rectangle " + length * breadth);
    }

}

class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of square " + length * breadth);
    }
}

interface Polygon{

    void getArea(int length, int breadth);//this is a incomplete method getArea();
//IN INTERFACE ALL THE METHODS WILL BE INCOMPLETE OR UNIMPLEMENTED OR WITHOUT BODY
//BUT IN ABSTRACT CLASS WE CAN HAVE BOTH,INCOMPLETE AS WELL AS COMPLETE METHODS OR NORMAL METHODS

   // void complete(){
  //      HERE we cannot create a complete method in interface,if we try to create then it will show error
  //  }
    default void complete(){
//BUT BY USING DEFAULT KEYWORD,WE CAN CREATE COMPLETE METHODS IN INTERFACE
        System.out.println("This is possible");
    }

    static void m1(){
//IN ABOVE LINE, IN INTERFACE WE CAN CREATE COMPLETE METHODS USING STATIC VOID KEYWORDS ALSO
        System.out.println("allowed");
    }

}
