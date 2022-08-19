package hexlet.code.games;

public class Calc {
    static int roundingNumber = 100;
    private static final String name = "Calc";

    public static String getName() {
        return name;
    }

    public static void printExercise() {
        System.out.println("What is the result of the expression?");
    }

    public static String question() {
        int randomNumber1 = (int) Math.floor(Math.random() * roundingNumber);
        int randomNumber2 = (int) Math.floor(Math.random() * roundingNumber);
        int randomOperationNumber = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
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
