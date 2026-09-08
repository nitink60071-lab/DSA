public class maxValue {
    public static void main(String args[]) {

        //Maximum value of an array =>
        int arr[] = {6,7,8,4,2};
        int n = arr.length;
        int maxValue = arr[0];
        for(int i=0; i<=n-1; i++) {
            if(maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("Maximum Value is: " + maxValue);
    }
}
