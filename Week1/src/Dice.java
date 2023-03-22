//Task 2 exercise 2.2
import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt(6);
        int b = rd.nextInt(6);
        System.out.println("The first die comes up " + (a + 1));
        System.out.println("The second die comes up " + (b +1));
        System.out.println("Your total roll is " + (a+b+2));

    }
}
