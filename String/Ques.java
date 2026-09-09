public class Ques {
    static void printString(String str) {
        //Print each character of the String =>
        int n = str.length();
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }


    static void main() {
       String str = "Nitin";
       printString(str);
    }
}
