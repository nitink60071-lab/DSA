import java.util.*;
public class Arr2D {
    public static void main(String args[]) {
        //2D Array =>
        int arr [][] = {
                            {1, 2},
                            {2, 3},
                            {3, 4},
                            {4, 5}
        };
        int rowLength = arr.length;
        int colLength = arr[0].length;

        for(int rowIndex = 0; rowIndex <= rowLength-1; rowIndex++) {
            for(int colIndex = 0; colIndex <= colLength-1; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }     
         
    }

    
}
