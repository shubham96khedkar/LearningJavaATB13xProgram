package ex_03_Literals;

public class Lab030_char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
        // All these are characters -> A to Z, a-z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("RohitSharma");
        System.out.println("Rohit" + new_line + "Sharma");//It will print in new line
        System.out.println("Rohit"+tab_line+"Sharma");//It will give space
        System.out.println("Rohit"+back_space+"Sharma");//It will do 1 character backspace
        System.out.println("Rohit is best"+carriage_return+"Sharma");//It will delete the previous sentence

        System.out.println("Hi, This is a First line"+new_line+"This is second line\nThis is Third line");
        //  \n should be used within double quote only

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c11  = '\u1F60';
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);


    }
}
