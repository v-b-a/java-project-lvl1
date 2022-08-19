package hexlet.code.games;

public class Even {
    static int roundingNumber = 100;
    private static final String name = "Even";

    public static String getName() {
        return name;
    }

    public static void printExercise() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static String question() {
        int randomNumber = (int) Math.floor(Math.random() * roundingNumber);
        System.out.println("Question: " + randomNumber);
        return randomNumber % 2 == 0 ? "yes" : "no";
    }

}
