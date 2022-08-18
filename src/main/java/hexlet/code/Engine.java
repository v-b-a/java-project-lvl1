package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static void game(int gameNumber) {
        String correctAnswer = null;
        int successfulAttemptCount = 0;
        int countOfRound = 3;
        if (gameNumber == 2) {
            Even.exercise();
        } else if (gameNumber == 3) {
            Calc.exercise();
        } else if (gameNumber == 4) {
            GCD.exercise();
        } else if (gameNumber == 5) {
            Progression.exercise();
        }
        while (successfulAttemptCount < countOfRound) {
            if (gameNumber == 2) {
                correctAnswer = Even.question();
            } else if (gameNumber == 3) {
                correctAnswer = Calc.question();
            } else if (gameNumber == 4) {
                correctAnswer = GCD.question();
            } else if (gameNumber == 5) {
                correctAnswer = Progression.question();
            }
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine();
            if (correctAnswer.equals(userChoice)) {
                System.out.println("Correct");
                successfulAttemptCount++;
            } else {
                System.out.println("'" + userChoice + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
        }
        if (successfulAttemptCount == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }

//    public static void question(int text) {
//        System.out.println("Question: " + text);
////        return "Question: " + text;
//    }
//    public static String answer() {
//        System.out.print("Your answer: ");
//        Scanner scanner = new Scanner(System.in);
//        String userChoice = scanner.nextLine();
//        return userChoice;
//    }
//    public static void answerHandler(String userAnswer, String isEven) {
//
//        if (isEven.equals(userAnswer)) {
//            System.out.println("Correct");
//            successfulAttemptCount++;
//        } else {
//            System.out.println("'" + userChoice + "'" + " is wrong answer ;(. Correct answer was " + "'" + isEven + "'");
//            System.out.println("Let's try again, " + Cli.getUserName() + "!");
//            break;
//        }
//    }
}
