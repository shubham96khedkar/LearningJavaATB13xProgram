package ex_22_OOPs_accessModifier.police;

public class JrCop {

    public static void main(String[] args) {
        Cop jrCop = new Cop(5);
        jrCop.canIShoot();
//Above line is valid because canIShoot method is protected and both canIShoot method and JrCop class are in same package
        jrCop.thisDefaultF1();
    }
}
