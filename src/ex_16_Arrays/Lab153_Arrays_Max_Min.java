package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
//WHAT IS THE MAX AND MIN NO.IN ARRAY
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; // 0 to 9
//        Arrays.sort(array); // 14,15.......77
//        System.out.println(array[array.length - 1]);
        int max_output = give_me_max(array);
        int min_output = give_me_min(array);
        System.out.println(max_output);
        System.out.println(min_output);

    }
//First JVM will search for main method.Then it will go in line no.9 inside main method and search that method name in the program
//After matching method name it will pass input parameter as array i.e line no.6 and now the integer array will be passed in that method name in place of arrayz
//arrayz is a local variable and its life will bee only inside the brackets of that method
    static int give_me_max(int[] arrayz) {
        int max = arrayz[0];
        // logic
        for (int i = 0; i < arrayz.length; i++) {
            if (arrayz[i] > max) {
                max = arrayz[i];
            }
            //System.out.println(arrayz[]);
        }
        return max;
    }
//REMEMBER that from line no. 18 to line no. 27, the variable name should be same everywhere i.e max or any other name
//otherwise it will show error if variable name is not same


    static int give_me_min(int[] array2){
        int min = array2[0];
        // logic
        for (int i = 0; i < array2.length ; i++) {
            if(array2[i] < min){
                min = array2[i];
            }
        }

        return min;
    }
}
