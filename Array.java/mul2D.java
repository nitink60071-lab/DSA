public class mul2D {
    public static void main(String args[]) {
        //multipication of 2D Array =>
        int arr[][] = { {1, 2, 3}, {1, 2, 3} };
        int ans = 1;
        for(int i=0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[i].length-1; j++) {
                int value = arr[i][j];
                ans = ans*value;
            }
        }
        System.out.println(ans); 
    }
    
}
