package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void game(String gameName) {
        String correctAnswer = null;
        int currentRound = 1;
        int countOfRound = 3;
        switch (gameName) {
            case "Even":
                Even.printExercise();
                break;
            case "Calc":
                Calc.printExercise();
                break;
            case "GCD":
                GCD.printExercise();
                break;
            case "Progression":
                Progression.printExercise();
                break;
            case "Prime":
                Prime.printExercise();
                break;
        }
        while (currentRound <= countOfRound) {
            switch (gameName) {
                case "Even":
                    correctAnswer = Even.question();
                    break;
                case "Calc":
                    correctAnswer = Calc.question();
                    break;
                case "GCD":
                    correctAnswer = GCD.question();
                    break;
                case "Progression":
                    correctAnswer = Progression.question();
                    break;
                case "Prime":
                    correctAnswer = Prime.question();
                    break;
            }
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct");
                currentRound++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
        }
        if (currentRound == 4) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
