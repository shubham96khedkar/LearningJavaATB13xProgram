package ex_01_Java_Basic;

public class Lab008_Identifiers {
    public static void main(String[] args) {
        System.out.println("How many keywords you see in this program?,Identifier");

        /*
         * Keywords: package,public,class,static,void
         * Identifiers: ex_01_Java_Basic, Lab008_Identifiers,args
         * All these are names of package,class,variables etc.
         */

        /*Rules to follow when you define an Identifier**
        1. Identifier can contain Alphabets, Digits, and two special symbol i.e. Dollar ($), _,.
        2. Underscore (_).
        3. First character of an identifier must be an Alphabet or Dollar ($) or Underscore (_).
        4. Keywords or Reserved words **can't be used as Identifiers.**
         */
        System.out.println("Keywords in this program are 5");
        System.out.println("Identifiers in this program are 3");

       //123 cannot be name of the class bcoz it starts from no.and in rules of identifiers it is not allowed.
        //Remember class name is also a an Identifier
        //$123,  _123 is allowed as name of a class
        // only underscore _ cannot be name of a class and if we write then program will not run
        // Class can be name of a class as small class is a keyword and capital Class is an identifier
        //While writing class name, space is not allowed
        //Only $ and _ is allowed.Other special characters are not allowed in class name
        //abc(in small) can also be a class name
    }
}
