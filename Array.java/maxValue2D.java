public class maxValue2D {
    public static void main(String args[]) {
        //max value in 2D Array =>
        int arr[][] = { {2, 5, 8}, {4, 9, 3} };
        int maxValue = arr[0][0];
        for(int i=0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[i].length-1; j++) {
                if(maxValue < arr[i][j]) {
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("Max value is: " + maxValue);
    }
    
}
