package hexlet.code.games;

public class Prime {
    static final int ROUNDING_NUMBER = 100;
    private static final String GAME_NAME = "Prime";

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void printExercise() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String question() {
        int randomNumber = (int) Math.floor(Math.random() * ROUNDING_NUMBER);
        int[] resultArray = new int[2];
        int resultArrayIndex = 0;
        for (int i = 1; i <= randomNumber; i++) {
            if (resultArray[1] != 0) {
                break;
            }
            if (randomNumber % i == 0) {
                resultArray[resultArrayIndex] = i;
                resultArrayIndex++;
            }
        }
        System.out.println("Question: " + randomNumber);
        if (resultArray[0] == 1 && resultArray[1] == randomNumber) {
            return "yes";
        } else {
            return "no";
        }
    }
}
