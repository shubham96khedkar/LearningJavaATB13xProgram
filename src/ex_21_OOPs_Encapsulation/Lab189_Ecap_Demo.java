package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {

    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
//        System.out.println(vwoLogin1.password);
//In line no.13 we cannot access the password because in GoodVWOLogin class, password is private in nature
//private means it will be accessed only in that class or GoodVWOLogin class and not in any other class
        vwoLogin1.setPassword("pass1234",false);
        String pass = vwoLogin1.getPassword();
        System.out.println(pass);

    }


}

class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username,String password) {
        this.password = password;
        this.username = username;
    }
}

class GoodVWOLogin{
    // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String username;
    private String password;
//In encapsulation the attributes or instance variables should be private in nature
//Here both username and password are totally encapsulated means they can be changed only by using the functions(getter and setter)

    //Creating Parametrised Constructor
    public GoodVWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }


    public String getUsername() {
        return username;
//For creating getter and setter,take the typing cursor in that class,then select private String name and private long bal then right click and then click on generate
//then click on getter and setter,then select both username and password and click on OK.Then it will create total 4 methods
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else {
            System.out.println("Can't change the password!");
        }
    }
    }

