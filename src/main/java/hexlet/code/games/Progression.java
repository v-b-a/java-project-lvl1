package hexlet.code.games;

public class Progression {
    private static String name = "Progression";

    public static String getName() {return name;}

    public static void printExercise() {
        System.out.println("What number is missing in the progression?");
    }

    public static String question() {
        int startProgression = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        int stepProgression = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        int randomIndex = (int) Math.floor(Math.random() * (10 - 0 + 0) + 0);
        int[] array = new int[10];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            array[i] = startProgression += stepProgression;
            if (i == randomIndex) {
                result.append(".. ");
            } else {
                result.append(array[i] + " ");
            }
        }
        System.out.println("Question: " + result);
        return array[randomIndex] + "";
    }
}
