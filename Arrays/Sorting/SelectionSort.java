public class SelectionSort {
    public static void main(String[] args) {
        
        // Code without using multiple Methods(Functions) =>
        int arr[] = {3, 6, 2, 8, 4, 9, 1};
        for(int i=0; i<arr.length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
