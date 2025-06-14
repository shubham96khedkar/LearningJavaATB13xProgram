package ex_02_Java_Basics2;

public class Lab021_Constants {
    public static void main(String[] args) {
      final int aa = 10;
       // aa = 11;

        //Means first the value of aa was 10 and then aa is 11
        //But if we make aa as final then value of aa will not be changed
        System.out.println(aa);

        final float Pi = 3.14f;
        //Remember to add f in float value
        // Pi=13144;
        System.out.println(Pi);
    }
}
