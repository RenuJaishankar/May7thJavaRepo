package Lesson;
import java.util.Scanner;
//Hackerrank challenge
//In this challenge, you must read an
// integer, a double, and a String from stdin, then print the values according to the instructions in the output format
//On the first line, print String: followed by the unaltered String read from stdin.
// On the second line, print Double: followed by the unaltered double read from stdin.
// On the third line, print Int: followed by the unaltered integer read from stdin.
public class Lesson {

public static void main(String[] args) {
Scanner a = new Scanner(System.in);
    System.out.println("Enter value for the integer");
    int i = a.nextInt();
    System.out.println("Enter value for the double ");
    double d = a.nextDouble();
    a.nextLine();
    System.out.println("Enter value for the String");
    String s = a.nextLine();

    System.out.println("String: " + s);

    System.out.println("Double: " + d);

    System.out.println("Int: " + i);
   a.close();
}

}
