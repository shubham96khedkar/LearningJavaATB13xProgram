package ex_20_OOPs_Polymorphism.method_overriding;

public class Lab190_MethodOverriding_Automation {

    public static void main(String[] args) {

        ChromeTC c1 = new ChromeTC();
//Jis class ka object banaya,uss class ki same name method call hogi
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();


        // Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new Firefox();
        c3.openBrowser();


        // Firefox ff = new ChromeTC(); No relation between Firefox class and ChromeTC class

    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser!!");
    }
}

class ChromeTC extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser!!");
    }

}

class Firefox extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
    }

