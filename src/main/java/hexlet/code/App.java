package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] menuItems = {Cli.getGameName(), Even.getGameName(), Calc.getGameName(),
                GCD.getGameName(), Progression.getGameName(), Prime.getGameName(), "Exit"};
        for (int i = 1; i <= menuItems.length; i++) {
            System.out.println(i + " - " + menuItems[i - 1]);
        }
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice: " + userChoice);
        System.out.println("");
        if (userChoice == 1) {
            Cli.greetingUser();
        } else if (userChoice == 0) {
            return;
        } else {
            Cli.greetingUser();
            Engine.game(menuItems[userChoice - 1]);
        }
    }
}
