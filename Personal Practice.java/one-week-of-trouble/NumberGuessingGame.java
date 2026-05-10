import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1;

        int guess = 0;

        while (guess != secretNumber) {

            System.out.print("Guess a number between 1 and 10: ");
            guess = input.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too high");
            }

            else if (guess < secretNumber) {
                System.out.println("Too low");
            }

            else {
                System.out.println("Correct!");
            }
        }
    }
}