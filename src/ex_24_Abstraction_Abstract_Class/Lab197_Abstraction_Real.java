package ex_24_Abstraction_Abstract_Class;

public class Lab197_Abstraction_Real {
    public static void main(String[] args) {

        //Employee e1 = new Employee();
//In above line we cannot create object of employee class

        Company c1 = new Company();
        c1.computePay();
//In this way we have called abstract method computePay() from abstract class

    }
}
    class Company extends Employee {

        @Override
        double computePay() {
            return 1000;
        }
    }

    abstract class Employee {

        private String name;
        private String address;
        private int number;
//We have kept all the variables private because because of encapsulation

        Employee() {
//In above line we have created a default constructor
            System.out.println("DC");
        }

        Employee(String name, String address, int number) {
//Above line is a parametrised constructor
            System.out.println("Constructing an Employee");
            this.name = name;
            this.address = address;
            this.number = number;
        }

        abstract double computePay();

        void mailCheck() {

            System.out.println("Mailing a check to " + this.name + " " + this.address);
        }

    }

