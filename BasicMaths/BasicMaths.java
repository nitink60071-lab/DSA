public class BasicMaths {
    //Print Digits =>
    static void printDigits(int num) {
        while(num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;
        }
    }

    // Count digits of Numbers =>
    static int countDigits(int num) {
        int count = 0;
        while(num != 0) {
            int digit = num % 10;
            count ++;
            num = num/10;
        }
        return count;
    }

    // Print Sum of Digits =>
    static int sumDigits(int num) {
        int sum = 0;
        while( num != 0) {
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }

    // Print Reverse of Number =>
    static int reverseNum(int num) {
        int reverse = 0;
        while( num != 0) {
            int digit = num %10;
            reverse = (reverse*10) + digit;
            num = num/10;
        }
        return reverse;

    }

    // Check number is palindrome or not =>
    static void palindromeNum(int num) {
        int reverse = 0;
        int original = num;
        while( num != 0) {
            int digit = num% 10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        if(reverse == original) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    // Check Number is Prime or Not =>
    static boolean isPrime (int num) {
        for(int i=2; i<num; i++) {
            if( num%i == 0) {
                return false;
            }
        }
        return true;
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

        /*int num = 1221;
        palindromeNum(num);  */

        int num = 5;
        System.out.println("Number is Prime: " + isPrime(num));
    }
}
