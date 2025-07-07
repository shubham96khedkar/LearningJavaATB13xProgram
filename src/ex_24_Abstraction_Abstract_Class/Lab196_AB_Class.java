package ex_24_Abstraction_Abstract_Class;

public class Lab196_AB_Class {
    public static void main(String[] args) {

        WagonR car = new WagonR();
        car.drive();
    }
//In this way by abstraction we have hidden the Engine details inside a separate abstraction class and when we run from main method class
//then we are not able to see the Engine method anywhere but the checkEngine() method is still present inside the abstract Engine class
}

abstract class Engine{

    abstract void startEngine();

    abstract  void stopEngine();

    void checkEngine(){

        System.out.println("Everything is good");
    }
}

class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting the car");
    }

    @Override
    void stopEngine() {
        System.out.println("stopping the car");
    }

    void drive(){
        checkEngine();
        startEngine();
        stopEngine();

    }
}