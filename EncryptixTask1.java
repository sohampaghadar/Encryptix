package encryptix;
import java.util.Random;
import java.util.Scanner;

public class EncryptixTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
         
     int number = random.nextInt(100) + 1;
        
        int maximumNum = 100;
        int minimumNum = 1;
        int maxAttempt = 10;
        int score = 0;

        boolean play = true;

        while (play) {
            
            System.out.println("Welcome to Number Game");
            System.out.println("Guess a Number Between " + minimumNum + " and " + maximumNum);
            System.out.println("You have " + (maxAttempt) + " attempts to Guess a Number");

            int attemptsLeft = maxAttempt;

            while (attemptsLeft > 0) {
                System.out.println("Attempts left: " + attemptsLeft);
                System.out.println("Guess a Number: ");
                int guess = scanner.nextInt();

                if (guess > number) {
                 System.out.println("Too High! Try Again, you have " + (attemptsLeft) + " Attempt's left");
                } else if (guess < number) {
                 System.out.println("Too Low! Try Again, you have " + (attemptsLeft) + " Attempt's left");
                } else {
                    System.out.println("Congratulations!! You guessed correct after " + (maxAttempt - attemptsLeft + 1) + " tries. The number was " + number);
                    score += attemptsLeft;
                    System.out.println("Your score is : " + score);
                    break;
                }

                attemptsLeft--;
            }

            if (attemptsLeft == 0) {
                System.out.println("You are out of attempts. The number was " + number);
            }

            System.out.println("GAME OVER!! Your Score is " + score);
           
            System.out.println("Do you want to play again (y/n)");
            String playInput = scanner.next();
            play = playInput.equalsIgnoreCase("y");
        }

        System.out.println("Thank You For Playing :) ");
        scanner.close();
    }
}