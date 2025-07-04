package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//Matrix means when rows and columns are equal
//If rows and columns are not equal then it is called as jagged array

        //1,2,3
        //4,5,6
        //7,8,9

        System.out.println(matrix.length);
//matrix.length will always show how many ROWS the matrix has.
//No need of this round brackets () after matrix.length

       for(int i = 0; i < matrix.length; i++){ //It will go from 0,1,2 row index
           for(int j = 0; j < matrix[i].length; j++ ){//It will go from 0,1,2 column index
               // System.out.print(matrix[i][j] + " | ");
//matrix[i].length means matrix[0].length i.e length of 0th index row i.e 3

               System.out.print("*");
//Remember that WE HAVE USED ONLY PRINT IN ABOVE LINE AND NOT PRINTLN
           }
           System.out.println();
       }

//FOR PROPERLY UNDERSTANDING THE PROGRAM, PUT DEBUGGER POINT AND DEBUG THE PROGRAM
    }
}