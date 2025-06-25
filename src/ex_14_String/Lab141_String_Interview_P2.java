package ex_14_String;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello"; // SCP -> 1


        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //  OA = 3

        // == is a Comparison operator -> String -> this check the locations reference
        System.out.println(s1 == s3);
 //s1 is present in String Constant pool SCP and s3 is present in Object Area so their locations are different so answer is false
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);//Objects are also present in different areas or locations so false

        System.out.println(s1 == s4);//true
        System.out.println(s3 == s5);

        // equals checks for  ( content) -> value

        System.out.println(s1.equals(s2));//content is equal so true
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));//false because of case sensitivity
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value
    }
}
