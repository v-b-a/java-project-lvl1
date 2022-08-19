package hexlet.code.games;

public class Calc {
    private static final String gameName = "Calc";

    public static String getGameName() {
        return gameName;
    }

    public static void printExercise() {
        System.out.println("What is the result of the expression?");
    }

    public static String question() {
        int roundingNumber = 100;
        int maxValue = 3;
        int randomNumber1 = (int) Math.floor(Math.random() * roundingNumber);
        int randomNumber2 = (int) Math.floor(Math.random() * roundingNumber);
        int randomOperationNumber = (int) Math.floor(Math.random() * (maxValue - 1 + 1) + 1);
        String result;
        int correctAnswerInt;
        if (randomOperationNumber == 1) {
            result = randomNumber1 + " - " + randomNumber2;
            correctAnswerInt = randomNumber1 - randomNumber2;
        } else if (randomOperationNumber == 2) {
            result = randomNumber1 + " + " + randomNumber2;
            correctAnswerInt = randomNumber1 + randomNumber2;
        } else {
            result = randomNumber1 + " * " + randomNumber2;
            correctAnswerInt = randomNumber1 * randomNumber2;
        }
        System.out.println("Question: " + result);
        return correctAnswerInt + "";

    }
}
