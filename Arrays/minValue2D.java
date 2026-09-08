public class minValue2D {
    public static void main(String args[]) {
        //find min value in 2D Array =>
        int arr [][] = {{3, 5, 7}, {4, 2, 8}};
        int minValue = arr[0][0];
        for(int i=0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[i].length-1; j++) {
                if(arr[i][j] < minValue) {
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println("Minimum value is: "+ minValue);
    }
    
}
