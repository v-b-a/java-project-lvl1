package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {
    static final int OPERATIONS_COUNT = 3;
    private static final String GAME_NAME = "Calc";
    private static final int MAX_CALC_NUMBER = 100;
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final int SUBTRACTION = 1;
    private static final int ADDITION = 2;
    private static final int MULTIPLICATION = 3;

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() throws Exception {
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, GAME_DESCRIPTION);
    }

    private static String[][] generateGameData() throws Exception {
        String[] questions = new String[Engine.getCountOfRound()];
        String[] answers = new String[Engine.getCountOfRound()];
        String[][] gameData = {questions, answers};
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber1 = Random.generateRandomNumber(MAX_CALC_NUMBER);
            int randomNumber2 = Random.generateRandomNumber(MAX_CALC_NUMBER);
            int operationNumber = Random.generateRandomNumber(OPERATIONS_COUNT);
            String question;
            int answer;
            switch (operationNumber) {
                case (SUBTRACTION) -> {
                    question = randomNumber1 + " - " + randomNumber2;
                    answer = randomNumber1 - randomNumber2;
                }
                case (ADDITION) -> {
                    question = randomNumber1 + " + " + randomNumber2;
                    answer = randomNumber1 + randomNumber2;
                }
                case (MULTIPLICATION) -> {
                    question = randomNumber1 + " * " + randomNumber2;
                    answer = randomNumber1 * randomNumber2;
                }
                default -> throw new Exception("Unknown number value: " + operationNumber);
            }
            questions[i] = question;
            answers[i] = answer + "";
        }
        return gameData;
    }
}
