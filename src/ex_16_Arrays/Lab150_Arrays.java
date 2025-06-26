package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {

        int[] marks = {1, 2, 3, 4, 5, 6};

        // 2nd way to create the array by giving size
        int[] mark2 = new int[5]; // Fixed Size= 5,index from  0 to 4
        String[] names =  new String[3]; // Fixed Size = 3,index from 0 to 2
        names[0] = "pramod";
        names[1] = "Amit";
        names[2] = "Yasho";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
//        System.out.println(names[]);
//If we don't mention the index while printing, then it will show error
    }
}
