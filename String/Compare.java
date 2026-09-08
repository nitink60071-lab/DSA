public class Compare {
    static void main() {
        // By using ==
        String name1 = "Nitin";
        String name2 = "Nitin";
        if(name1 == name2) {
            System.out.println("Both Strings are same");
        } else {
            System.out.println("Both Strings are different");
        }     // It Comapres the addresses of String

        //By Using .equals() =>
        String name3 = "Nitin";
        String name4 = "NITIN";  // It is case Sansitive
        if(name3 .equals(name4)) {
            System.out.println("Both Strings are same");
        } else {
            System.out.println("Both Strings are different");
        }

        // By using .equalsIgnoreCase() =>
        String name5 = "Nitin";
        String name6 = "NITIN";  //It is not case Sansitive, it ignores the Case...
        if(name5.equalsIgnoreCase(name6)) {
            System.out.println("Bot Strings are same");
        } else {
            System.out.println("Both Strings are Different");
        }

    }
}
