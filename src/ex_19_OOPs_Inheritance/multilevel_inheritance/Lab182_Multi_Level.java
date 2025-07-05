package ex_19_OOPs_Inheritance.multilevel_inheritance;

public class Lab182_Multi_Level {

    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        gf.gf();
//GrandFather can use only GrandFather class method

        System.out.println(" -- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();
//Father can use GrandFather and Father class methods

        System.out.println(" -- ");



        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();
//Son can use GrandFather, Father and Son class functions or methods



    }
}
