package ex_14_String;

public class Lab135_String_Immutable {

    public static void main(String[] args) {
//STRING IS IMMUTABLE EXPLAINED BY BEST EXAMPLE
        String name = "Pramod"; // SCP
//        name.toUpperCase();
     //System.out.println(name);
//In line no.8 we did not reassign the value so if we print it in line no.9 then String will not be converted into uppercase
        name = name.toUpperCase(); // PRAMOD
//Line no.10 means this is how we reassign the value of String
//If we reassign the value, only then the String will be converted into uppercase otherwise not
        System.out.println(name);
    }
    }

