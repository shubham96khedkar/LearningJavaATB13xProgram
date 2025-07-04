package ex_16_Arrays;

public class LabArrayCopy {
    public static void main(String[] args) {

        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
       System.arraycopy(original,0,copy,0, original.length);
//Note that c is small in arrarcopy
       //Copy from(Original array,from 0th index,operation is copy,in destination side copy from 0th index to original.length)
      //For printing use for loop
       for (int i=0; i< original.length;i++){
           System.out.println(copy[i]);

       }
    }
}
