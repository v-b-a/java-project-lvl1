package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Progression {
    static final int COUNT_VALUES = 10;
    private static final String GAME_NAME = "Progression";
    private static int[] index = getIndex();
    private static String[] progression = getProgression();
    private static String[] question = generateQuestion(progression, index);
    private static String[] answers = validationQuestion(progression, index);


    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        Engine.printExercise("What number is missing in the progression?");
        Engine.setQuestion(question);
        Engine.setAnswer(answers);
        Engine.prayGame();
    }

    private static String[] generateQuestion(String[] progressionInt, int[] indexInt) {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            String[] array = progressionInt[i].split(" ");
            array[indexInt[i]] = "..";
            StringBuilder result = new StringBuilder();
            for (String s : array) {
                result.append(s).append(" ");
            }
            arrayQuestion[i] = result.toString();
        }
        return arrayQuestion;
    }

    private static String[] getProgression() {
        String[] fullNumberArray = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int start = Random.generateRandomNumber(COUNT_VALUES);
            int step = Random.generateRandomNumber(COUNT_VALUES);
            int[] array = new int[COUNT_VALUES];
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

    private static int[] getIndex() {
        int[] indexArray = new int[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomIndex = Random.generateRandomNumber(COUNT_VALUES) - 1;
            indexArray[i] = randomIndex;
        }
        return indexArray;
    }

    private static String[] validationQuestion(String[] progressionInt, int[] indexInt) {
        String[] validAnswer = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            String[] array = progressionInt[i].split(" ");
            validAnswer[i] = array[indexInt[i]];
        }
        return validAnswer;
    }
}
