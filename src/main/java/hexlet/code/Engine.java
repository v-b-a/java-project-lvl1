package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    private static int currentRound = 0;
    static final int COUNT_OF_ROUND = 3;

    public static void game(String gameName) {
        String correctAnswer = " ";
        switch (gameName) {
            case "Even" -> {
                Even.printExercise();
                correctAnswer = Even.question();
            }
            case "Calc" -> {
                Calc.printExercise();
                correctAnswer = Calc.question();
            }
            case "GCD" -> {
                GCD.printExercise();
                correctAnswer = GCD.question();
            }
            case "Progression" -> {
                Progression.printExercise();
                correctAnswer = Progression.question();
            }
            case "Prime" -> {
                Prime.printExercise();
                correctAnswer = Prime.question();
            }
            default -> {
                return;
            }
        }
        while (currentRound < COUNT_OF_ROUND) {
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct");
                currentRound++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
        }
        if (currentRound == COUNT_OF_ROUND) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
