//Task 2 Exercise 2.3
import java.util.Scanner;
public class Great {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();
        String result = name.toUpperCase();
        System.out.println("Hello,"+ result + ",nice to meet you!");
    }
}
