package ex_27_Static;

public class Lab208_Real {
    public static void main(String[] args) {
//This is how static is used in reality
    }
}

class ATB {

    static {
        System.out.println("Load the class?, I will execute");
    }

    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    private String name;// non static

    private String phone;

    public String getPhone() {
        return phone;
//In above 2 lines we have used getter and setter because name and phone are private variables
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    static String courseName = "ATB13x";
    static String mentorName = "Pramod";
//In above 2 lines, every student will have same common coursename and mentorname,that we have made as static

    static void doAssignment() {
//In above line do assignment is a common function for every student so we have made doassignment() as static method
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass() {
//In above line joining zoom for class is common for everyone so it made as static method
        System.out.println("Class Joined!");
    }

    void howTheyAssignment() {
//in above line every student will do assignment in different way therefore it is normal function or non static function
        System.out.println("It is different!");
    }

}


