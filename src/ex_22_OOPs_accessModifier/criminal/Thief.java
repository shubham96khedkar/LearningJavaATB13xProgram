package ex_22_OOPs_accessModifier.criminal;

import ex_22_OOPs_accessModifier.police.Cop;

public class Thief {

    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
//In above line thief.gun is valid because gun is public in Cop class and public means it can be used anywhere
//        thief.canIShoot();
//Above line is not valid because canIShoot method is protected and hence it is not accessible in different package
//Thief class is in criminal package and Cop class is in police package.Both package are different
        // thief.thisDefaultF1();




    }
}
