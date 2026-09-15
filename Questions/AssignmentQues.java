public class AssignmentQues {

    // Check Duplicate numbers in Array =>
    public static boolean containsDuplicate(int numbers[]) {
        int n = numbers.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 6, 4};
        System.out.println(containsDuplicate(numbers));
    }
}

