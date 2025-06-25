package ex_14_String;

public class Lab137_String_Imm {
    public static void main(String[] args) {

        String s1 = "hello";
       s1.concat("world");
        System.out.println(s1);
 //In line no.7 we did not reassign the value so it did not add world in the end

        s1 = s1.concat("world"); // Concat, basically add the value or merge the value in the end.
 //In line no.11 we have reassigned the value so now it will add world also after hello
        System.out.println(s1);
    }
}
