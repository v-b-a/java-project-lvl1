package hexlet.code.games;

public class Prime {
    static final int roundingNumber = 100;
    private static final String GameName = "Prime";

    public static String getGameName() {
        return GameName;
    }

    public static void printExercise() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String question() {
        int randomNumber = (int) Math.floor(Math.random() * roundingNumber);
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
