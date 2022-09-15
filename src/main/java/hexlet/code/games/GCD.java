package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class GCD {
    private static final String GAME_NAME = "GCD";
    static final int MAX_NUMBER = 100;
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, GAME_DESCRIPTION);
    }

    private static String[][] generateGameData() {
        String[] questions = new String[Engine.getCountOfRound()];
        String[] answers = new String[Engine.getCountOfRound()];
        String[][] gameData = {questions, answers};
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber1 = Random.generateRandomNumber(MAX_NUMBER);
            int randomNumber2 = Random.generateRandomNumber(MAX_NUMBER);
            questions[i] = randomNumber1 + " " + randomNumber2;
            int dcgNumber = calculateDCGNumber(randomNumber1, randomNumber2);
            answers[i] = dcgNumber + "";
        }
        return gameData;
    }

    private static int calculateDCGNumber(int randomNumber1, int randomNumber2) {
        int cycleCount = Math.min(randomNumber1, randomNumber2);
        int dcgNumber = 0;
        for (int i = 1; i <= cycleCount; i++) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                dcgNumber = i;
            }
        }
        return dcgNumber;
    }
}
