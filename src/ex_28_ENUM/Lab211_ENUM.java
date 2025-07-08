package ex_28_ENUM;

public class Lab211_ENUM {

    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());


        System.out.println(API_URLs.vwo.getUrl());
        System.out.println(API_URLs.google.getUrl());

        int a = 10;

    }
}
