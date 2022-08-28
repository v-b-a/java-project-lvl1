package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Even {
    private static final String GAME_NAME = "Even";
    private static final int MAX_EVEN_NUMBER = 100;
    private static String[] answers = new String[Engine.getCountOfRound()];

    public static void startGame() {
        String[] questions = generateQuestion();
        Engine.printExercise("Answer 'yes' if number even otherwise answer 'no'.");
        Engine.prayGame(questions, answers);
    }

    public static String getGameName() {
        return GAME_NAME;
    }

    private static String[] generateQuestion() {
        String[] arrayQuestion = new String[Engine.getCountOfRound()];
        String[] validAnswer = new String[Engine.getCountOfRound()];
        for (int i = 0; i < Engine.getCountOfRound(); i++) {
            int randomNumber = Random.generateRandomNumber(MAX_EVEN_NUMBER);
            arrayQuestion[i] = randomNumber + "";
            validAnswer[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        answers = validAnswer;
        return arrayQuestion;
    }

//    private static String[] validationQuestion(String[] question) {
//        String[] validAnswer = new String[Engine.getCountOfRound()];
//        for (int i = 0; i < Engine.getCountOfRound(); i++) {
//            validAnswer[i] = Integer.parseInt(question[i]) % 2 == 0 ? "yes" : "no";
//        }
//        return validAnswer;
//    }

}


