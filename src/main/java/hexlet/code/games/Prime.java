package hexlet.code.games;

public class Prime {
    private static final String gameName = "Prime";

    public static String getGameName() {
        return gameName;
    }

    public static void printExercise() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String question() {
        int roundingNumber = 100;
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
