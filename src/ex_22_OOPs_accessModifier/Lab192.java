package ex_22_OOPs_accessModifier;

public class Lab192 {


}
class Father{
    private int gold = 10;
    int car = 1;
//In above line we have not written any access modifier which means it is default int car
    public int bhk3 = 1;
}

class Son extends Father{
    void weCanuse(){
//        System.out.println(gold);
//Above line is not valid because gold is private in Father class.
//Access modifier Private means it will be accessible in that class only or Father class only and not in Son class

        System.out.println(car);
//Above line is valid because default can be used outside the Father class also but within same class
        System.out.println(bhk3);
    }
}