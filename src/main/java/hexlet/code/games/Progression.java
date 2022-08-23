package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Progression {
    static final int countValues = 10;
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

    private static String[] generateQuestion(String[] progression, int[] index) {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            String[] array = progression[i].split(" ");
            array[index[i]] = "..";
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
            int start = Random.generateRandomNumber(countValues);
            int step = Random.generateRandomNumber(countValues);
            int[] array = new int[countValues];
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
            int randomIndex = Random.generateRandomNumber(countValues) - 1;
            indexArray[i] = randomIndex;
        }
        return indexArray;
    }

    private static String[] validationQuestion(String[] progression, int[] index) {
        String[] validAnswer = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            String[] array = progression[i].split(" ");
            validAnswer[i] = array[index[i]];
        }
        return validAnswer;
    }
}
