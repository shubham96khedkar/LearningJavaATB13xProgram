package ex_29_Wrapper_Class;

public class Lab216_Wrapper {

    public static void main(String[] args) {
        Mobile iphone = new Mobile(1, "iphone 16",120000.00);
        Mobile samsung = new Mobile(2, "ultra 24",1350000.00);

        iphone.setPrice(200000.89);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();

        System.out.println(Covers.red.getColor());
    }
}


class Mobile extends OldPhone{
//In mobile class variables are private and wrapper class is also used because of encapsulation and we have used getter and setter

    private Integer phone;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    private String name;
    private Double price;
    static String mobile_carrier = "airtel";

    Mobile(){
//In above line there is a default constructor
        System.out.println("DC");
    }
    public Mobile(Integer phone, String name, Double price) {
// In above line there is a Parametrised constructor
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(this.name+this.phone+this
                .price);
    }

    static void switchOnAirplaneMode(){
//In above line we have a static method
        System.out.println("Common Airplane Mode");
    }

    void priceChange(Integer price){
//In above line there is method overloading.Same method names but different parameters
        System.out.println("Change price in Integers");
    }
    void priceChange(Double price){
//In above line also there is method overloading
        System.out.println("Change price in decimals");
    }

    @Override
    void calling(){
//In above line there is overriden method of calling() method in OldPhone class
        System.out.println("dialpad ->touch dialpad now!!");
    }
}

class OldPhone implements SIMCard{


    void calling(){
        System.out.println("dialpad");
    }

    @Override
    public void enterCard() {
        System.out.println("Card entered");
    }
}

enum Covers{
    red("red_pokeman"),
    blue("blue_pokeman");
    private String color;
    Covers(String color){
        this.color =color;
    }

    String getColor(){
        return this.color;
    }


    }

interface SIMCard{
    void enterCard();
}

