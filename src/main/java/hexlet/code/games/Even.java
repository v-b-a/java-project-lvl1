package hexlet.code.games;

public class Even {
    private static final String GameName = "Even";

    public static String getGameName() {
        return GameName;
    }

    public static void printExercise() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static String question() {
        int roundingNumber = 100;
        int randomNumber = (int) Math.floor(Math.random() * roundingNumber);
        System.out.println("Question: " + randomNumber);
        return randomNumber % 2 == 0 ? "yes" : "no";
    }

}
