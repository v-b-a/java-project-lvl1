package hexlet.code.games;

public class Calc {
    static final int MAX_VALUE = 3;
    private static final String GAME_NAME = "Calc";
    private static final  int ROUNDING_NUMBER = 100;

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void printExercise() {
        System.out.println("What is the result of the expression?");
    }

    public static String question() {
        int randomNumber1 = (int) Math.floor(Math.random() * ROUNDING_NUMBER);
        int randomNumber2 = (int) Math.floor(Math.random() * ROUNDING_NUMBER);
        int randomOperationNumber = (int) Math.floor(Math.random() * (MAX_VALUE - 1 + 1) + 1);
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
