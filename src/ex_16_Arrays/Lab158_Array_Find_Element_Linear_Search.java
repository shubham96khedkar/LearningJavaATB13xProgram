package ex_16_Arrays;

public class Lab158_Array_Find_Element_Linear_Search {
    public static void main(String[] args) {
//FIND THE ELEMENT 67 FROM THE ARRAY AND ALSO GIVE THE LOCATION OF THAT ELEMENT
        int[] a = {23, 43, 45, 67, 87, 90};
        //Location means index
        //Find the target 67, give index ?
        int target = 67;
        for (int i = 0; i < a.length ; i++) {
            if(target == a[i]){
                System.out.println(i);
            }
        }
    }
}
