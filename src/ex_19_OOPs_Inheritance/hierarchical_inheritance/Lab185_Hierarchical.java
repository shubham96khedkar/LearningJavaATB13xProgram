package ex_19_OOPs_Inheritance.hierarchical_inheritance;

public class Lab185_Hierarchical {
    public static void main(String[] args) {

        Father f1 = new Father();
        Ruhani r1 = new Ruhani();

        r1.home();
        f1.home();

    Pramod p1 = new Pramod();
        p1.home();
    //    p1.l2() will not be possible

    Lucky l1 = new Lucky();
        l1.l2();
        l1.home();
        //l1.h2 will not be possible

}
}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Pramod extends Father{
    void h2(){
        System.out.println("h2 - Pramod");
    }
}

class Lucky extends Father{

    void l2(){
        System.out.println("Lucky");
    }
}

class Ruhani extends Father {
    void r1() {
        System.out.println("ruhani");
    }
    }