public class Methods {
    static void main() {

        //Some Methods of String =>
        String str = "Nitin";
        System.out.println(str.length()); // output = 5
        System.out.println(str.charAt(1)); // output = i
        
        String name = "NITIN";
        System.out.println(str.equals(name)); // False
        System.out.println(str.equalsIgnoreCase(name)); // True

        String str2 = "  ";
        System.out.println(str2.length()); // 2
        System.out.println(str2.isEmpty()); // false
        System.out.println(str2.isBlank()); // true

        String name2 = "  Nitin   ";
        System.out.println(name2.length());  // 10
        name2 = name2.trim();
        System.out.println(name2.length());  // 5

        String name3 = "Nitin";
        System.out.println(name3.toUpperCase());  // NITIN
        System.out.println(name3.toLowerCase());  // nitin

        String name4 = "My Name is Nitin Kumar";
        System.out.println(name4.substring(3, 6));  // Nam
        System.out.println(name4.contains("Nitin")); // true
        System.out.println(name4.contains("nitin")); // false

        int num = 2702;
        String strr = String.valueOf(num);
        System.out.println(num + 1);       // 2703
        System.out.println(strr + 1);      // 27021

        String name5 = "Nitin Kumar";
        System.out.println(name5.startsWith("Nitin"));  // true
        System.out.println(name5.startsWith("Kumar"));  // false
        System.out.println(name5.endsWith("Kumar")); // true

        String name6 = "Nitin";
        char[] crr = name6.toCharArray();
        //print the char array =>
        for(char ch: crr) {
            System.out.println("Value of char: " + ch);
        }

    }
}
