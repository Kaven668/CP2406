//Task 2 Exercise 2.4
import java.util.Scanner;
public class CountMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many quarters you have:");
        int quarters = sc.nextInt();
        System.out.println("Enter how many dimes you have:");
        int dimes = sc.nextInt();
        System.out.println("Enter how many nickels you have:");
        int nickels = sc.nextInt();
        System.out.println("Enter how many pennies you have:");
        int pennies = sc.nextInt();
        double result = (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.05) + (pennies * 0.01);
        System.out.printf("You have %.2f $",result);

    }
}
