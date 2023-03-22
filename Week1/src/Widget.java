// Task 1 Chapter2 Question 14;
import java.util.Scanner;
public class Widget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many widgets you bought: ");
        int numbers = sc.nextInt();
        System.out.print("Enter how much for each: ");
        double price = sc.nextDouble();

        double totalPrice = numbers * price;
        System.out.printf("The total cost is %.2f $ ",totalPrice);

        System.out.println("Kevan");

    }
}

