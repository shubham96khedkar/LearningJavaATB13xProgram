package ex_12_Do_While;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args) {

        int a = 0;

//        while(a<0){
//            System.out.println(a);
//            a++;
//        }

        do {
            System.out.println(a);
            a++;

        } while (a < 0);
//In do while first it will print a=0 then do increment and then check the condition
    }
}
