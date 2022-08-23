package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Even {
    private static final String GAME_NAME = "Even";
    private static final int MAX_EVEN_NUMBER = 100;
    private static String[] questions = generateQuestion();
    private static String[] answers = validationQuestion(questions);

    public static void startGame() {
        Engine.printExercise("Answer 'yes' if number even otherwise answer 'no'.");
        Engine.setQuestion(questions);
        Engine.setAnswer(answers);
        Engine.prayGame();
    }

    public static String getGameName() {
        return GAME_NAME;
    }

    private static String[] generateQuestion() {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber = Random.generateRandomNumber(MAX_EVEN_NUMBER);
            arrayQuestion[i] = randomNumber + "";
        }
        return arrayQuestion;
    }

    private static String[] validationQuestion(String[] questions) {
        String[] validAnswer = new String[3];
        for (int i = 0; i < 3; i++) {
            validAnswer[i] = Integer.parseInt(questions[i]) % 2 == 0 ? "yes" : "no";
        }
        return validAnswer;
    }

}


