package ex_20_OOPs_Polymorphism.method_overloading;

public class WebAutomation {

    public static void main(String[] args) {
//This is how method overloading in polymorphism is used
        Browser b1 = new Browser();
        b1.startBrowser("chrome");
    }
}


class Browser {
 //Same method name but different parameters line no.16 and 20

    void startBrowser() {
        System.out.println("Starting a default browser");
    }

    String startBrowser(String browser) {
        System.out.println("Starting browser " + browser);
        return browser;
    }
}
