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
        String[][] gameData = getGameData();
        Engine.playGame(gameData, "What is the result of the expression?");
    }

    private static String[][] getGameData() {
        String[][] questionsAndAnswers = new String[2][Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber1 = Random.generateRandomNumber(MAX_CALC_NUMBER);
            int randomNumber2 = Random.generateRandomNumber(MAX_CALC_NUMBER);
            int randomOperationNumber = Random.generateRandomNumber(OPERATIONS_COUNT);
            int calc;
            String result;
            if (randomOperationNumber == 1) {
                result = randomNumber1 + " - " + randomNumber2;
                calc = randomNumber1 - randomNumber2;
            } else if (randomOperationNumber == 2) {
                result = randomNumber1 + " + " + randomNumber2;
                calc = randomNumber1 + randomNumber2;
            } else {
                result = randomNumber1 + " * " + randomNumber2;
                calc = randomNumber1 * randomNumber2;
            }
            questionsAndAnswers[0][i] = result;
            questionsAndAnswers[1][i] = calc + "";
        }
        return questionsAndAnswers;
    }
}
