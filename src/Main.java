import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberToBeGuessed = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        System.out.println("The computer has just picked a number(1-100)! Try to guess it!");
        int choice = 0;
        int counter = 0;
        while (choice != numberToBeGuessed) {
            System.out.print("Your guess: ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice < numberToBeGuessed) {
                System.out.println("Too low");
                counter++;
            } else if (choice > numberToBeGuessed) {
                System.out.println("Too high");
                counter++;
            } else {
                System.out.println("Congratulations! You guessed the number! Attempts: " + counter);
                return;
            }
        }

        sc.close();
    }

}