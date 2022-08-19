package hexlet.code.games;

public class Progression {
    static final int ROUNDING_NUMBER = 10;
    private static final String GAME_NAME = "Progression";

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void printExercise() {
        System.out.println("What number is missing in the progression?");
    }

    public static String question() {
        int startProgression = (int) Math.floor(Math.random() * (ROUNDING_NUMBER - 1 + 1) + 1);
        int stepProgression = (int) Math.floor(Math.random() * (ROUNDING_NUMBER - 1 + 1) + 1);
        int randomIndex = (int) Math.floor(Math.random() * ROUNDING_NUMBER);
        int[] array = new int[ROUNDING_NUMBER];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            array[i] = startProgression;
            startProgression += stepProgression;
            if (i == randomIndex) {
                result.append(".. ");
            } else {
                result.append(array[i]).append(" ");
            }
        }
        System.out.println("Question: " + result);
        return array[randomIndex] + "";
    }
}
