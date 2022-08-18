package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void exercise() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }
    public static String question() {
        int randomNumber = (int) Math.floor(Math.random() * 100);
        System.out.println("Question: " + randomNumber);
        String isEven = randomNumber % 2 == 0 ? "yes" : "no";
        return isEven;
    }

}