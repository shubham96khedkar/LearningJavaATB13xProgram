package ex_04_Operators;

public class Lab052_Interview {
    public static void main(String[] args) {
        short s =  10;
        char c = 'A';
        String s1 = "A";
        System.out.println(s + c);// when char c is used with its similar data type(short) then it will act as integer
        System.out.println(c);//but when char c is alone then it will act as character
        System.out.println(c + c);//Because char and char are similar so it will add
        System.out.println(c + s1);//Because String and char are totally different so it will just combine
    }
}
