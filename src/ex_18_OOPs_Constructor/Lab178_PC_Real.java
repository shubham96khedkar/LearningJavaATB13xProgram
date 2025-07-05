package ex_18_OOPs_Constructor;

import java.sql.SQLOutput;

public class Lab178_PC_Real {

    public static void main(String[] args) {
        Person p1 = new Person("AMIT",97654321,"abc");
        System.out.println(p1.name);
        Person p2 = new Person("PRAMOD",98989898,"XYZ");
        System.out.println(p2.name);
//MAIN USE AND ADVANTAGE OF PARAMETRISED CONSTRUCTOR IS THAT AS SOON AS OBJECT IS CREATED, WE CAN SET THE VALUE OF VARIABLES OF CLASS
        System.out.println(p2.address);
//        Person p3  = new Person();
//        p3.name  = "Smita";
//        System.out.println(p3.name);
    }
}


class Person {

    String name;
    long phone;
    String address;

    Person(){

    }
    Person(String name_user){
        this.name = name_user;
    }

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
//IN THIS.NAME, this dot will be p1.name or p2.name according to the constructor called in main method
//REMEMBER CONSTRUCTOR WILL BE CREATED IN CLASS WHICH IS OUTSIDE THE MAIN METHOD AND CONSTRUCTOR WILL BE CALLED INSIDE MAIN METHOD
        this.address = address_user;
        this.phone = phone_user;

    }
    Person(String name_user,long phone_user){
        this.name = name_user;
        this.phone = phone_user;

    }

}
