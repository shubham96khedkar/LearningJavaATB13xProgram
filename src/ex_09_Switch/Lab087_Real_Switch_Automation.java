package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use so that I will start the automation in that browser.

       // String browser = args[0];
        //Taking CLI input from user for String
        //System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        //We will convert the input to lower case because it is case sensitive
        //so that if we write capital "Chrome" then it will first convert "Chrome" in small "chrome"
        //then the case will match
        //If we don't write line no.19 and give input as "Chrome" then default case will be executed

        switch(browser){

            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                break;

            case "edge":
                System.out.println("Execute the Edge Code");
                break;

                default:
                System.out.println("I have no idea which browser is this");
                break;



        }

    }
}
