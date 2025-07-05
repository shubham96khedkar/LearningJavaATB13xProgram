package ex_19_OOPs_Inheritance.single_inheritance;

public class Lab181_real_si {
    public static void main(String[] args) {
//This is single inheritance
//Even if the CommonToAll class is in different Package,still Single Inheritance is possible
        TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        CommonToAll c1 = new CommonToAll();
        TestCase1 t3 = new TestCase1();
       CommonToAll c2 = new TestCase1();//Dynamic Dispatch
 //Above line is example of DYNAMIC DISPATCH in which Father reference can be present with the object of son
 //Father reference means CommonToAll c2 and object of son means "new TestCase1()"
    }
}
