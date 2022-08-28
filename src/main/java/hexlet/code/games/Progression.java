package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Progression {
    static final int COUNT_VALUES = 10;
    private static final String GAME_NAME = "Progression";
    private static String[] answers = new String[Engine.getCountOfRound()];

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame() {
        Engine.printExercise("What number is missing in the progression?");
        int step = Random.generateRandomNumber(COUNT_VALUES);
//        String[] progression = getProgression(step, COUNT_VALUES);
        String[] question = generateQuestion();
        Engine.prayGame(question, answers);
    }

    private static String[] generateQuestion() {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];
        String[] validAnswer = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int step = Random.generateRandomNumber(COUNT_VALUES);
            String[] progressionInt = getProgression(step, COUNT_VALUES);
            int randomIndex = Random.generateRandomNumber(COUNT_VALUES) - 1;
            String[] array = progressionInt[i].split(" ");
            validAnswer[i] = array[randomIndex];
            array[randomIndex] = "..";
            StringBuilder result = new StringBuilder();
            for (String s : array) {
                result.append(s).append(" ");
            }
            arrayQuestion[i] = result.toString();
        }
        answers = validAnswer;
        return arrayQuestion;
    }

    private static String[] getProgression(int step, int length) {
        String[] fullNumberArray = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int start = Random.generateRandomNumber(length);
            int[] array = new int[length];
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

//    private static int[] getIndex() {
//        int[] indexArray = new int[Engine.getCountOfRound()];
//        for (int i = 0; i < Engine.getCountOfRound(); i++) {
//            int randomIndex = Random.generateRandomNumber(COUNT_VALUES) - 1;
//            indexArray[i] = randomIndex;
//        }
//        return indexArray;
//    }

//    private static String[] validationQuestion(String[] progressionInt, int[] indexInt) {
//        String[] validAnswer = new String[Engine.getCountOfRound()];
//        for (int i = 0; i < Engine.getCountOfRound(); i++) {
//            String[] array = progressionInt[i].split(" ");
//            validAnswer[i] = array[indexInt[i]];
//        }
//        return validAnswer;
//    }
}
