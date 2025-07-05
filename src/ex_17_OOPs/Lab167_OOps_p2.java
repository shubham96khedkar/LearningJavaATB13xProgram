package ex_17_OOPs;

public class Lab167_OOps_p2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2;
//From above 2 lines,the references will be 2 but Object creation will be once
//Or we can say only one time constructor will be called
        new Student();
 //Line no.10 is also object creation but without reference

    }//Main method bracket is closed here
}//Class bracket is closed here

class Student{

    String name;
    
//Line no.20 is called as default constructor which has same name as class name
    Student(){
        System.out.println("DC");
//DC means default constructor
    }

    void sleep(){
        System.out.println("Hi");

    }

}

class A{

};

class B{

};
//There will only be one public class but there can be unlimited no. of classes inside that public class