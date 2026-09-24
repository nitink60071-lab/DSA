import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {
    public static void main(String[] args) {

        // Sorting in Ascending Order =>

        // int arr[] = {4, 6, 3, 8, 2, 9, 4};
        /* Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  */

        
        // Sort array (from-to) indexes =>
        /* int arr[] = {6, 8, 4, 9, 3, 2};
        Arrays.sort(arr, 0, 4);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }  */


        // Sort array in Descending order =>
        /*Integer arr[] = {5, 7, 3, 9, 2, 5, 6};
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }  */


        // Sort array in Descending order (from-to) indexes =>
        Integer arr[] = {5, 7, 3, 9, 2, 5, 6};
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

