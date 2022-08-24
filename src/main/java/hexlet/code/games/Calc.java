package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {
    static final int OPERATIONS_COUNT = 3;
    private static final String GAME_NAME = "Calc";
    private static final int MAX_CALC_NUMBER = 100;
    private static String[] questions = generateQuestion();
    private static String[] answers = validationQuestion(questions);

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        Engine.printExercise("What is the result of the expression?");
        Engine.setQuestion(questions);
        Engine.setAnswer(answers);
        Engine.prayGame();
    }
    private static String[] generateQuestion() {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];

        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber1 = Random.generateRandomNumber(MAX_CALC_NUMBER);
            int randomNumber2 = Random.generateRandomNumber(MAX_CALC_NUMBER);
            int randomOperationNumber = Random.generateRandomNumber(OPERATIONS_COUNT);
            String result;
            if (randomOperationNumber == 1) {
                result = randomNumber1 + " - " + randomNumber2;
            } else if (randomOperationNumber == 2) {
                result = randomNumber1 + " + " + randomNumber2;
            } else {
                result = randomNumber1 + " * " + randomNumber2;
            }
            arrayQuestion[i] = result;
        }

        return arrayQuestion;
    }
    private static String[] validationQuestion(String[] question) {
        String[] validAnswer = new String[Engine.getCountOfRound()];
        int sum;
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            String[] simple = question[i].split(" ");
            if (simple[1].equals("-")) {
                sum = Integer.parseInt(simple[0]) - Integer.parseInt(simple[2]);
            } else if (simple[1].equals("+")) {
                sum = Integer.parseInt(simple[0]) + Integer.parseInt(simple[2]);
            } else {
                sum = Integer.parseInt(simple[0]) * Integer.parseInt(simple[2]);
            }
            validAnswer[i] = sum + "";
        }
        return validAnswer;
    }
}
