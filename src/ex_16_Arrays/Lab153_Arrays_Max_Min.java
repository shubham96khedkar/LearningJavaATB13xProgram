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

    static int give_me_max(int[] array){
        int max = array[0];
        // logic
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
//REMEMBER that from line no. 17 to line no. 25, the variable name should be same everywhere i.e max or any other name
//otherwise it will show error if variable name is not same
    }

    static int give_me_min(int[] array){
        int min = array[0];
        // logic
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }
}
