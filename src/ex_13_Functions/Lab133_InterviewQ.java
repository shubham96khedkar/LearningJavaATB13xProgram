package ex_13_Functions;

public class Lab133_InterviewQ {
    public static void main(String[] args) {

    }
//WE can have unlimited no. of main methods but only one main method will run which match with the main method signature that jvm search for i.e public static void main(String[] args){}
    public static void main(String args) {
        System.out.println("Yes");
    }
    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }
}
