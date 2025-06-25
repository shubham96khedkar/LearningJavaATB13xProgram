package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
//Even if we don't reassign the value,it will print
        //append will add in the end
//As String Buffer is mutable in nature,the value Pramod will be replaced by PramodDutta
        System.out.println(stringBuffer);


        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
