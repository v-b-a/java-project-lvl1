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
        String[][] gameData = new String[2][Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber1 = Random.generateRandomNumber(MAX_CALC_NUMBER);
            int randomNumber2 = Random.generateRandomNumber(MAX_CALC_NUMBER);
            int randomOperationNumber = Random.generateRandomNumber(OPERATIONS_COUNT);
            String question;
            int correctAnswer;
            if (randomOperationNumber == 1) {
                question = randomNumber1 + " - " + randomNumber2;
                correctAnswer = randomNumber1 - randomNumber2;
            } else if (randomOperationNumber == 2) {
                question = randomNumber1 + " + " + randomNumber2;
                correctAnswer = randomNumber1 + randomNumber2;
            } else {
                question = randomNumber1 + " * " + randomNumber2;
                correctAnswer = randomNumber1 * randomNumber2;
            }
            gameData[0][i] = question;
            gameData[1][i] = correctAnswer + "";
        }
        return gameData;
    }
}
