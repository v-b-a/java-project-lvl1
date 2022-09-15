package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - " + Cli.getGameName());
        System.out.println("2 - " + Even.getGameName());
        System.out.println("3 - " + Calc.getGameName());
        System.out.println("4 - " + GCD.getGameName());
        System.out.println("5 - " + Progression.getGameName());
        System.out.println("6 - " + Prime.getGameName());
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        System.out.println("Your choice: " + userChoice + "\n");
        switch (userChoice) {
            case "1" -> Cli.greetingUser();
            case "2" -> Even.startGame();
            case "3" -> Calc.startGame();
            case "4" -> GCD.startGame();
            case "5" -> Progression.startGame();
            case "6" -> Prime.startGame();
            default -> throw new Exception("Unknown number value: " + userChoice);
        }
    }
}
