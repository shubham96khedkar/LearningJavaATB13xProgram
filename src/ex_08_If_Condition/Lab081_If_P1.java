package ex_08_If_Condition;

public class Lab081_If_P1 {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
// TAKING CLI INPUT
        if(age > 18){
            System.out.println("yes! you can go to goa");
        }else{
            System.out.println("No!you cannot go to goa");

        }
    }
}
