package ex_28_ENUM;

public enum Locators {
//this file will contain only all the locators that we have.

    page_input_email("#login-username"),//Separated by comma
    page_input_password("#login-password"),
    page_button("#btn");//Last locator must end with a semicolon ;

    private String locators;

    Locators(String locators){
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;
    }

}
