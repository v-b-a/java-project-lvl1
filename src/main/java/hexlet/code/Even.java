package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void game() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int successfulAttemptCount = 0;
        while (successfulAttemptCount < 3) {
            int randomNumber = (int) Math.floor(Math.random() * 10);
            String isEven = randomNumber % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine();
            if (isEven.equals(userChoice)) {
                System.out.println("Correct");
                successfulAttemptCount++;
            } else {
                System.out.println("'" + userChoice + "'" + " is wrong answer ;(. Correct answer was " + "'" + isEven + "'");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
        }
        if (successfulAttemptCount == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }

    }
}
