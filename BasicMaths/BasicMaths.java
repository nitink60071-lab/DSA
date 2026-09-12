public class BasicMaths {
    //Print Digits =>
    static void printDigits(int num) {
        while(num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;
        }
    }

    static int countDigits(int num) {
        int count = 0;
        while(num != 0) {
            int digit = num % 10;
            count ++;
            num = num/10;
        }
        return count;
    }

    static int sumDigits(int num) {
        int sum = 0;
        while( num != 0) {
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }

    static int reverseNum(int num) {
        int reverse = 0;
        while( num != 0) {
            int digit = num %10;
            reverse = (reverse*10) + digit;
            num = num/10;
        }
        return reverse;

    }

    static boolean  palindromeNum(int num) {
        int reverse = 0;
        int original = num;
        while( num != 0) {
            int digit = num% 10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        if(reverse != original) {
            return false;
        } else {
            return true;
        }
    }
    static void main() {
        /*int num = 67543;
        printDigits(num); */

        /* int num = 786549;
        System.out.println(countDigits(num));  */

        /*int num = 55464;
        System.out.println(sumDigits(num));*/

        /* int num = 7689;
        System.out.println("Reverse of number: " + reverseNum(num));  */

        int num = 1221;
        System.out.println(palindromeNum(num));
    }
}
