package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Even {
    private static final String GAME_NAME = "Even";
    private static final int MAX_EVEN_NUMBER = 100;
    private static final String GAME_DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, GAME_DESCRIPTION);
    }

    public static String getGameName() {
        return GAME_NAME;
    }

    private static String[][] generateGameData() {
        String[] questions = new String[Engine.getCountOfRound()];
        String[] answers = new String[Engine.getCountOfRound()];
        String[][] gameData = {questions, answers};
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber = Random.generateRandomNumber(MAX_EVEN_NUMBER);
            questions[i] = randomNumber + "";
            answers[i] = isEven(randomNumber) ? "yes" : "no";
        }
        return gameData;
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}


