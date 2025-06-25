package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        pramod_f1();
        return_int();
        boolean x=return_boolean();
        System.out.println(x);
       String s= return_String();
        System.out.println(s);

    }

    static void pramod_f1(){
        System.out.println("No Return");
    }

    static int return_int(){
        System.out.println("This is a normal function which return something.");
        System.out.println("This is a normal function which return something.");
        System.out.println("This is a normal function which return something.");
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }
    static float return_float_pi_value(){
        return 3.14f;
    }

    static long return_long(){
        return 10L;
    }

    static String return_String(){
        return "Pramod";
//WHATEVER IS WRITTEN IN FRONT OF RETURN THAT WILL GET PRINTED ONLY IF WE STORE THE VALUE OF FUNCTION{Written inside curly brackets after function name} ,IN SAME DATATYPE IN A VARIABLE AND THEN PRINT THAT VARIABLE INSIDE THE MAIN METHOD
}//For void, we can't store it and use it
}
