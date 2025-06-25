package ex_09_Switch;

public class Lab095_Interview {
    public static void main(String[] args) {
//What is the output of this
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
     //We have not used variable a anywhere so it is just to confuse you
     //First it will match the exact case written beside switch in bracket and if that case is
     //not matched only then it will go to default otherwise not
        }
    }
}
