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

    public static void main(String[] args) {

        oddOrEven(4);

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
