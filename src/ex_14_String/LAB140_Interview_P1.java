package ex_14_String;

public class LAB140_Interview_P1 {
    public static void main(String[] args) {
//How many Strings are present in SCP
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
 //Only 1 string is present in String Constant pool because everyone will refer to Hello

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
//3 Strings are present in Object Area

        // SCP | OA
        // 1 | 3 -> total 4 Strings
    }
}
