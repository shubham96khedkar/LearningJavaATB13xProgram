package ex_18_OOPs_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

//Default value of name, model and year will be printed
//CONSTRUCTOR SHOULD BE CALLED INSIDE MAIN METHOD ONLY

        c1.name = "Tesla";
        //If we write the value by ourself then that value will be printed in c1.name
        System.out.println(c1.name);

        System.out.println(c2.name);
//In above line, default value will be printed because we did not assign value in main method in c2.name

        c2.name = "Audi";
        System.out.println(c2.name);

        Baby1 b1=new Baby1();
       // b1.name = "Nivisha";
        System.out.println(b1.name);
    }
}

class Car{

    String name;
    int year;
    String model;


    //DC means DEFAULT CONSTRUCTOR
    Car(){
        name = "Unknown Car";
        year = 1996;
        model = "XXX";

    }
}
    class Baby1{
    String name;

    Baby1(){
        name = "Gugu";
    }
}