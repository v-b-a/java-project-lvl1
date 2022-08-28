package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class GCD {
    private static final String GAME_NAME = "GCD";
    static final int MAX_NUMBER = 100;
    private static String[] answers = new String[Engine.getCountOfRound()];

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        String[] questions = generateQuestion();
        Engine.printExercise("Find the greatest common divisor of given numbers.");
        Engine.prayGame(questions, answers);
    }

    private static String[] generateQuestion() {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];
        String[] validAnswer = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int dcgNumber = 0;
            int randomNumber1 = Random.generateRandomNumber(MAX_NUMBER);
            int randomNumber2 = Random.generateRandomNumber(MAX_NUMBER);
            arrayQuestion[i] = randomNumber1 + " " + randomNumber2;
            int cycleCount = Math.min(randomNumber1, randomNumber2);
            for (int j = 1; j <= cycleCount; j++) {
                if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                    dcgNumber = j;
                }
            }
            validAnswer[i] = dcgNumber + "";
        }
        answers = validAnswer;
        return arrayQuestion;
    }
//    private static String[] validationQuestion(String[] question) {
//        String[] validAnswer = new String[Engine.getCountOfRound()];
//        for (int i = 0; i < Engine.getCountOfRound(); i++) {
//            String[] randomNumber = question[i].split(" ");
//            int dcgNumber = 0;
//            int cycleCount = Math.min(Integer.parseInt(randomNumber[0]), Integer.parseInt(randomNumber[1]));
//            for (int j = 1; j <= cycleCount; j++) {
//                if (Integer.parseInt(randomNumber[0]) % j == 0 && Integer.parseInt(randomNumber[1]) % j == 0) {
//                    dcgNumber = j;
//                }
//            }
//            validAnswer[i] = dcgNumber + "";
//        }
//        return validAnswer;
//    }
}
