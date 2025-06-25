package ex_05_Type_Casting;

public class Lab061_typeCasting_Used {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;
        //First decide which one is bigger int or float
        //float is bigger than int


        //int total = course + GST;//Implicit Narrowing not possible
        //trying to convert GST from float to int i.e bigger to smaller so narrowing
        int total1 = course + (int)GST;// Explicit narrowing is possible
        System.out.println(total1);
        //Here if we print total1 there will be data loss of 0.45 decimal

        //To prevent data loss we have to write thew following
        float total2 = course + GST;//Implicit Widening casting
        //trying to convert course from int to float i.e smaller to bigger so widening
        float total3 = (float)course + GST;//Explicit widening casting
        System.out.println(total2);
        System.out.println(total3);
        //To prevent data loss first we did implicit widening and then we did explicit widening
        //Now there will not be any data loss
        //so always use the bigger datatype



    }
}
