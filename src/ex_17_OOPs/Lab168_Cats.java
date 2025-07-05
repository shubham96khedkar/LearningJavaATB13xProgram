package ex_17_OOPs;

public class Lab168_Cats {

    Lab168_Cats(){
        System.out.println("DC- Main class");
//In line no.5, a constructor is created
    }

    public static void main(String[] args) {
        Cat c1=new Cat();
        new Cat();
//From above 2 lines, 2 objects will be created
        Cat c2;
//In line no.8, object will not be created

        c1.running();
       // c2.running();
//Here we can do c1.running() because object is created
//But we can't do c2.running() because object is not created
// And if object is not created then behaviour or method is not available
        new Cat().running();
//From above line we can do in this way also
    }


}

class Cat{

    String name;

    void running(){

        System.out.println("Running");
    }
}
