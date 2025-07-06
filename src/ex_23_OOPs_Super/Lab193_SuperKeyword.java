package ex_23_OOPs_Super;

public class Lab193_SuperKeyword {

    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}


class Vehicle {
    public int maxSpeed = 180;

    Vehicle() {
//Above line is default Constructor
        System.out.println("Default C");
    }

    Vehicle(int a) {
//Above line is parametrised Constructor
        System.out.println("Param Con");
        System.out.println("Param Con" + a);
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(int a) {
//line no.27,32 and 36 is method overloading
        System.out.println("Type 2");
    }

    void message() {
        System.out.println("Type 1");
    }

    int message(String a) {
        System.out.println("Type 4");
        return 0;
    }


    void display() {
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle {
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
//line no.50 and 55 is by generating getter and setter
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car() {
//Above line is default constructor
        super(); // calling parents default.In Car extends vehicle,Vehicle is parent class.so here super() keyword will call parent class(Vehicle class) default constructor i.e Vehycle();
    }

    Car(int a) {
//Above line is parametrised constructor
       // super(10);// parent's parameterized call.Here super(10) will call the parent class parametrised constructor i.e Vehicle(int a);
        this();//Here if this(); will call current class constructor i.e Car();
    }

    @Override
    void display() {
//Above line is method overriding
        System.out.println(super.maxSpeed); //  instance variable call.Here (super.maxSpeed); will call parent class that is vehicle class maxSpeed
        System.out.println(this.maxSpeed); // This means my variable call.Here (this.maxSpeed) will call current class i.e Car class maxSpeed
        System.out.println("Hi Override!");
    }

}
