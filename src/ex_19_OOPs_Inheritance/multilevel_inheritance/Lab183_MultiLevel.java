package ex_19_OOPs_Inheritance.multilevel_inheritance;

public class Lab183_MultiLevel {
    public static void main(String[] args) {

        Son amit = new Son();
        // Son s1 = new Father();//Not Possible
        // Son s1 = new GrandFather();//Not Possible

        GrandFather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();
//Jis class ka object banaya uss class ki method call hogi
//In line no.10, Object is made of son class so son class  method i.e g1.home will be called

        GrandFather g2 = new Father();
        g2.home();
//In above line, Father's home method will be called because Father class object is made

        Father f2 = new Son();
        f2.home();
//In above line, Son class home method will be called because Son class object is made

        // WebDriver driver = new ChromeDriver();

        // Father f3 = new GrandFather();


    }

}
