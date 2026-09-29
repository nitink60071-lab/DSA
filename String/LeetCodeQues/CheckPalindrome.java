package LeetCodeQues;
public class CheckPalindrome {
    // Ques - 125 =>
    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPalindrome(str));
    }
}
