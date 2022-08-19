package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    static int currentRound = 0;
    static int countOfRound = 3;

    public static void game(String gameName) {
        String correctAnswer;
        switch (gameName) {
            case "Even" -> Even.printExercise();
            case "Calc" -> Calc.printExercise();
            case "GCD" -> GCD.printExercise();
            case "Progression" -> Progression.printExercise();
            case "Prime" -> Prime.printExercise();
            default -> {
            }
        }
        while (currentRound <= countOfRound) {
            switch (gameName) {
                case "Even" -> correctAnswer = Even.question();
                case "Calc" -> correctAnswer = Calc.question();
                case "GCD" -> correctAnswer = GCD.question();
                case "Progression" -> correctAnswer = Progression.question();
                case "Prime" -> correctAnswer = Prime.question();
                default -> correctAnswer = " ";
            }
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct");
                currentRound++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " +
                        "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
        }
        if (currentRound == countOfRound) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
