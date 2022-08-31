package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Progression {
    static final int COUNT_VALUES = 10;
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
            int step = Random.generateRandomNumber(COUNT_VALUES);
            String[] progressionInt = getProgression(step);
            int randomIndex = Random.generateRandomNumber(COUNT_VALUES) - 1;
            String[] array = progressionInt[i].split(" ");
            gameData[1][i] = array[randomIndex];
            array[randomIndex] = "..";
            StringBuilder result = new StringBuilder();
            for (String s : array) {
                result.append(s).append(" ");
            }
            gameData[0][i] = result.toString();
        }
        return gameData;
    }

    private static String[] getProgression(int step) {
        String[] fullNumberArray = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int start = Random.generateRandomNumber(Progression.COUNT_VALUES);
            int[] array = new int[Progression.COUNT_VALUES];
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < array.length; j++) {
                array[j] = start;
                start += step;
                result.append(array[j]).append(" ");
            }
            fullNumberArray[i] = result.toString();
        }
        return fullNumberArray;
    }
}
