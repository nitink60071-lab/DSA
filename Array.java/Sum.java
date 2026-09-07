import java.util.*;

public class Sum {
    public static void main(String args[]) {

        // Sum of Array =>
        int arr[] = {2, 5, 8, 4, 6};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<=n-1; i++) {
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println("Total sum is: " + sum); 
    }
    
}
