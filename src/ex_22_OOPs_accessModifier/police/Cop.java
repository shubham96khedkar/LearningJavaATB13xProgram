package ex_22_OOPs_accessModifier.police;

public class Cop {

    public int gun;
    private String iCard;

//In below line we have created a parametrised constructor
    public Cop(int bullet) {
        this.gun = bullet;
    }

    // Method and / Behav
    protected void canIShoot() {
        System.out.println("Yes you can !!");
    }

    void thisDefaultF1() {
        System.out.println("Hi, Cop!");
    }
}