package ex_28_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(PROJECT_NAMES.google);
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//By the use of ENUM there is no need to have a separate class for storing the fixed values or similar constant values
}

enum PROJECT_NAMES{
    google, restassured, katalon, vwo
}

//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}


