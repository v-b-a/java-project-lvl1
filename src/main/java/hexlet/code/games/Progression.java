package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Progression {
    static final int COUNT_VALUES = 10;
    static final int MAX_VALUE = 10;
    private static final String GAME_NAME = "Progression";
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";

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
            int stepProgression = Random.generateRandomNumber(MAX_VALUE);
            int elementProgression = Random.generateRandomNumber(MAX_VALUE);
            String[] fullProgression = generateProgression(stepProgression,
                    elementProgression, COUNT_VALUES);
            int randomIndex = Random.generateRandomNumber(COUNT_VALUES) - 1;
            answers[i] = fullProgression[randomIndex];
            fullProgression[randomIndex] = "..";
            StringBuilder questionProgression = new StringBuilder();
            for (String s : fullProgression) {
                questionProgression.append(s).append(" ");
            }
            questions[i] = questionProgression.toString();
        }
        return gameData;
    }

    private static String[] generateProgression(int stepProgression, int elementProgression,
                                                int lengthProgression) {
        String[] progression = new String[lengthProgression];
        for (int j = 0; j < lengthProgression; j++) {
            progression[j] = elementProgression + "";
            elementProgression += stepProgression;
        }
        return progression;
    }
}
