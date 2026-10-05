public class BitManipulation {

    // check number is even or odd =>
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            // even 
            System.out.println("even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }


    //Get ith bit =>
    public static int ithBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println(ithBit(10, 4));
        System.out.println(ithBit(10, 3));

        /* oddOrEven(4);
        oddOrEven(5);
        oddOrEven(67);  */

        /*
        //Binary AND (&) Operator =>
        System.out.println((5&6));

        //Binary OR (|) Operator =>
        System.out.println((5|6));

        //Binary XOR (^) Operator =>
        System.out.println((5^6));

        //Binary One's Complement =>
        System.out.println((~5));

        //Binary Left Shift =>
        System.out.println((5<<2));

        //Binary Left Shift =>
        System.out.println((5>>2));
        */
    }
}
