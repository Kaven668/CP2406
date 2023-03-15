// Task 2 Exercise 2.6
import java.util.Scanner;
public class ChangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you first name and last name, separated by a space.");
        System.out.print("? ");
        String name = sc.nextLine();
        String[] result = name.split(" ");
        System.out.println("Your first name is " + result[0] + ", which has " + result[0].length() + " characters");
        System.out.println("Your last name is " + result[1] + ", which has " + result[1].length() + " characters");
        char firstName = result[0].charAt(0);
        char lastName = result[1].charAt(0);
        System.out.println("Your initials are " +firstName+lastName);


    }
}
