package hexlet.code.games;

public class Progression {
    static final int roundingNumber = 10;
    private static final String GameName = "Progression";

    public static String getGameName() {
        return GameName;
    }

    public static void printExercise() {
        System.out.println("What number is missing in the progression?");
    }

    public static String question() {
        int startProgression = (int) Math.floor(Math.random() * (roundingNumber - 1 + 1) + 1);
        int stepProgression = (int) Math.floor(Math.random() * (roundingNumber - 1 + 1) + 1);
        int randomIndex = (int) Math.floor(Math.random() * roundingNumber);
        int[] array = new int[roundingNumber];
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
