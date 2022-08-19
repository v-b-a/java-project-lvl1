package hexlet.code.games;

public class GCD {
    private static final String GAME_NAME = "GCD";
    static final int ROUNDING_NUMBER = 100;

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void printExercise() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String question() {
        int randomNumber1 = (int) Math.floor(Math.random() * ROUNDING_NUMBER);
        int randomNumber2 = (int) Math.floor(Math.random() * ROUNDING_NUMBER);
        int dcgNumber = 0;
        int cycleCount = Math.min(randomNumber1, randomNumber2);
        for (int i = 1; i <= cycleCount; i++) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                dcgNumber = i;
            }

        }
        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        return dcgNumber + "";
    }

}
