package ex_07_Increment_Decrement_Op;

public class Lab071_Post_ID {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a);
        System.out.println(a);
        // line no. | a |
        // 6 | 10 |
        // 7 | 11 |
        // 8 | 11

        // // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        //UPDATED VALUE will be taken of variable
        // ERT
        //Line No. | a_post | print
        //15 | 10 | NA
        //16 |  11 | 10

    }



}
