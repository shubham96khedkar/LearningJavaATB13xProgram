package ex_25_OOPs_Abstraction_Interface;

public class Lab199_Car_Practical_Interface {

    public static void main(String[] args) {

        Car1 tesla = new Car1();
        tesla.drive();

    }
}

class Car1 implements Engine1,Brakes{
//From above line,multiple inheritance is possible through interface

    void drive(){
        startEngine();
        applyBrake();
        stopEngine();

    }


    @Override
    public void applyBrake() {
        System.out.println("Apply brake");
    }

    @Override
    public void startEngine() {
        System.out.println("start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop engine");
    }

    @Override
    public void money() {
        System.out.println("Son has to earn by itself");
    }
}


interface Brakes{

    void applyBrake();
//In above line even if we don't write abstract before void applyBrake(); then also it is ok because in interface it is by default abstract

    void money();
}

interface Engine1{

    void startEngine();

    void money();

    void stopEngine();

    default void completeF1(){
        System.out.println("Default complete Function");
    }
}