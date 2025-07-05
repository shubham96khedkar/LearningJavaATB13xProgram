package ex_19_OOPs_Inheritance;

public class Lab180_Inheritance {

    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
//Above 2 lines are valid because of inheritance i.e Son extends Father
//i.e Son can use variables and methods from Father class
        s1.bhk3();
    }

}

class Father{
    int gold_f  = 1000; // Attribute | Data variables |  Property | Instance Variables

    void bhk2() { //  Behaviour |  Method | Function | Data members
        System.out.println("Father - 2BHK");
    }

}

class Son extends Father{

    //int gold_f  = 1000; // Attribute | Data variables |  Property | Instance Variables

    //void bhk2() { //  Behaviour |  Method | Function | Data members
      //  System.out.println("Father - 2BHK");

    void bhk3(){
        System.out.println("3BHK Son");

    }
    }





