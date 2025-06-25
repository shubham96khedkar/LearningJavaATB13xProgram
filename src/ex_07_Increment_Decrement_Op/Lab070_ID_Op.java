package ex_07_Increment_Decrement_Op;

public class Lab070_ID_Op {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // 10+1 value assigned // Pre Increment
        System.out.println(a);
        System.out.println(b);
        //UPDATED value will be taken

        //Expression and Result Table(ERT)
        //Line No. | a | Result b
        // 5 | 10 | NA
        // 6 | 11 | 11
        // 7 | 11(NA) | 11
        // 8 | 11 | 11(NA)

    }
}
