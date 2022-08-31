package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int COUNT_OF_ROUND = 3;

    public static int getCountOfRound() {
        return COUNT_OF_ROUND;
    }

    public static void playGame(String[][] gameData, String exercise) {
        Cli.greetingUser();
        System.out.println(exercise);
        for (int i = 0; i < COUNT_OF_ROUND; i++) {
            System.out.println("Question: " + gameData[0][i]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (gameData[1][i].equals(userAnswer)) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + gameData[1][i] + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}

