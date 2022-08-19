package hexlet.code.games;

public class GCD {
    private static final String GameName = "GCD";
    static final int roundingNumber = 100;

    public static String getGameName() {
        return GameName;
    }

    public static void printExercise() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String question() {
        int randomNumber1 = (int) Math.floor(Math.random() * roundingNumber);
        int randomNumber2 = (int) Math.floor(Math.random() * roundingNumber);
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
