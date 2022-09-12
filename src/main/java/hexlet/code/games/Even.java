package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Even {
    private static final String GAME_NAME = "Even";
    private static final int MAX_EVEN_NUMBER = 100;

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, "Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static String getGameName() {
        return GAME_NAME;
    }

    private static String[][] generateGameData() {
        String[] questions = new String[Engine.getCountOfRound()];
        String[] answers = new String[Engine.getCountOfRound()];
        String[][] gameData = {questions, answers};
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int questionNumber = Random.generateRandomNumber(MAX_EVEN_NUMBER);
            questions[i] = questionNumber + "";
            answers[i] = checkEven(questionNumber);
        }
        return gameData;
    }

    private static String checkEven(int randomNumber) {
        return randomNumber % 2 == 0 ? "yes" : "no";
    }
}


