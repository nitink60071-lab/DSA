import java.util.*;
public class Input {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Use of nextLine =>
        System.out.println("Provide the String Content: ");
        String str = sc.nextLine();
        System.out.println("Value by Using of nextLine: " + str);

        //Use of next =>
        System.out.println("Provide the String Content: ");
        String str2 = sc.next();
        System.out.println("Value by using of next: " + str2);
    }
    
}
