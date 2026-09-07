import java.util.*;
public class Input {
    public static void main(String args[]) {
        // Input in Array =>
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i=0; i<=n-1; i++) {
            System.out.println("Enter number of index " + i);
            arr[i] = sc.nextInt();
        }
        //print 
        System.out.println("Your Array is: ");
        for(int i=0; i<=n-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
