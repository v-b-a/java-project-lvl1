package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {
    static final int OPERATIONS_COUNT = 3;
    private static final String GAME_NAME = "Calc";
    private static final int MAX_CALC_NUMBER = 100;

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, "What is the result of the expression?");
    }

    private static String[][] generateGameData() {
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
                case (1) -> {
                    question = randomNumber1 + " - " + randomNumber2;
                    answer = randomNumber1 - randomNumber2;
                }
                case (2) -> {
                    question = randomNumber1 + " + " + randomNumber2;
                    answer = randomNumber1 + randomNumber2;
                }
                default -> {
                    question = randomNumber1 + " * " + randomNumber2;
                    answer = randomNumber1 * randomNumber2;
                }
            }
            questions[i] = question;
            answers[i] = answer + "";
        }
        return gameData;
    }
}
