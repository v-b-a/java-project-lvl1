package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Prime {
    static final int MAX_NUMBER = 100;
    private static final String GAME_NAME = "Prime";

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        String[][] gameData = getGameData();
        Engine.playGame(gameData, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static String[][] getGameData() {
        String[][] gameData = new String[2][Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber = Random.generateRandomNumber(MAX_NUMBER);
            gameData[0][i] = randomNumber + "";
            int index = 0;
            int[] dividersRandomNumber = new int[2];
            for (int j = 1; j <= randomNumber; j++) {
                if (dividersRandomNumber[1] != 0) {
                    break;
                }
                if (randomNumber % j == 0) {
                    dividersRandomNumber[index++] = j;
                }
            }
            if (dividersRandomNumber[0] == 1 && dividersRandomNumber[1] == randomNumber) {
                gameData[1][i] = "yes";
            } else {
                gameData[1][i] = "no";
            }
        }
        return gameData;
    }
}
