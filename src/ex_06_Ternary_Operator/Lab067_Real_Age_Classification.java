package ex_06_Ternary_Operator;

public class Lab067_Real_Age_Classification {
    public static void main(String[] args) {

        int age = 77;
       // age < 18 :- Minor
       // 18 < age < 65 :- Adult
        // age > 65 :- Senior Citizen

        String result = (age < 18) ? "Minor" : (age < 65) ?  "Adult" : "Senior Citizen";
        System.out.println(result);

    }
}
