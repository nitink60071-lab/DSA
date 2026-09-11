public class Ques {
    static void printString(String str) {
        //Print each character of the String =>
        int n = str.length();
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    // Count of Vowels =>
    static int getVowelsCount( String str1) {
        int count = 0;
        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                count ++;
            }
        }
        return count;
    }

    //Reverse of String =>
    static String reverseString(String str2) {
        String reverse = "";
        int n = str2.length();
        for(int i=n-1; i>=0; i--) {
            char ch = str2.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    //check palindrome or not =>
    static boolean checkPalindrome(String str3) {
        String reverse ="";
        int n = str3.length();
        for(int i=n-1; i>=0; i--) {
            char ch = str3.charAt(i);
            reverse = reverse + ch;
        }
        if(str3.equals(reverse)) {
            return true;
        }  else {
            return false;
        }
    }

    


    public static void main(String[] args) {
       /* String str = "Nitin";
       printString(str);  */

       /* String str1 = "Hello India, Welcome to Delhi";
       System.out.println(getVowelsCount(str1));  */

       /* String str2 = "Hello";
       System.out.println(reverseString(str2)); */

       String str3 = "nitin";
       System.out.println(checkPalindrome(str3));
    }
}
