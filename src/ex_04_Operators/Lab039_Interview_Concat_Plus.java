package ex_04_Operators;

public class Lab039_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Rohit";
        String last_name = "Sharma";

        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // here + between first_name and last_name is acting as a concatenant so + between a and b will also
        //act as a concatenant.It will not add a and b but just combine them
        System.out.println(a + b + first_name + last_name);
        //But here + between a and b will add them and then the string will also be concatenated

        System.out.println(first_name + last_name +(a + b));
        // Now it will add a and b also after concatenation of string because of BODMAS rule
        //BODMAS -> Bracket of division,multiplication, addition,subtraction
    }
}
