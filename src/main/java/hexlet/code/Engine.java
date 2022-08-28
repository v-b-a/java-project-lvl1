package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int COUNT_OF_ROUND = 3;

    public static int getCountOfRound() {
        return COUNT_OF_ROUND;
    }

    public static void printExercise(String exercise) {
        Cli.greetingUser();
        System.out.println(exercise);
    }
    public static void prayGame(String[] questionsString, String[] validAnswers) {
        for (int i = 0; i < COUNT_OF_ROUND; i++) {
            System.out.println("Question: " + questionsString[i]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (validAnswers[i].equals(userAnswer)) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + validAnswers[i] + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}

