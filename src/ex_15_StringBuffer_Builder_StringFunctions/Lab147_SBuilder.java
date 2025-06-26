package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab147_SBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text.Append means to add
        sb.reverse();
        System.out.println(sb);
    }
}
