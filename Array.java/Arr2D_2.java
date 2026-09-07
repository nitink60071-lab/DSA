
public class Arr2D_2 {
    public static void main(String args[]) {
        int arr[][] = {
                        {1, 2},
                        {3, 5, 7},
                        {5, 7, 3, 5, 3},
                        {2, 5}
        };
        for(int rowIndex=0; rowIndex <= arr.length-1; rowIndex++) {
            for(int colIndex=0; colIndex <= arr[rowIndex].length-1; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }  
    }
    
}
