package ex_30_Exceptions;

public class Lab219_String_NullPointer {

    public static void main(String[] args) {
        String name= null; // java.lang.NullPointerException because null String cannot be trimmed
        name.trim();
    }
}
