package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Prime {
    static final int MAX_NUMBER = 100;
    private static final String GAME_NAME = "Prime";
    private static String[] question = generateQuestion();
    private static String[] answers = validationQuestion(question);

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void startGame(){
        Engine.printExercise("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.setQuestion(question);
        Engine.setAnswer(answers);
        Engine.prayGame();
    }

    private static String[] generateQuestion() {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber = Random.generateRandomNumber(MAX_NUMBER);
            arrayQuestion[i] = randomNumber + "";
        }
        return arrayQuestion;
    }

    private static String[] validationQuestion(String[] question) {
        String[] validAnswer = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int[] resultArray = new int[2];
            int randomNumber = Integer.parseInt(question[i]);
            int resultArrayIndex = 0;
            for (int j = 1; j <= randomNumber; j++) {
                if (resultArray[1] != 0) {
                    break;
                }
                if (randomNumber % j == 0) {
                    resultArray[resultArrayIndex] = j;
                    resultArrayIndex++;
                }
            }
            if (resultArray[0] == 1 && resultArray[1] == randomNumber) {
                validAnswer[i] = "yes";
            } else {
                validAnswer[i] = "no";
            }
        }
        return validAnswer;
    }

}
