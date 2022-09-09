package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class GCD {
    private static final String GAME_NAME = "GCD";
    static final int MAX_NUMBER = 100;

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, "Find the greatest common divisor of given numbers.");
    }

    private static String[][] generateGameData() {
        String[][] gameData = new String[2][Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int dcgNumber = 0;
            int randomNumber1 = Random.generateRandomNumber(MAX_NUMBER);
            int randomNumber2 = Random.generateRandomNumber(MAX_NUMBER);
            gameData[0][i] = randomNumber1 + " " + randomNumber2;
            int cycleCount = Math.min(randomNumber1, randomNumber2);
            for (int j = 1; j <= cycleCount; j++) {
                if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                    dcgNumber = j;
                }
            }
            gameData[1][i] = dcgNumber + "";
        }
        return gameData;
    }
}
