import java.util.*;

public class javaBasics {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        //System.out.println("Hello Nitin!");
        //System.out.println("Hello India\n");
        //System.out.print("Namste Bharat");


        /* System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");  */


        /* int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        String name = "Nitin";
        System.out.println(name);  */


        // print sum of 2 integers =>
        /* int a = 10;
        int b = 5;
        int sum = a+b;
        System.out.print(sum);  */


        // Input in java =>
        /* String input = sc.next();
        System.out.println(input);  */

        // print String =>
        /* String name = sc.nextLine();
        System.out.println(name);  */

        // print integer =>
        /* int num = sc.nextInt();
        System.out.println(num); */


        // sum of 2 integers =>
        /* int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        System.out.print(sum);  */


        // Calculate Area of Circle =>
        /* float rad = sc.nextFloat();
        float AOC = 3.14f * rad * rad;
        System.out.println(AOC);  */


        // convert float into integer =>
        /* float a = sc.nextFloat();
        int b = (int) a;
        System.out.println(b);  */


        // convert character into integer (ASCII Value) =>
        /* char ch = sc.next().charAt(0);
        int number = ch;
        System.out.println(number);  */


        // Average of 3 float numbers =>
        /* float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float average = (a+b+c)/3;
        System.out.println(average);  */


        // Question =>
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pen+pencil+eraser;
        System.out.println("Bill is :" + total);

        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% gst :" + newTotal);

    }
}
