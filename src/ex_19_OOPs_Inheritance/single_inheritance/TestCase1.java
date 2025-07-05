package ex_19_OOPs_Inheritance.single_inheritance;

public class TestCase1 extends CommonToAll {
//This is Single Inheritance

    void runningTC1(){
//REMEMBER EXTENDS KEYWORD SHOULD BE USED FOR INHERITING METHODS FROM PARENT CLASS
        startBrowser();
        System.out.println("TC1 is running");
        closeBrowser();

    }

}
