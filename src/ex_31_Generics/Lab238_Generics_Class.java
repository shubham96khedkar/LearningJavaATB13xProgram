package ex_31_Generics;

public class Lab238_Generics_Class {

    public static void main(String[] args) {
        GenericClass g = new GenericClass(10);
        GenericClass g1 = new GenericClass("Pramod");
        GenericClass g2= new GenericClass(true);
        GenericClass g3 = new GenericClass(3.14);
//From above 4 lines we can pass any datatype as a parameter in parametrised constructor using generics
        // T -> it is placeholder only -> it can be any data type.

    }
}


class GenericClass<T>{
// Remember to write this <T>.So a class can also be generic.
    private T data;

    public GenericClass(T data) {
//In above line there is a parametrised constructor
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
//In line no.25 and 29,we have getter and setter
        this.data = data;
    }
}
