public class CountNumber {
    public static int countNumber(int arr[][], int key) {
        int count = 0;
        int i = arr.length-1;
        int j = arr[0].length-1;

        for(i=0; i<arr.length; i++) {
            for(j=0; j<arr[0].length; j++) {
                if(arr[i][j] == key) {
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = { {1, 3, 6, 8},
                        {5, 7, 3, 4}
        };
        int key = 3;
        System.out.println((countNumber(arr, key))); 
    }
}
