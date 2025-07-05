package ex_18_OOPs_Constructor;

public class Lab177_PC {

    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);

//Below line is calling Parametrised constructor
        BabyA b3  = new BabyA("lucky","23454323",2025,07,01);
        BabyA b4  = new BabyA("amit","13454323",2024,07,01);
        System.out.println(b3.name);
        System.out.println(b4.name);
    }

}

class BabyA{

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    // DC
    BabyA(){
        name = "Gugu";
        aadhar_number = "0000";
        year = 1971;
        month = 01;
        day = 01;

    }
//Parametrised Constructor
    BabyA(String name_user,String aadhar_number_user,int year_user, int month_user,int day_user){
        this.name = name_user;//REMEMBER THIS.(THIS DOT) IS VERY VERY IMPORTANT IN PARAMETRISED CONSTRUCTOR
//In this.name in above line, name means line no.22 name and name_user means line no.38  one name_user
//So when we pass parameter in line no.12, lucky will come in place of name_user in line no. 38 and that lucky will also be passed in line no.39 in name_user
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
    }
}

