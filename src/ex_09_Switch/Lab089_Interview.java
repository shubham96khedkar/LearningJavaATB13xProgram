package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {
//Is this valid
        char ch = 'A';
        switch (ch){

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
                //This is valid as character act as integer and integer datatype is allowed for switch
//ASCII value of 'A' is 65

        }
    }
}
