package ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab232_Throws {

    public static void main(String[] args) {

    }

    static void t() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
//Remember throws is added to method or function to handle exception in the code written in that function
//And try catch is added to a block of code
    }

}
