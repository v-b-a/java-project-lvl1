package hexlet.code.games;

public class Progression {
    private static final String gameName = "Progression";

    public static String getGameName() {
        return gameName;
    }

    public static void printExercise() {
        System.out.println("What number is missing in the progression?");
    }

    public static String question() {
        int roundingNumber = 10;
        int startProgression = (int) Math.floor(Math.random() * (roundingNumber - 1 + 1) + 1);
        int stepProgression = (int) Math.floor(Math.random() * (roundingNumber - 1 + 1) + 1);
        int randomIndex = (int) Math.floor(Math.random() * roundingNumber);
        int[] array = new int[10];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            array[i] = startProgression += stepProgression;
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
