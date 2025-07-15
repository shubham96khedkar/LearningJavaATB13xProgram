package ex_30_Exceptions;

public class Lab227_Try_Catch_Finally {

    public static void main(String[] args) {
        //int a =Integer.parseInt(args[0]);
        int c = 0;
        try {
            int a =Integer.parseInt(args[0]);
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
          //  e.printStackTrace();
        } finally {
            System.out.println("I will be always executed!");
//FINALLY BLOCK WILL ALWAYS BE EXECUTED.IT DOES NOT MATTER WHETHER TRY BLOCK AND CATCH BLOCK RUNS OR DOES NOT RUN, BUT FINALLY WILL ALWAYS BE EXECUTED

        }

    }
}
