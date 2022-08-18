package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber);
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        if (gameNumber == 1) {
            Cli.greetingUser();
        } else if (gameNumber == 2 || gameNumber == 3 || gameNumber == 4 || gameNumber == 5) {
            Cli.greetingUser();
            Engine.game(gameNumber);
        }
    }
}
