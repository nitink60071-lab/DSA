public class InsertionSort {
    /* public static void main(String[] args) {
        int arr[] = {5, 3, 7, 2, 8, 1};
        for(int i=1; i<arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while( j >= 0 && arr[j] > key) {
                arr [j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }  */


    // Insertion Sort using for loop =>
    public static void main(String[] args) {
        int arr[] = {7, 5, 3, 9, 2, 8};
        for(int i=1; i<arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            for( j = i-1; j>=0 && arr[j] > key; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
