package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Progression {
    static final int COUNT_VALUES = 10;
    static final int MAX_VALUE = 10;
    private static final String GAME_NAME = "Progression";

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        String[][] gameData = getGameData();
        Engine.playGame(gameData, "What number is missing in the progression?");
    }

    private static String[][] getGameData() {
        String[][] gameData = new String[2][Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int stepProgression = Random.generateRandomNumber(MAX_VALUE);
            int elementProgression = Random.generateRandomNumber(MAX_VALUE);
            String progression = generateProgression(stepProgression,
                    elementProgression, COUNT_VALUES);
            int randomIndex = Random.generateRandomNumber(COUNT_VALUES) - 1;
            String[] fullProgression = progression.split(" ");
            gameData[1][i] = fullProgression[randomIndex];
            fullProgression[randomIndex] = "..";
            StringBuilder questionProgression = new StringBuilder();
            for (String s : fullProgression) {
                questionProgression.append(s).append(" ");
            }
            gameData[0][i] = questionProgression.toString();
        }
        return gameData;
    }

    private static String generateProgression(int stepProgression, int elementProgression,
                                                int lengthProgression) {
        StringBuilder fullProgression = new StringBuilder();
        for (int j = 0; j < lengthProgression; j++) {
            fullProgression.append(elementProgression).append(" ");
            elementProgression += stepProgression;
        }
        return fullProgression.toString();
    }
}
