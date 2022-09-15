package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int COUNT_OF_ROUND = 3;

    public static int getCountOfRound() {
        return COUNT_OF_ROUND;
    }

    public static void playGame(String[][] gameData, String gameDescription) {
        String[] questions = gameData[0];
        String[] answers = gameData[1];
        Cli.greetingUser();
        System.out.println(gameDescription);
        for (int i = 0; i < COUNT_OF_ROUND; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (answers[i].equals(userAnswer)) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + answers[i] + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}

