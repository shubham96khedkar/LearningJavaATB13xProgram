package ex_13_Functions;

public class Lab129_Method_Functions {
    public static void main(String[] args) {

        //Step 2 -Call that Function INSIDE THE MAIN METHOD by writing name of that function followed by round brackets()
        f1();
        //
        name_of_function();
        retrn_int();

        int x=retrn_int();
        System.out.println(x);
//return means we  can store the result in a variable and use it later to print the retrn value
//return should match the data type with that of function
    }

    // Step 1- DEFINE THE FUNCTION OUTSIDE THE MAIN METHOD
    static void f1(){
//Void means it will not return anything
//Println will just print and not return anything
        System.out.println("Hi");
    }

    static void name_of_function(){
        System.out.println("THIS IS THE CODE THAT YOU WANT TO EXECUTE");
        System.out.println("THIS IS THE CODE THAT YOU WANT TO EXECUTE");
        System.out.println("THIS IS THE CODE THAT YOU WANT TO EXECUTE");
        System.out.println("THIS IS THE CODE THAT YOU WANT TO EXECUTE");
    }
    static int retrn_int(){
        System.out.println("This will return integer");
      return 10;
    }
}
