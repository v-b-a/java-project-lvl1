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
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static String[][] generateGameData() {
        String[] questions = new String[Engine.getCountOfRound()];
        String[] answers = new String[Engine.getCountOfRound()];
        String[][] gameData = {questions, answers};
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber = Random.generateRandomNumber(MAX_NUMBER);
            questions[i] = randomNumber + "";
            answers[i] = checkNumberIsPrime(randomNumber);
        }
        return gameData;
    }

    private static String checkNumberIsPrime(int randomNumber) {
        int index = 0;
        int[] divisorRandomNumber = new int[2];
        for (int i = 1; i <= randomNumber; i++) {
            if (randomNumber % i == 0 && index < 2) {
                divisorRandomNumber[index++] = i;
            }
        }
        return divisorRandomNumber[1] == randomNumber ? "yes" : "no";
    }
}
