package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class GCD {
    private static final String GAME_NAME = "GCD";
    static final int MAX_NUMBER = 100;
    private static String[] questions = generateQuestion();
    private static String[] answers = validationQuestion(questions);

    public static void startGame(){
        Engine.printExercise("Find the greatest common divisor of given numbers.");
        Engine.setQuestion(questions);
        Engine.setAnswer(answers);
        Engine.prayGame();
    }
    private static String[] generateQuestion() {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber1 = Random.generateRandomNumber(MAX_NUMBER);
            int randomNumber2 = Random.generateRandomNumber(MAX_NUMBER);
            arrayQuestion[i] = randomNumber1 + " " + randomNumber2;
        }
        return arrayQuestion;
    }
    private static String[] validationQuestion(String[] questions) {
        String[] validAnswer = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            String[] randomNumber = questions[i].split(" ");
            int dcgNumber = 0;
            int cycleCount = Math.min(Integer.parseInt(randomNumber[0]), Integer.parseInt(randomNumber[1]));
            for (int j = 1; j <= cycleCount; j++) {
                if (Integer.parseInt(randomNumber[0]) % j == 0 && Integer.parseInt(randomNumber[1]) % j == 0) {
                    dcgNumber = j;
                }
            }
            validAnswer[i] = dcgNumber+"";
        }
        return validAnswer;
    }


    public static String getGameName() {
        return GAME_NAME;
    }
}
