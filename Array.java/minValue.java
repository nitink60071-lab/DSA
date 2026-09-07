public class minValue {
    public static void main(String args[]) {

        //Minimum Value of an array =>
        int arr[] ={2, 4, 6, 1, 8};
        int n = arr.length;
        int minValue = arr[0];

        for(int i=0; i<=n-1; i++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Minimum value is: " + minValue);
    }
    
}
