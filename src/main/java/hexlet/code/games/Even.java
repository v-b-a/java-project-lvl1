package hexlet.code.games;

public class Even {
    private static final String GAME_NAME = "Even";
    private static final int ROUNDING_NUMBER = 100;

    public static String getGameName() {
        return GAME_NAME;
    }

    public static void printExercise() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static String question() {
        int randomNumber = (int) Math.floor(Math.random() * ROUNDING_NUMBER);
        System.out.println("Question: " + randomNumber);
        return randomNumber % 2 == 0 ? "yes" : "no";
    }

}
